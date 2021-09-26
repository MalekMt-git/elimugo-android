package ngo.dean.elimugo.fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Objects;

import ngo.dean.elimugo.MainActivity;
import ngo.dean.elimugo.R;
import ngo.dean.elimugo.databinding.FragmentSelectLanguageBinding;


public class SelectLanguageFragment extends Fragment {





    FragmentSelectLanguageBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSelectLanguageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        binding.buttonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setLocale(requireActivity(),"en");


                Navigation.findNavController(view).navigate(R.id.action_selectLanguageFragment_to_nav_home);


                MainActivity.setToolbarVisibility(View.VISIBLE);

            }
        });


        binding.buttonKiswahili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale(requireActivity(),"sw");


                Navigation.findNavController(view).navigate(R.id.action_selectLanguageFragment_to_nav_home);


                MainActivity.setToolbarVisibility(View.VISIBLE);

            }
        });

    }

    public static void setLocale(Activity activity, String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }
}