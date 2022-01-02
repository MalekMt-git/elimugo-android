package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0018\u001a\u00020\u0015J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u001d\u001a\u00020\u001aJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\fJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010\u001d\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/monora/uprotocol/client/android/data/MediaRepository;", "", "appStore", "Lorg/monora/uprotocol/client/android/content/AppStore;", "audioStore", "Lorg/monora/uprotocol/client/android/content/AudioStore;", "imageStore", "Lorg/monora/uprotocol/client/android/content/ImageStore;", "videoStore", "Lorg/monora/uprotocol/client/android/content/VideoStore;", "(Lorg/monora/uprotocol/client/android/content/AppStore;Lorg/monora/uprotocol/client/android/content/AudioStore;Lorg/monora/uprotocol/client/android/content/ImageStore;Lorg/monora/uprotocol/client/android/content/VideoStore;)V", "getAlbumSongs", "", "Lorg/monora/uprotocol/client/android/content/Song;", "album", "Lorg/monora/uprotocol/client/android/content/Album;", "getAllAlbums", "getAllApps", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/content/App;", "getAllArtists", "Lorg/monora/uprotocol/client/android/content/Artist;", "getAllSongs", "getArtistAlbums", "artist", "getImageBuckets", "Lorg/monora/uprotocol/client/android/content/ImageBucket;", "getImages", "Lorg/monora/uprotocol/client/android/content/Image;", "bucket", "getVideoBuckets", "Lorg/monora/uprotocol/client/android/content/VideoBucket;", "getVideos", "Lorg/monora/uprotocol/client/android/content/Video;", "hotspot-ui_fossReliantDebug"})
@javax.inject.Singleton()
public final class MediaRepository {
    private final org.monora.uprotocol.client.android.content.AppStore appStore = null;
    private final org.monora.uprotocol.client.android.content.AudioStore audioStore = null;
    private final org.monora.uprotocol.client.android.content.ImageStore imageStore = null;
    private final org.monora.uprotocol.client.android.content.VideoStore videoStore = null;
    
    @javax.inject.Inject()
    public MediaRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.AppStore appStore, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.AudioStore audioStore, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.ImageStore imageStore, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.VideoStore videoStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Album> getAllAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Artist> getAllArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.content.App>> getAllApps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Song> getAllSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Song> getAlbumSongs(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.Album album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Album> getArtistAlbums(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.Artist artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.ImageBucket> getImageBuckets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Image> getImages(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.ImageBucket bucket) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.VideoBucket> getVideoBuckets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Video> getVideos(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.VideoBucket bucket) {
        return null;
    }
}