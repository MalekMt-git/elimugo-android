package ngo.dean.elimugo.services.hotspot_server.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import ngo.dean.elimugo.MainActivity;
import ngo.dean.elimugo.R;
import ngo.dean.elimugo.services.hotspot_server.HotspotServer;
import ngo.dean.elimugo.services.hotspot_server.hotspot.Hotspot;
import ngo.dean.elimugo.services.hotspot_server.server.Server;

import static ngo.dean.elimugo.App.CHANNEL_ID;

public class HotspotServerService extends Service {
    private static final String TAG = HotspotServerService.class.getSimpleName();
    private static final String NAME = "ElimuGo WLAN Server";
    private static final int NOTIFICATION_ID = 1;

    private final IBinder localBinder = new ServiceBinder();

    private HotspotServer hotspotServer;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "Creating service.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "Received start command.");
        String input = intent.getStringExtra("hotspotService");

        startForeground(NOTIFICATION_ID, buildNotification(input));
        startHotspotServer();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroying service.");
        hotspotServer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return localBinder;
    }

    public void updateNotification(String updateText) {
        Notification notification = buildNotification(updateText);
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.notify(NOTIFICATION_ID, notification);
    }

    public void startHotspotServer() {
        hotspotServer = new HotspotServer(new Hotspot(), new Server());
        hotspotServer.start(this.getApplicationContext());
    }

    private Notification buildNotification(String contentText) {
        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

        return new Notification.Builder(this, CHANNEL_ID)
                .setContentTitle(NAME)
                .setContentText(contentText)
                .setSmallIcon(R.drawable.ic_menu_camera) // TODO: Get an icon that matches the functionality
                .setContentIntent(pendingIntent)
                .build();
    }

    public class ServiceBinder extends Binder {
        public HotspotServerService getService() {
            return HotspotServerService.this;
        }
    }
}
