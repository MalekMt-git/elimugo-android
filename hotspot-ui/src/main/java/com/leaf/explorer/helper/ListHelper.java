package com.leaf.explorer.helper;

import com.leaf.explorer.MPConstants;
import com.leaf.explorer.model.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kotlin.collections.CollectionsKt;

public class ListHelper {

    public static List<Music> searchMusicByName(List<Music> list, String query) {
        List<Music> newList = new ArrayList<>(list);
        return CollectionsKt.filter(newList, music ->
                (music.title.toLowerCase().contains(query) || music.displayName.toLowerCase().contains(query)) ||
                        (music.artist.toLowerCase().contains(query) || music.album.toLowerCase().contains(query))
        );
    }

    public static List<Music> sortMusicByDateAdded(List<Music> list, boolean reverse) {
        List<Music> newList = new ArrayList<>(list);
        Collections.sort(newList, new SongComparator(MPConstants.SORT_MUSIC_BY_DATE_ADDED));

        if (reverse)
            Collections.reverse(newList);

        return newList;
    }

    public static List<Music> sortMusic(List<Music> list, boolean reverse) {
        List<Music> newList = new ArrayList<>(list);
        Collections.sort(newList, new SongComparator(MPConstants.SORT_MUSIC_BY_TITLE));

        if (reverse)
            Collections.reverse(newList);

        return newList;
    }

    public static String ifNull(String val) {
        return val == null ? "" : val;
    }
}

class SongComparator implements Comparator<Music> {
    private final int mode;

    public SongComparator(int mode) {
        this.mode = mode;
    }

    @Override
    public int compare(Music m1, Music m2) {
        if (mode == MPConstants.SORT_MUSIC_BY_TITLE)
            return m1.title.compareTo(m2.title);

        else if (mode == MPConstants.SORT_MUSIC_BY_DATE_ADDED)
            return Long.compare(m2.dateAdded, m1.dateAdded);

        return 0;
    }
}
