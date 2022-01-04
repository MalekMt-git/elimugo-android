package com.leaf.explorer;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.leaf.explorer.fragment.SongsFragment;
import com.leaf.explorer.listener.MusicSelectListener;
import com.leaf.explorer.listener.PlayerListener;
import com.leaf.explorer.model.Music;
import com.leaf.explorer.player.PlayerBuilder;
import com.leaf.explorer.player.PlayerDialog;
import com.leaf.explorer.player.PlayerManager;

import org.monora.uprotocol.client.android.R;

import java.util.List;
import java.util.Locale;

public class MusicActivity extends AppCompatActivity
        implements MusicSelectListener, PlayerListener, View.OnClickListener {

    private RelativeLayout playerView;
    private ImageView albumArt;
    private TextView songName;
    private TextView songDetails;
    private ImageView play_pause;
    private LinearProgressIndicator progressIndicator;
    private PlayerDialog playerDialog;
   // private QueueDialog queueDialog;

    private PlayerBuilder playerBuilder;
    private PlayerManager playerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_player);

        MPConstants.musicSelectListener = this;

        if (hasReadStoragePermission(MusicActivity.this))
            setUpUiElements();
        else
            manageStoragePermission(MusicActivity.this);

        MaterialCardView playerLayout = findViewById(R.id.player_layout);
        albumArt = findViewById(R.id.albumArt);
        progressIndicator = findViewById(R.id.song_progress);
        playerView = findViewById(R.id.player_view);
        songName = findViewById(R.id.song_title);
        songDetails = findViewById(R.id.song_details);
        play_pause = findViewById(R.id.control_play_pause);
        ImageView queue = findViewById(R.id.control_queue);

        play_pause.setOnClickListener(this);
        playerLayout.setOnClickListener(this);
        queue.setOnClickListener(this);
    }

    private void setPlayerView() {
        if (playerManager != null && playerManager.isPlaying()) {
            playerView.setVisibility(View.VISIBLE);
            onMusicSet(playerManager.getCurrentMusic());
        }
    }

    public void setUpUiElements() {
        playerBuilder = new PlayerBuilder(MusicActivity.this, this);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, SongsFragment.newInstance(this)).commit();
    }

    public void manageStoragePermission(Activity context) {
        if (!hasReadStoragePermission(context)) {
            // required a dialog?
            if (ActivityCompat.shouldShowRequestPermissionRationale(context, Manifest.permission.READ_EXTERNAL_STORAGE) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                new MaterialAlertDialogBuilder(context)
                        .setTitle("Requesting permission")
                        .setMessage("Enable storage permission for accessing the media files.")
                        .setPositiveButton("Accept", (dialog, which) -> askReadStoragePermission(context)).show();
            } else
                askReadStoragePermission(context);
        }
    }

    public boolean hasReadStoragePermission(Activity context) {
        return (
                ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                        ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
        );
    }

    public void askReadStoragePermission(Activity context) {
        ActivityCompat.requestPermissions(
                context,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE},
                MPConstants.PERMISSION_READ_STORAGE
        );
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            MPConstants.applySettings(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // TODO:: Fix this, the ideal behaviour is that when the app closes
        //      the service is stopped from the foreground, but still lives
        //      and on coming back to app, it works.

        // TODO:: Current error is that the service unbinds, when we start the app
        //       from notification or by launcher it works ok, but after selecting the
        //      theme(changing the theme) or clicking the navigation button on toolbar
        //      the service dies too, sometimes it dies also by clicking on the
        //      notification.
//        playerBuilder.unBindService();

        if (playerDialog != null)
            playerDialog.dismiss();

//        if (queueDialog != null)
//            queueDialog.dismiss();
    }

    @Override
    public void playQueue(List<Music> musicList) {
        if(musicList.size() > 0) {
            playerManager.setMusicList(musicList);
            setPlayerView();
        }
    }

    @Override
    public void addToQueue(List<Music> music) {
        if(music.size() > 0) {
            if (playerManager != null && playerManager.isPlaying())
                playerManager.addMusicQueue(music);
            else if (playerManager != null)
                playerManager.setMusicList(music);

            setPlayerView();
        }
    }

    @Override
    public void setShuffleMode(boolean mode) {
        playerManager.getPlayerQueue().setShuffle(mode);
    }

    @Override
    public void onPrepared() {
        playerManager = playerBuilder.getPlayerManager();
        setPlayerView();
    }

    @Override
    public void onStateChanged(int state) {
        if (state == State.PLAYING)
            play_pause.setImageResource(R.drawable.ic_controls_pause);
        else
            play_pause.setImageResource(R.drawable.ic_controls_play);
    }

    @Override
    public void onPositionChanged(int position) {
        progressIndicator.setProgress(position);
    }

    @Override
    public void onMusicSet(Music music) {
        songName.setText(music.title);
        songDetails.setText(
                String.format(Locale.getDefault(), "%s • %s",
                        music.artist, music.album));
        playerView.setVisibility(View.VISIBLE);

        Glide.with(getApplicationContext())
                .load(music.albumArt)
                .centerCrop()
                .into(albumArt);

        if (playerManager != null && playerManager.isPlaying())
            play_pause.setImageResource(R.drawable.ic_controls_pause);
        else
            play_pause.setImageResource(R.drawable.ic_controls_play);
    }

    @Override
    public void onPlaybackCompleted() {
    }

    @Override
    public void onRelease() {
        playerView.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.control_play_pause)
            playerManager.playPause();

        else if (id == R.id.control_queue)
            setUpQueueDialog();

        else if (id == R.id.player_layout)
            setUpPlayerDialog();
    }

    private void setUpPlayerDialog() {
        playerDialog = new PlayerDialog(this, playerManager);
        playerDialog.show();
    }

    private void setUpQueueDialog() {
//        queueDialog = new QueueDialog(this, playerManager.getPlayerQueue());
//        queueDialog.show();
    }
}
