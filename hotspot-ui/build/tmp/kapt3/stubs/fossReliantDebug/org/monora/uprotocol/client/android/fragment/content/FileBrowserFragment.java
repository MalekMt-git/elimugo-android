package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001e\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/FileBrowserFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addAccess", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "backPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "pathsPopupMenu", "Landroidx/appcompat/widget/PopupMenu;", "selectionViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/SharingSelectionViewModel;", "getSelectionViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/SharingSelectionViewModel;", "selectionViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/FilesViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/FilesViewModel;", "viewModel$delegate", "onPause", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FileBrowserFragment extends androidx.fragment.app.Fragment {
    @android.annotation.TargetApi(value = 19)
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> addAccess = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy selectionViewModel$delegate = null;
    private androidx.appcompat.widget.PopupMenu pathsPopupMenu;
    private final androidx.activity.OnBackPressedCallback backPressedCallback = null;
    
    public FileBrowserFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.FilesViewModel getViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.SharingSelectionViewModel getSelectionViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
}