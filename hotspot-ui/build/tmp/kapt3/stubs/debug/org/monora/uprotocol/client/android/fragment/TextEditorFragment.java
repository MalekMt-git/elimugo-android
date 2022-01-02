package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J-\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,\"\u0004\u0018\u00010-H\u0016\u00a2\u0006\u0002\u0010.J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020\u0011H\u0016J\u0010\u0010:\u001a\u0002002\u0006\u00104\u001a\u000205H\u0016J\u001a\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010>\u001a\u000200H\u0002J\b\u0010?\u001a\u000200H\u0002J\b\u0010@\u001a\u000200H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"\u00a8\u0006A"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TextEditorFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/genonbeta/android/framework/ui/callback/SnackbarPlacementProvider;", "()V", "args", "Lorg/monora/uprotocol/client/android/fragment/TextEditorFragmentArgs;", "getArgs", "()Lorg/monora/uprotocol/client/android/fragment/TextEditorFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "clientPickerViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "getClientPickerViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "clientPickerViewModel$delegate", "Lkotlin/Lazy;", "shareButton", "Landroid/view/MenuItem;", "sharedText", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "getSharedText", "()Lorg/monora/uprotocol/client/android/database/model/SharedText;", "text", "", "getText", "()Ljava/lang/String;", "textEditorViewModel", "Lorg/monora/uprotocol/client/android/fragment/TextEditorViewModel;", "getTextEditorViewModel", "()Lorg/monora/uprotocol/client/android/fragment/TextEditorViewModel;", "textEditorViewModel$delegate", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/SharedTextsViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/SharedTextsViewModel;", "viewModel$delegate", "checkDeletionNeeded", "", "checkSaveNeeded", "createSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "resId", "", "objects", "", "", "(I[Ljava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "onViewCreated", "view", "Landroid/view/View;", "removeText", "saveText", "updateShareButton", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TextEditorFragment extends androidx.fragment.app.Fragment implements com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy textEditorViewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy clientPickerViewModel$delegate = null;
    private org.monora.uprotocol.client.android.database.model.SharedText sharedText;
    private android.view.MenuItem shareButton;
    
    public TextEditorFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.SharedTextsViewModel getViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.fragment.TextEditorViewModel getTextEditorViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.fragment.TextEditorFragmentArgs getArgs() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel getClientPickerViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.database.model.SharedText getSharedText() {
        return null;
    }
    
    private final java.lang.String getText() {
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
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void removeText() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.snackbar.Snackbar createSnackbar(int resId, @org.jetbrains.annotations.NotNull()
    java.lang.Object... objects) {
        return null;
    }
    
    private final boolean checkDeletionNeeded() {
        return false;
    }
    
    private final boolean checkSaveNeeded() {
        return false;
    }
    
    private final void updateShareButton() {
    }
    
    private final void saveText() {
    }
}