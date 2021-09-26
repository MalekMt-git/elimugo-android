package ngo.dean.elimugo.services.hotspot_server.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class HotspotServerServiceConnection implements ServiceConnection {

    private HotspotServerService serviceInstance;
    public boolean isBound;


    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        HotspotServerService.ServiceBinder serviceBinder = (HotspotServerService.ServiceBinder) service;
        serviceInstance = serviceBinder.getService();
        isBound = true;
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        isBound = false;
        serviceInstance = null;
    }

    public HotspotServerService getServiceInstance() {
        return serviceInstance;
    }
}
