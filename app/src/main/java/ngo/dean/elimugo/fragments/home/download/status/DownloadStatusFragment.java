package ngo.dean.elimugo.fragments.home.download.status;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

import ngo.dean.elimugo.R;
import ngo.dean.elimugo.repositories.models.ContentModule;

public class DownloadStatusFragment extends Fragment {
    private static final String TAG = "DownloadStatusFragment";
    private final int WRITE_STORAGE_PERMISSION = 1;

    private DownloadStatusViewModel viewModel;
    private ContentModule[] targetModules;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_download_status, container, false);
        viewModel = new ViewModelProvider(this).get(DownloadStatusViewModel.class);

        final ProgressBar downloadProgress = root.findViewById(R.id.progressBar);
        final TextView downloadStatus = root.findViewById(R.id.downloadStatus);
        viewModel.getDownloadProgress().observe(getViewLifecycleOwner(),
            value -> {
                downloadProgress.setProgress(value.intValue());
                downloadStatus.setText(value < 100 ? R.string.download_status_fragment_download_in_progress : R.string.download_status_fragment_download_complete);

                if (downloadProgress.getVisibility() == View.INVISIBLE) {
                    downloadProgress.setVisibility(View.VISIBLE);
                }
            });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        targetModules = DownloadStatusFragmentArgs.fromBundle(getArguments()).getContentPackages();

        if (ContextCompat.checkSelfPermission(this.getContext(), Manifest.permission.MANAGE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            viewModel.checkModuleValidity(targetModules);
        } else {
            requestStoragePermission();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == WRITE_STORAGE_PERMISSION && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            viewModel.checkModuleValidity(targetModules);
        } else {
            Toast.makeText(requireContext(),"Please give the Permissions" , Toast.LENGTH_LONG).show();
        }
    }

    private void requestStoragePermission() {
        if (shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            new AlertDialog.Builder(this.requireContext())
                    .setTitle("Permission required")
                    .setMessage("Access to your files is required to download content modules.")
                    .setPositiveButton("ok", (dialog, which) -> requestPermissions(new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE }, WRITE_STORAGE_PERMISSION))
                    .setNegativeButton("cancel", (dialog, which) -> dialog.dismiss())
                    .create()
                    .show();
        } else {
            requestPermissions(new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE }, WRITE_STORAGE_PERMISSION);
        }
    }

}
