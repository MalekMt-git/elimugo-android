package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R+\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/AppBrowserViewModel;", "Landroidx/lifecycle/ViewModel;", "mediaRepository", "Lorg/monora/uprotocol/client/android/data/MediaRepository;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Lorg/monora/uprotocol/client/android/data/MediaRepository;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "allApps", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/content/App;", "kotlin.jvm.PlatformType", "getAllApps", "()Landroidx/lifecycle/LiveData;", "hotspot-ui_fossReliantDebug"})
public final class AppBrowserViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.content.App>> allApps = null;
    
    @javax.inject.Inject()
    public AppBrowserViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.MediaRepository mediaRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.content.App>> getAllApps() {
        return null;
    }
}