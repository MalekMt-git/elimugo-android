package com.leaf.explorer.viewmodel;

import android.content.Context;
import android.provider.MediaStore;

import androidx.lifecycle.ViewModel;

import com.leaf.explorer.helper.MusicLibraryHelper;
import com.leaf.explorer.model.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainViewModel extends ViewModel {

    public List<Music> songsList = new ArrayList<>();

    public MainViewModel(Context context) {
        initSongList(context);
    }

    private void initSongList(Context context) {
        List<Music> musicList = MusicLibraryHelper.fetchMusicLibrary(context, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);

        songsList.addAll(musicList);

        Collections.sort(songsList, new SongComparator());
    }

    public List<Music> getSongs(boolean reverse) {
        if (reverse)
            Collections.reverse(songsList);

        return songsList;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        songsList = null;
    }
}

class SongComparator implements Comparator<Music> {
    @Override
    public int compare(Music m1, Music m2) {
        return m1.title.compareTo(m2.title);
    }
}
