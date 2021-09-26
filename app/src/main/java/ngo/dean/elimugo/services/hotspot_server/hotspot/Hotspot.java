package ngo.dean.elimugo.services.hotspot_server.hotspot;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.core.app.ActivityCompat;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import javax.inject.Inject;
import javax.inject.Singleton;

import ngo.dean.elimugo.services.hotspot_server.HotspotServer;

@Singleton
public class Hotspot {
    private static final String TAG = Hotspot.class.getSimpleName();

    private WifiConfiguration currentConfig;
    private WifiManager.LocalOnlyHotspotReservation hotspotReservation;

    @Inject
    public Hotspot() {
    }

    public void start(@NonNull Context applicationContext) {
        startHotspot(applicationContext);
    }

    public void stop() {
        if (hotspotReservation != null) {
            hotspotReservation.close();
        }
    }

    private void startHotspot(Context applicationContext) {
        if (ActivityCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        ((WifiManager) applicationContext.getSystemService(Context.WIFI_SERVICE)).startLocalOnlyHotspot(new WifiManager.LocalOnlyHotspotCallback() {

            @Override
            public void onStarted(WifiManager.LocalOnlyHotspotReservation reservation) { // TODO: Clean this up
                super.onStarted(reservation);
                hotspotReservation = reservation;
                currentConfig = hotspotReservation.getWifiConfiguration();

                Log.d(TAG, "Hotspot is running! Details: "
                        + "\n\tIP: " + getWLANIpAddress()
                        + "\n\tSSID: " + currentConfig.SSID
                        + "\n\tPassword: " + currentConfig.preSharedKey);

                Intent intent = new Intent(HotspotServer.INTENT_HOTSPOT_STARTED);
                intent.putExtra("SSID", currentConfig.SSID);
                intent.putExtra("password", currentConfig.preSharedKey);
                intent.putExtra("ip", getWLANIpAddress());
                applicationContext.sendBroadcast(intent);
            }

            @Override
            public void onStopped() {
                super.onStopped();
                Log.v("ShareFragment.onStopped", "Hotspot stopped.");
            }

            @Override
            public void onFailed(int reason) {
                super.onFailed(reason);
                Log.v("ShareFragment.onFailed", "Hotspot failed.");
            }
        }, new Handler());
    }

    private String getWLANIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en
                    .hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                if (intf.getName().contains("wlan")) {
                    for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr
                            .hasMoreElements();) {
                        InetAddress inetAddress = enumIpAddr.nextElement();
                        if (!inetAddress.isLoopbackAddress()
                                && (inetAddress.getAddress().length == 4)) {
                            return inetAddress.getHostAddress();
                        }
                    }
                }
            }
        } catch (SocketException ex) {
            Log.e(TAG, ex.toString());
        }
        return null;
    }
}
