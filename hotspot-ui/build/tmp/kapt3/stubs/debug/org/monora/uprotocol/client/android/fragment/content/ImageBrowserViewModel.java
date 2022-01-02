package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel;", "Landroidx/lifecycle/ViewModel;", "mediaRepository", "Lorg/monora/uprotocol/client/android/data/MediaRepository;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Lorg/monora/uprotocol/client/android/data/MediaRepository;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "_showingContent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content;", "showingContent", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getShowingContent", "()Landroidx/lifecycle/LiveData;", "showBuckets", "", "showImages", "bucket", "Lorg/monora/uprotocol/client/android/content/ImageBucket;", "Content", "hotspot-ui_debug"})
public final class ImageBrowserViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.MediaRepository mediaRepository = null;
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel.Content> _showingContent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel.Content> showingContent = null;
    
    @javax.inject.Inject()
    public ImageBrowserViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.MediaRepository mediaRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel.Content> getShowingContent() {
        return null;
    }
    
    public final void showBuckets() {
    }
    
    public final void showImages(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.ImageBucket bucket) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content;", "", "()V", "Buckets", "Images", "Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content$Buckets;", "Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content$Images;", "hotspot-ui_debug"})
    public static abstract class Content {
        
        private Content() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content$Buckets;", "Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content;", "list", "", "Lorg/monora/uprotocol/client/android/content/ImageBucket;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class Buckets extends org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.ImageBucket> list = null;
            
            public Buckets(@org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.ImageBucket> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.ImageBucket> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content$Images;", "Lorg/monora/uprotocol/client/android/fragment/content/ImageBrowserViewModel$Content;", "imageBucket", "Lorg/monora/uprotocol/client/android/content/ImageBucket;", "list", "", "Lorg/monora/uprotocol/client/android/content/Image;", "(Lorg/monora/uprotocol/client/android/content/ImageBucket;Ljava/util/List;)V", "getImageBucket", "()Lorg/monora/uprotocol/client/android/content/ImageBucket;", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
        public static final class Images extends org.monora.uprotocol.client.android.fragment.content.ImageBrowserViewModel.Content {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.content.ImageBucket imageBucket = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.monora.uprotocol.client.android.content.Image> list = null;
            
            public Images(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.content.ImageBucket imageBucket, @org.jetbrains.annotations.NotNull()
            java.util.List<org.monora.uprotocol.client.android.content.Image> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.content.ImageBucket getImageBucket() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.monora.uprotocol.client.android.content.Image> getList() {
                return null;
            }
        }
    }
}