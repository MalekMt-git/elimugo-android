package org.monora.uprotocol.client.android.util;

import static android.content.Context.WIFI_P2P_SERVICE;
import static android.os.Looper.getMainLooper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.p2p.WifiP2pManager;

abstract public class WiFiDirectManager {
    // private static final String TAG = "P2PUtils";

    private final WifiP2pManager wifiP2pManager;
    private final WifiP2pManager.Channel channel;
    private static WiFiDirectManager mInstance = null;
    private static SharedPreferences prefP2p;

    private WiFiDirectManager(Context context)
    {
        wifiP2pManager = (WifiP2pManager) context.getApplicationContext().getSystemService(WIFI_P2P_SERVICE);
        channel = wifiP2pManager.initialize(context, getMainLooper(), null);
        prefP2p = context.getSharedPreferences("myWiFiDirect", Context.MODE_PRIVATE);
    }

    public static WiFiDirectManager getInstance(Context context)
    {
        if (mInstance == null)
            mInstance = new P2PAPI(context);

        return mInstance;
    }

    public WifiP2pManager getWifiP2pManager()
    {
        return wifiP2pManager;
    }
    public WifiP2pManager.Channel getWifiP2PChannel()
    {
        return channel;
    }

    abstract public boolean enable();
    abstract public void disable();

    abstract public boolean isEnabled();

    public static class P2PAPI extends WiFiDirectManager
    {
        private boolean p2pStarted = false;

        private P2PAPI(Context context)
        {
            super(context);
        }

        @SuppressLint("MissingPermission")
        @Override
        public boolean enable()
        {
            try {
                getWifiP2pManager().createGroup(getWifiP2PChannel(), new WifiP2pManager.ActionListener() {
                    @Override
                    public void onSuccess() {
                        p2pStarted = true;
                    }

                    @Override
                    public void onFailure(int reason) {
                    }
                });
            } catch (Throwable e) {
                e.printStackTrace();
            }

            return false;

        }

        @Override
        public void disable()
        {
            getWifiP2pManager().removeGroup(getWifiP2PChannel(), new WifiP2pManager.ActionListener() {
                @Override
                public void onSuccess() {
                    p2pStarted = false;

                    SharedPreferences.Editor editor = prefP2p.edit();
                    editor.putString("ssid", "network name");
                    editor.putString("bssid", "bssid");
                    editor.putString("key", "key");
                    editor.apply();
                }

                @Override
                public void onFailure(int reason) {
                }
            });
        }

        @Override
        public boolean isEnabled()
        {
            return p2pStarted;
        }
    }
}
