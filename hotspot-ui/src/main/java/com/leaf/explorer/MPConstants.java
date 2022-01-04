package com.leaf.explorer;

import android.app.Activity;
import android.content.Intent;

import com.leaf.explorer.listener.MusicSelectListener;

public class MPConstants {
    public static final String PACKAGE_NAME = "com.atul.musicplayerlite";
    public static final String DEBUG_TAG = "MPLite_debug";
    public static final String GITHUB_REPO_URL = "https://github.com/AP-Atul/music_player_lite";

    public static final int PERMISSION_READ_STORAGE = 1009;

    public static final String MEDIA_SESSION_TAG = "com.atul.musicplayerlite.MediaSession";

    public static final int NOTIFICATION_ID = 101;
    public static final String PLAY_PAUSE_ACTION = "com.atul.musicplayerlite.PLAYPAUSE";
    public static final String NEXT_ACTION = "com.atul.musicplayerlite.NEXT";
    public static final String PREV_ACTION = "com.atul.musicplayerlite.PREV";
    public static final String CLOSE_ACTION = "com.atul.musicplayerlite.CLOSE";
    public static final String CHANNEL_ID = "com.atul.musicplayerlite.CHANNEL_ID";
    public static final int REQUEST_CODE = 100;

    public static final float VOLUME_DUCK = 0.2f;
    public static final float VOLUME_NORMAL = 1.0f;
    public static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    public static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    public static final int AUDIO_FOCUSED = 2;



    public static final String SETTINGS_ALBUM_REQUEST = "shared_pref_album_request";

    public static final String SETTINGS_EXCLUDED_FOLDER = "shared_pref_excluded_folders";

    public static final int SORT_MUSIC_BY_TITLE = 0;
    public static final int SORT_MUSIC_BY_DATE_ADDED = 1;
    public static MusicSelectListener musicSelectListener;
    public static final int SORT_ALBUM_BY_TITLE = 0;
    public static final int SORT_ALBUM_BY_DURATION = 1;
    public static final int SORT_ALBUM_BY_SONGS = 2;
    public static final int DATABASE_VERSION = 1;
    public static final String MUSIC_TABLE = "music";
    public static final String DATABASE_NAME = "playlist";

    public static void applySettings(Activity activity) {
        Intent intent = new Intent(activity, MusicActivity.class);
        intent.setFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK |
                        Intent.FLAG_ACTIVITY_NEW_TASK
        );

        activity.finishAfterTransition();
        activity.startActivity(intent);
        activity.overridePendingTransition(
                android.R.anim.fade_in,
                android.R.anim.fade_out
        );
    }
}