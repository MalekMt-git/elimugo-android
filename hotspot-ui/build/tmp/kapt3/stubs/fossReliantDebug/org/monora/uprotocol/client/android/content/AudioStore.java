package org.monora.uprotocol.client.android.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/content/AudioStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAlbums", "", "Lorg/monora/uprotocol/client/android/content/Album;", "artist", "Lorg/monora/uprotocol/client/android/content/Artist;", "getArtists", "getSongs", "Lorg/monora/uprotocol/client/android/content/Song;", "selection", "", "selectionArgs", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "loadAlbums", "cursor", "Landroid/database/Cursor;", "hotspot-ui_fossReliantDebug"})
public final class AudioStore {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public AudioStore(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Album> getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Album> getAlbums(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.Artist artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Artist> getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Song> getSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String selection, @org.jetbrains.annotations.NotNull()
    java.lang.String[] selectionArgs) {
        return null;
    }
    
    private final java.util.List<org.monora.uprotocol.client.android.content.Album> loadAlbums(android.database.Cursor cursor) {
        return null;
    }
}