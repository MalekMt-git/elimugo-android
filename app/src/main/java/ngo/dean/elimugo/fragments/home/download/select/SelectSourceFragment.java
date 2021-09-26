package ngo.dean.elimugo.fragments.home.download.select;

import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.tbruyelle.rxpermissions2.RxPermissions;

import ngo.dean.elimugo.R;

public class SelectSourceFragment extends Fragment {

    private SelectSourceViewModel model;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        model = new ViewModelProvider(this).get(SelectSourceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_select_source, container, false);

        bindNavigation(root);


        return root;
    }

    private void bindNavigation(View root) {
        final Button website = root.findViewById(R.id.websiteSource);
        website.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_select_to_website));


        final Button mobileSource = root.findViewById(R.id.mobileSource);



        mobileSource.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.qr_scan_camera));




    }


}