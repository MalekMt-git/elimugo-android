package ngo.dean.elimugo.services.hotspot_server;

import android.content.Context;
import android.util.Log;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import ngo.dean.elimugo.services.hotspot_server.hotspot.Hotspot;
import ngo.dean.elimugo.services.hotspot_server.server.Server;

@Singleton
public class HotspotServer {
    private static final String TAG = "HotspotServer";

    public static final String INTENT_HOTSPOT_STARTED = "ngo.dean.elimugo.services.hotspot_server.INTENT_HOTSPOT_STARTED";
    public boolean isRunning = false;

    private final Hotspot hotspot;
    private final Server server;

    @Inject
    public HotspotServer(Hotspot hotspot, Server server) {
        this.hotspot = hotspot;
        this.server = server;
    }

    public void start(Context applicationContext) {
        Log.d(TAG, "Starting local hotspot server...");

        hotspot.start(applicationContext);
        startServer();
        this.isRunning = true;
    }

    public void stop() {
        Log.d(TAG, "Stopping local hotspot server...");

        isRunning = false;
        hotspot.stop();
        server.stop();
    }

    private void startServer() {
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "Something went wrong while starting the server.");
        }
    }
}
