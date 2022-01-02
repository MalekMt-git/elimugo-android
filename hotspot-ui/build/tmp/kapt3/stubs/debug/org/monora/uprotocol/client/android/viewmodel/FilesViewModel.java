package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020,J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00103\u001a\u00020\u0011H\u0002J\u0006\u00104\u001a\u00020\u001eJ\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0007J\u0006\u00108\u001a\u00020/J\u000e\u00109\u001a\u00020/2\u0006\u00103\u001a\u00020\u0011J\u000e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020&J\u0010\u0010;\u001a\u00020/2\u0006\u00103\u001a\u00020\u0011H\u0002J\u0006\u0010<\u001a\u00020/R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00030\u00030\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0018*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u000e0\u000e0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR+\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0018*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/FilesViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "fileRepository", "Lorg/monora/uprotocol/client/android/data/FileRepository;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/FileRepository;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "_files", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/monora/uprotocol/client/android/model/ListItem;", "_path", "Lorg/monora/uprotocol/client/android/model/FileModel;", "_pathTree", "value", "Lcom/genonbeta/android/framework/io/DocumentFile;", "appDirectory", "getAppDirectory", "()Lcom/genonbeta/android/framework/io/DocumentFile;", "setAppDirectory", "(Lcom/genonbeta/android/framework/io/DocumentFile;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "files", "Landroidx/lifecycle/LiveData;", "getFiles", "()Landroidx/lifecycle/LiveData;", "isCustomStorageFolder", "", "()Z", "path", "getPath", "pathTree", "getPathTree", "safAdded", "Lorg/monora/uprotocol/client/android/lifecycle/SingleLiveEvent;", "Lorg/monora/uprotocol/client/android/database/model/SafFolder;", "getSafAdded", "()Lorg/monora/uprotocol/client/android/lifecycle/SingleLiveEvent;", "safFolders", "getSafFolders", "textFile", "", "textFolder", "clearStorageList", "", "createFolder", "displayName", "createOrderedFileList", "file", "goUp", "insertSafFolder", "uri", "Landroid/net/Uri;", "requestDefaultStorageFolder", "requestPath", "folder", "requestPathInternal", "requestStorageFolder", "hotspot-ui_debug"})
public final class FilesViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.FileRepository fileRepository = null;
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    private final java.lang.String textFolder = null;
    private final java.lang.String textFile = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.monora.uprotocol.client.android.model.ListItem>> _files = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ListItem>> files = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.model.FileModel> _path = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.model.FileModel> path = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.monora.uprotocol.client.android.model.FileModel>> _pathTree = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.FileModel>> pathTree = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.lifecycle.SingleLiveEvent<org.monora.uprotocol.client.android.database.model.SafFolder> safAdded = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.SafFolder>> safFolders = null;
    
    @javax.inject.Inject()
    public FilesViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.FileRepository fileRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ListItem>> getFiles() {
        return null;
    }
    
    public final boolean isCustomStorageFolder() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.model.FileModel> getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.FileModel>> getPathTree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.lifecycle.SingleLiveEvent<org.monora.uprotocol.client.android.database.model.SafFolder> getSafAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.SafFolder>> getSafFolders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getAppDirectory() {
        return null;
    }
    
    public final void setAppDirectory(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile value) {
    }
    
    public final void clearStorageList() {
    }
    
    public final boolean createFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String displayName) {
        return false;
    }
    
    private final java.util.List<org.monora.uprotocol.client.android.model.ListItem> createOrderedFileList(com.genonbeta.android.framework.io.DocumentFile file) {
        return null;
    }
    
    public final boolean goUp() {
        return false;
    }
    
    @android.annotation.TargetApi(value = 19)
    public final void insertSafFolder(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void requestDefaultStorageFolder() {
    }
    
    public final void requestStorageFolder() {
    }
    
    public final void requestPath(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file) {
    }
    
    public final void requestPath(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SafFolder folder) {
    }
    
    private final void requestPathInternal(com.genonbeta.android.framework.io.DocumentFile file) {
    }
}