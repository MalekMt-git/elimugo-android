package ngo.dean.elimugo.fragments.home.download.hotspot;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.thanosfisherman.wifiutils.WifiUtils;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionErrorCode;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionSuccessListener;

import java.util.List;
import java.util.Objects;

import ngo.dean.elimugo.R;


public class QrCameraScanFragment extends Fragment {


    private CodeScanner mCodeScanner;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @SuppressLint("CheckResult")
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        final Activity activity = getActivity();
        View root = inflater.inflate(R.layout.fragment_qr_camera_scan, container, false);

        Context context = requireContext();


        RxPermissions rxPermissions = new RxPermissions(requireActivity());
        rxPermissions
                .request(Manifest.permission.CAMERA) // ask single or multiple permission once
                .subscribe(granted -> {
                    if (granted) {

                        // All requested permissions are granted


                        CodeScannerView scannerView = root.findViewById(R.id.qr_scanner_view);
                        mCodeScanner = new CodeScanner(activity, scannerView);
                        mCodeScanner.setDecodeCallback(new DecodeCallback() {
                            @Override
                            public void onDecoded(@NonNull final Result result) {
                                activity.runOnUiThread(new Runnable() {
                                    @RequiresApi(api = Build.VERSION_CODES.Q)
                                    @SuppressLint("CheckResult")
                                    @Override
                                    public void run() {


                                        try {


                                            String[] ary = result.getText().split("~");


                                            Log.i("ARMAN", result.getText());


                                            String str = TextUtils.join("~", ary);


                                            Log.i("ARMAN", ary[1]);


                                            String networkSSID = ary[1];
                                            String networkPass = ary[3];


                                            Log.i("ARMAN", networkSSID + ":ssid");
                                            Log.i("ARMAN", networkPass + ":pss");


                                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {


                                                WifiNetworkSpecifier.Builder builder = new WifiNetworkSpecifier.Builder();
                                                builder.setSsid(networkSSID);
                                                builder.setWpa2Passphrase(networkPass);

                                                WifiNetworkSpecifier wifiNetworkSpecifier = builder.build();
                                                NetworkRequest.Builder networkRequestBuilder = new NetworkRequest.Builder();
                                                networkRequestBuilder.addTransportType(NetworkCapabilities.TRANSPORT_WIFI);
                                                networkRequestBuilder.setNetworkSpecifier(wifiNetworkSpecifier);
                                                NetworkRequest networkRequest = networkRequestBuilder.build();
                                                ConnectivityManager cm = (ConnectivityManager)
                                                        requireContext()
                                                                .getSystemService(Context.CONNECTIVITY_SERVICE);
                                                if (cm != null) {
                                                    cm.requestNetwork(networkRequest, new ConnectivityManager.NetworkCallback() {
                                                        @Override
                                                        public void onAvailable(@NonNull Network network) {
                                                            super.onAvailable(network);
                                                            cm.bindProcessToNetwork(network);
                                                        }
                                                    });

                                                    //   Toast.makeText(activity, ary.length , Toast.LENGTH_SHORT).show();
                                                }


                                            } else {


                                                WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
                                                // setup a wifi configuration
                                                WifiConfiguration wc = new WifiConfiguration();

                                                wc.SSID = "\"" + networkSSID + "\"";   // Please note the quotes. String should contain ssid in quotes

                                                wc.preSharedKey = "\"" + networkPass + "\"";   // Please note the quotes. String should contain ssid in quotes

                                                wc.status = WifiConfiguration.Status.ENABLED;
                                                wc.allowedGroupCiphers.set(WifiConfiguration.GroupCipher.TKIP);
                                                wc.allowedGroupCiphers.set(WifiConfiguration.GroupCipher.CCMP);
                                                wc.allowedKeyManagement.set(WifiConfiguration.KeyMgmt.WPA_PSK);
                                                wc.allowedPairwiseCiphers.set(WifiConfiguration.PairwiseCipher.TKIP);
                                                wc.allowedPairwiseCiphers.set(WifiConfiguration.PairwiseCipher.CCMP);
                                                wc.allowedProtocols.set(WifiConfiguration.Protocol.RSN);
                                                // connect to and enable the connection
                                                int netId = wifiManager.addNetwork(wc);
                                                wifiManager.enableNetwork(netId, true);
                                                wifiManager.setWifiEnabled(true);

                                                if (wifiManager.isWifiEnabled()) {


                                                    //   String[] ary = result.getText().split("~");


                                                    Log.i("ARMAN", result.getText());


                                                    // String str = TextUtils.join("~", ary);


                                                    Log.i("ARMAN", ary[1]);


                                                    String Ip = ary[5];
                                                    String Port = ary[6];

                                                    //    new FileSender( Ip, Port) ;


                                                }

                                            }


                                        } catch (Exception exception) {
                                            Toast.makeText(getContext(), exception.getMessage(), Toast.LENGTH_LONG).show();
                                        }


                                    }


                                });
                            }
                        });


                        scannerView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mCodeScanner.startPreview();
                            }
                        });

                    } else {
                        Toast.makeText(getContext(), "please give the access", Toast.LENGTH_SHORT).show();
                        setupPermission();
                    }
                });


        return root;
    }


    @Override
    public void onResume() {
        super.onResume();
        try {
            mCodeScanner.startPreview();

        } catch (Exception e) {

        }
    }

    @Override
    public void onPause() {
        try {
            mCodeScanner.releaseResources();

        } catch (Exception e) {

        }
        super.onPause();
    }


    @SuppressLint("CheckResult")
    private void setupPermission() {

        RxPermissions rxPermissions = new RxPermissions(requireActivity());
        rxPermissions
                .request(Manifest.permission.CAMERA) // ask single or multiple permission once
                .subscribe(granted -> {
                    if (granted) {
                        // All requested permissions are granted
                    } else {
                        Toast.makeText(getContext(), "please give the access", Toast.LENGTH_SHORT).show();
                        setupPermission();
                    }
                });

    }

    private final ConnectionSuccessListener successListener = new ConnectionSuccessListener() {
        @Override
        public void success() {
            Toast.makeText(requireContext(), "SUCCESS!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void failed(@NonNull ConnectionErrorCode errorCode) {
            Toast.makeText(requireContext(), "EPIC FAIL!" + errorCode.toString(), Toast.LENGTH_SHORT).show();
        }
    };


    private void checkResult(boolean isSuccess) {
        if (isSuccess) {
            Toast.makeText(requireContext(), "WIFI ENABLED", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(requireContext(), "COULDN'T ENABLE WIFI", Toast.LENGTH_SHORT).show();

            WifiUtils.withContext(requireContext()).enableWifi();

        }
    }

    private void getScanResults(@NonNull final List<ScanResult> results) {
        if (results.isEmpty()) {
            Log.i("TAG", "SCAN RESULTS IT'S EMPTY");
            return;
        }
        Log.i("TAG", "GOT SCAN RESULTS " + results);
    }
}