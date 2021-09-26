package ngo.dean.elimugo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;



public class App extends android.app.Application {
    public static final String CHANNEL_ID = "exampleServiceChannel";
    public static final String LOCALE = "en"; // TODO: Locale stuff requires more work

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannel();



    }

    private void createNotificationChannel() {
        NotificationChannel serviceChannel = new NotificationChannel(
                CHANNEL_ID,
                "EXC",
                NotificationManager.IMPORTANCE_DEFAULT
        );

        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(serviceChannel);
    }
}
