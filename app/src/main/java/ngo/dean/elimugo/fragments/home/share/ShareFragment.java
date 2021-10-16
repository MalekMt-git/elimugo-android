package ngo.dean.elimugo.fragments.home.share;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import ngo.dean.elimugo.R;
import ngo.dean.elimugo.services.hotspot_server.service.HotspotServerService;
import ngo.dean.elimugo.services.hotspot_server.service.HotspotServerServiceConnection;
import ngo.dean.elimugo.utils.qr_generator.QRGenerator;

public class ShareFragment extends Fragment {
    private static final String TAG = "ShareFragment";
    private final int READ_LOCATION_PERMISSION = 1;
    private final int SET_LOCATION_IN_SETTINGS = 2;

    private ShareViewModel viewModel;
    private HotspotServerServiceConnection wlanServerServiceConnection;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_share, container, false);
        bindViewModel(root);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (hasLocationServiceAccess()) {
            bindWLANServerService();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbindWLANServerService();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        if (requestCode == READ_LOCATION_PERMISSION && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            bindWLANServerService();
        } else {
            // TODO: Handle no Permission event, perhaps showing a custom element or modal
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SET_LOCATION_IN_SETTINGS && resultCode == 0 && hasLocationServiceAccess()) {
            bindWLANServerService();
        } else {
            // TODO: Handle no Location Service event, perhaps showing a custom element or modal
        }
    }

    private boolean checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this.getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestLocationPermission();
            return false;
        }
        return true;
    }

    private void requestLocationPermission() {

        if (shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_FINE_LOCATION)) {
            new AlertDialog.Builder(this.getContext())
                    .setTitle("Permission required")
                    .setMessage("Access to your location is needed to open a WLAN.")
                    .setPositiveButton("ok", (dialog, which) -> requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, READ_LOCATION_PERMISSION))
                    .setNegativeButton("cancel", (dialog, which) -> dialog.dismiss())
                    .create()
                    .show();
        } else {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, READ_LOCATION_PERMISSION);
        }
    }

    private void bindViewModel(View root) {
        viewModel = new ViewModelProvider(this).get(ShareViewModel.class);

        final TextView ipAddress = root.findViewById(R.id.ipAddress);
        final TextView SSID = root.findViewById(R.id.networkName);
        final TextView password = root.findViewById(R.id.networkPassword);
        final ImageView qrView = root.findViewById(R.id.qrCode);

        viewModel.getNetworkInformation().observe(getViewLifecycleOwner(), information -> {
            ipAddress.setText(String.format("%s: %s", getString(R.string.ip_address), information.getURL()));
            SSID.setText(String.format("%s: %s", getString(R.string.network_name), information.getName()));
            password.setText(String.format("%s: %s", getString(R.string.network_password), information.getPassword()));


         //   String qrContent = String.format("{ hotspot: 'WIFI:T:WPA;S:%s;P:%s', serverIP: '%s'}", information.getName(), information.getPassword(), information.getURL());


            String qrContent = String.format("{ hotspot: 'WIFI:T:WPA;S:~%s~;P:~%s~', serverIP: '~%s~'}", information.getName(), information.getPassword(), information.getURL());
            qrView.setImageBitmap(QRGenerator.createQRCode(qrContent));


            Toast.makeText(getContext() , qrContent.toString() , Toast.LENGTH_LONG).show();


            wlanServerServiceConnection.getServiceInstance().updateNotification("Running WLAN hotspot server.");
        });
    }

    private void bindWLANServerService() {
        Intent serviceIntent = new Intent(requireActivity().getApplicationContext(), HotspotServerService.class);
        serviceIntent.putExtra("hotspotService", "Starting WLAN hotspot...");

        requireActivity().startService(serviceIntent);
        wlanServerServiceConnection = new HotspotServerServiceConnection();
        getActivity().bindService(serviceIntent, wlanServerServiceConnection, Context.BIND_AUTO_CREATE);
    }

    private void unbindWLANServerService() {
        if (wlanServerServiceConnection != null && wlanServerServiceConnection.isBound) {
            getActivity().unbindService(wlanServerServiceConnection);

            Intent serviceIntent = new Intent(getActivity().getApplicationContext(), HotspotServerService.class);
            getActivity().stopService(serviceIntent);
        }
    }

    private boolean hasLocationServiceAccess() {
        LocationManager locationManager = (LocationManager) this.getActivity().getSystemService(Context.LOCATION_SERVICE);
        if (!LocationManagerCompat.isLocationEnabled(locationManager)) {
            Intent settingsIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivityForResult(settingsIntent, SET_LOCATION_IN_SETTINGS);
            return false;
        }

        // TODO: Research -> should there be specific providers enabled?

        return checkLocationPermission();
    }
}
