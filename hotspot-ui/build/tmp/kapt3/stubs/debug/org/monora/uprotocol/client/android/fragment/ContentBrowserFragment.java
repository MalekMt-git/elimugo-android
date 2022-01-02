package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ContentBrowserFragment;", "Landroidx/fragment/app/Fragment;", "()V", "clientPickerViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "getClientPickerViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "clientPickerViewModel$delegate", "Lkotlin/Lazy;", "contentBrowserViewModel", "Lorg/monora/uprotocol/client/android/fragment/ContentBrowserViewModel;", "getContentBrowserViewModel", "()Lorg/monora/uprotocol/client/android/fragment/ContentBrowserViewModel;", "contentBrowserViewModel$delegate", "selectionViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/SharingSelectionViewModel;", "getSelectionViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/SharingSelectionViewModel;", "selectionViewModel$delegate", "sharingViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/SharingViewModel;", "getSharingViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/SharingViewModel;", "sharingViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ContentBrowserFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy selectionViewModel$delegate = null;
    private final kotlin.Lazy clientPickerViewModel$delegate = null;
    private final kotlin.Lazy sharingViewModel$delegate = null;
    private final kotlin.Lazy contentBrowserViewModel$delegate = null;
    
    public ContentBrowserFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.SharingSelectionViewModel getSelectionViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel getClientPickerViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.SharingViewModel getSharingViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.fragment.ContentBrowserViewModel getContentBrowserViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}