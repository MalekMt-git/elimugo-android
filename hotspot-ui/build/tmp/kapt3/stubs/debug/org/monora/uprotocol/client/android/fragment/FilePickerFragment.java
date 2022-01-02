package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/FilePickerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addAccess", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "args", "Lorg/monora/uprotocol/client/android/fragment/FilePickerFragmentArgs;", "getArgs", "()Lorg/monora/uprotocol/client/android/fragment/FilePickerFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "createFolderDialog", "Landroidx/appcompat/app/AlertDialog;", "getCreateFolderDialog", "()Landroidx/appcompat/app/AlertDialog;", "createFolderDialog$delegate", "Lkotlin/Lazy;", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/FilesViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/FilesViewModel;", "viewModel$delegate", "addStorageAccess", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "Companion", "SelectionType", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FilePickerFragment extends androidx.fragment.app.Fragment {
    @android.annotation.TargetApi(value = 19)
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> addAccess = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy createFolderDialog$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.FilePickerFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_FILE_PICKED = "resultFilePicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_DOCUMENT_FILE = "extraDocumentFile";
    
    public FilePickerFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.fragment.FilePickerFragmentArgs getArgs() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.FilesViewModel getViewModel() {
        return null;
    }
    
    private final androidx.appcompat.app.AlertDialog getCreateFolderDialog() {
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
    public void onDestroy() {
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
    
    private final void addStorageAccess() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/FilePickerFragment$SelectionType;", "", "(Ljava/lang/String;I)V", "Folder", "File", "hotspot-ui_debug"})
    public static enum SelectionType {
        /*public static final*/ Folder /* = new Folder() */,
        /*public static final*/ File /* = new File() */;
        
        SelectionType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/FilePickerFragment$Companion;", "", "()V", "EXTRA_DOCUMENT_FILE", "", "RESULT_FILE_PICKED", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}