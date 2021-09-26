package ngo.dean.elimugo.fragments.home;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

import ngo.dean.elimugo.BuildConfig;
import ngo.dean.elimugo.R;

public class HomeFragment extends Fragment {

    private HomeViewModel model;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        model = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        bindNavigation(root);

        return root;
    }

    private void bindNavigation(View root) {


        final Button btn_shareApk = root.findViewById(R.id.home_share_app);
        btn_shareApk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                shareApplication();

//               Intent shareIntent =new Intent(android.content.Intent.ACTION_SEND);
//               shareIntent.setType("*/*");
//               shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
//               Uri uri =Uri.parse("/data/apps/"+ requireContext().getPackageName()+".apk");
//               shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
//               startActivity(Intent.createChooser(shareIntent,"Share via"));

            }
        });


        final Button shareContent = root.findViewById(R.id.home_share);
        shareContent.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_share));

        final Button downloadContent = root.findViewById(R.id.home_download);
        downloadContent.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_download));

        final Button exploreContent = root.findViewById(R.id.home_explore);
        exploreContent.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_explore));
    }

    private void shareApplication() {
        ApplicationInfo app = requireContext().getApplicationInfo();
        String filePath = app.sourceDir;

        Intent intent = new Intent(Intent.ACTION_SEND);

        // MIME of .apk is "application/vnd.android.package-archive".
        // but Bluetooth does not accept this. Let's use "*/*" instead.
        intent.setType("*/*");

        // Append file and send Intent
        File originalApk = new File(filePath);

        try {
            //Make new directory in new location=
            File tempFile = new File( requireActivity().getExternalCacheDir() + "/ExtractedApk");
            //If directory doesn't exists create new
            if (!tempFile.isDirectory()) {
                if (!tempFile.mkdirs()) {
                    return;
                }
            }
            //Get application's name and convert to lowercase
            tempFile = new File(tempFile.getPath() + "/" + getString(app.labelRes).replace(" ","").toLowerCase() + ".apk");
            //If file doesn't exists create new
            if (!tempFile.exists()) {
                if (!tempFile.createNewFile()) {
                    return;
                }
            }
            //Copy file to new location
            InputStream in = new FileInputStream(originalApk);
            OutputStream out = new FileOutputStream(tempFile);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
            System.out.println("File copied.");
            //Open share dialog
//          intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
            Uri photoURI = FileProvider.getUriForFile(requireContext(), BuildConfig.APPLICATION_ID + ".provider", tempFile);
//          intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
            intent.putExtra(Intent.EXTRA_STREAM, photoURI);
            startActivity(Intent.createChooser(intent, "Share app via"));

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(requireContext(),e.toString(),Toast.LENGTH_LONG).show();
        }
    }
}