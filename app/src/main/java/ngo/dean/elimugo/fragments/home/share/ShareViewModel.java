package ngo.dean.elimugo.fragments.home.share;


import android.Manifest;
import android.app.Application;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import ngo.dean.elimugo.services.hotspot_server.HotspotServer;
import ngo.dean.elimugo.services.hotspot_server.server.Server;
import ngo.dean.elimugo.utils.receivers.LiveDataReceiver;

public class ShareViewModel extends AndroidViewModel {

    private final LiveData<NetworkInformation> networkInformation;

    public ShareViewModel(@NonNull Application application) {
        super(application);
        networkInformation = new LiveDataReceiver<>( // TODO: This does not trigger when app is in the background
                application.getApplicationContext(),
                new IntentFilter(HotspotServer.INTENT_HOTSPOT_STARTED),
                ((context, intent) -> new NetworkInformation(
                        intent.getStringExtra("ip"), // TODO: Name should be a constant
                        Server.PORT,
                        intent.getStringExtra("SSID"),
                        intent.getStringExtra("password")
                ))
        );
    }

    public LiveData<NetworkInformation> getNetworkInformation() { return networkInformation; }

}

class NetworkInformation {
    private final String ipAddress;
    private final int port;
    private final String SSID;
    private final String password;

    NetworkInformation(String ipAddress, int port, String SSID, String password) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.SSID = SSID;
        this.password = password;
    }

    public String getURL() {
        return String.format("%s:%s", ipAddress, port);
    }

    public String getName() {
        return SSID;
    }

    public String getPassword() {
        return password;
    }
}
