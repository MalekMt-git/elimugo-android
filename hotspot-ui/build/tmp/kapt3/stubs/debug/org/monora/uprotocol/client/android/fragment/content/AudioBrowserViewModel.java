package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel;", "Landroidx/lifecycle/ViewModel;", "mediaRepository", "Lorg/monora/uprotocol/client/android/data/MediaRepository;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Lorg/monora/uprotocol/client/android/data/MediaRepository;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "_showingContent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "showingContent", "Landroidx/lifecycle/LiveData;", "getShowingContent", "()Landroidx/lifecycle/LiveData;", "filterSongs", "", "Lorg/monora/uprotocol/client/android/content/Song;", "list", "showAlbumSongs", "", "album", "Lorg/monora/uprotocol/client/android/content/Album;", "showAlbums", "showAllSongs", "showArtistAlbums", "artist", "Lorg/monora/uprotocol/client/android/content/Artist;", "showArtists", "Content", "hotspot-ui_debug"})
public final class AudioBrowserViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.MediaRepository mediaRepository = null;
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content> _showingContent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content> showingContent = null;
    
    @javax.inject.Inject()
    public AudioBrowserViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.MediaRepository mediaRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content> getShowingContent() {
        return null;
    }
    
    private final java.util.List<org.monora.uprotocol.client.android.content.Song> filterSongs(java.util.List<org.monora.uprotocol.client.android.content.Song> list) {
        return null;
    }
    
    public final void showAllSongs() {
    }
    
    public final void showAlbums() {
    }
    
    public final void showArtists() {
    }
    
    public final void showAlbumSongs(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.Album album) {
    }
    
    public final void showArtistAlbums(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.Artist artist) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "", "type", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$Type;", "isList", "", "isFiltered", "(Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$Type;ZZ)V", "()Z", "getType", "()Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$Type;", "AlbumSongs", "AllAlbums", "AllArtists", "AllSongs", "ArtistAlbums", "Type", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllSongs;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllAlbums;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllArtists;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AlbumSongs;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$ArtistAlbums;", "hotspot-ui_debug"})
    public static abstract class Content {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content.Type type = null;
        private final boolean isList = false;
        private final boolean isFiltered = false;
        
        private Content(org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content.Type type, boolean isList, boolean isFiltered) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content.Type getType() {
            return null;
        }
        
        public final boolean isList() {
            return false;
        }
        
        public final boolean isFiltered() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllSongs;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "list", "", "Lorg/monora/uprotocol/client/android/content/Song;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class AllSongs extends org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Song> list = null;
            
            public AllSongs(@org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Song> list) {
                super(null, false, false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Song> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllAlbums;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "list", "", "Lorg/monora/uprotocol/client/android/content/Album;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class AllAlbums extends org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Album> list = null;
            
            public AllAlbums(@org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Album> list) {
                super(null, false, false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Album> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AllArtists;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "list", "", "Lorg/monora/uprotocol/client/android/content/Artist;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class AllArtists extends org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Artist> list = null;
            
            public AllArtists(@org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Artist> list) {
                super(null, false, false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Artist> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$AlbumSongs;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "album", "Lorg/monora/uprotocol/client/android/content/Album;", "list", "", "Lorg/monora/uprotocol/client/android/content/Song;", "(Lorg/monora/uprotocol/client/android/content/Album;Ljava/util/List;)V", "getAlbum", "()Lorg/monora/uprotocol/client/android/content/Album;", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class AlbumSongs extends org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.content.Album album = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Song> list = null;
            
            public AlbumSongs(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.content.Album album, @org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Song> list) {
                super(null, false, false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.content.Album getAlbum() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Song> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$ArtistAlbums;", "Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content;", "artist", "Lorg/monora/uprotocol/client/android/content/Artist;", "list", "", "Lorg/monora/uprotocol/client/android/content/Album;", "(Lorg/monora/uprotocol/client/android/content/Artist;Ljava/util/List;)V", "getArtist", "()Lorg/monora/uprotocol/client/android/content/Artist;", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class ArtistAlbums extends org.monora.uprotocol.client.android.fragment.content.AudioBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.content.Artist artist = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Album> list = null;
            
            public ArtistAlbums(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.content.Artist artist, @org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Album> list) {
                super(null, false, false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.content.Artist getArtist() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Album> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AudioBrowserViewModel$Content$Type;", "", "(Ljava/lang/String;I)V", "Songs", "Albums", "Artists", "hotspot-ui_debug"})
        public static enum Type {
            /*public static final*/ Songs /* = new Songs() */,
            /*public static final*/ Albums /* = new Albums() */,
            /*public static final*/ Artists /* = new Artists() */;
            
            Type() {
            }
        }
    }
}