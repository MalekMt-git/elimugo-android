package ngo.dean.elimugo.filetransfer;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import java.nio.channels.Channel;

/**
 * A BroadcastReceiver that notifies of important Wi-Fi p2p events.
 */
public class WiFiDirectBroadcastReceiver extends BroadcastReceiver {

    private WifiP2pManager manager;
    private Channel channel;
    private MyWifiActivity activity;

    WifiP2pManager.PeerListListener myPeerListListener;

    public WiFiDirectBroadcastReceiver(WifiP2pManager manager, Channel channel,
                                       MyWifiActivity activity) {
        super();
        this.manager = manager;
        this.channel = channel;
        this.activity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {

            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {

                Toast.makeText(context, "Wifi P2P is enabled", Toast.LENGTH_LONG).show();
                // Wifi P2P is enabled
            } else {
                // Wi-Fi P2P is not enabled
                Toast.makeText(context, "Wifi P2P is not enabled", Toast.LENGTH_LONG).show();

            }

            // Check to see if Wi-Fi is enabled and notify appropriate activity
        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {

            // Call WifiP2pManager.requestPeers() to get a list of current peers

            // request available peers from the wifi p2p manager. This is an
            // asynchronous call and the calling activity is notified with a
            // callback on PeerListListener.onPeersAvailable()
            if (manager != null) {
                if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }

                manager.requestPeers((WifiP2pManager.Channel) channel, myPeerListListener);


                WifiP2pDeviceList wifiP2pDeviceList = new WifiP2pDeviceList();

                myPeerListListener.onPeersAvailable(wifiP2pDeviceList);


               String a = wifiP2pDeviceList.getDeviceList().stream().findFirst().get().deviceName.toString();
                Toast.makeText(context, a, Toast.LENGTH_LONG).show();

            }
            


        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
            // Respond to new connection or disconnections
        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
            // Respond to this device's wifi state changing
        }
    }
}