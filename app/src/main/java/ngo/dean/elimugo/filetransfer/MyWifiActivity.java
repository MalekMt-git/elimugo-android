package ngo.dean.elimugo.filetransfer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.widget.Toast;

import java.nio.channels.Channel;

import ngo.dean.elimugo.R;

public class MyWifiActivity extends AppCompatActivity {

    WifiP2pManager manager;
    Channel channel2;
    BroadcastReceiver receiver;
    IntentFilter intentFilter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wifi);

        manager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);

       WifiP2pManager.Channel channel =  manager.initialize(getBaseContext(), getMainLooper(), null);

        receiver = new WiFiDirectBroadcastReceiver(manager, channel2, this);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        manager.discoverPeers((WifiP2pManager.Channel) channel, new WifiP2pManager.ActionListener() {
            @Override
            public void onSuccess() {

                Toast.makeText(getApplicationContext(), "onSuccess", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(int reasonCode) {

                Toast.makeText(getApplicationContext(), "onFailure", Toast.LENGTH_LONG).show();

            }
        });

        intentFilter = new IntentFilter();
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);

    }

    /* register the broadcast receiver with the intent values to be matched */
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(receiver, intentFilter);
    }
    /* unregister the broadcast receiver */
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }
}