package ngo.dean.elimugo.fragments;

import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.google.android.material.appbar.AppBarLayout;

import java.util.Objects;

import ngo.dean.elimugo.R;
import ngo.dean.elimugo.databinding.FragmentSplashScreenBinding;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * @author amtta
 */
public class SplashScreenFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {






        ngo.dean.elimugo.databinding.FragmentSplashScreenBinding binding = FragmentSplashScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);







        Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        anim.setStartOffset(2000);

        view.startAnimation(anim);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {



            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Navigation.findNavController(view).navigate(R.id.action_splashScreenFragment_to_selectLanguageFragment);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}