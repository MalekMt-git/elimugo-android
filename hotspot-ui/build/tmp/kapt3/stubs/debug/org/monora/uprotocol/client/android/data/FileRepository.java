package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\bJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0!J\u0019\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00030\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lorg/monora/uprotocol/client/android/data/FileRepository;", "", "context", "Landroid/content/Context;", "safFolderDao", "Lorg/monora/uprotocol/client/android/database/SafFolderDao;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/database/SafFolderDao;)V", "value", "Lcom/genonbeta/android/framework/io/DocumentFile;", "appDirectory", "getAppDirectory", "()Lcom/genonbeta/android/framework/io/DocumentFile;", "setAppDirectory", "(Lcom/genonbeta/android/framework/io/DocumentFile;)V", "contextWeak", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "defaultAppDirectory", "Ljava/io/File;", "getDefaultAppDirectory", "()Ljava/io/File;", "defaultAppDirectory$delegate", "Lkotlin/Lazy;", "preferences", "Landroid/content/SharedPreferences;", "clearStorageList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileList", "", "Lorg/monora/uprotocol/client/android/model/FileModel;", "file", "getSafFolders", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/database/model/SafFolder;", "insertFolder", "safFolder", "(Lorg/monora/uprotocol/client/android/database/model/SafFolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class FileRepository {
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.database.SafFolderDao safFolderDao = null;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeak = null;
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy defaultAppDirectory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.data.FileRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STORAGE_PATH = "storage_path";
    
    @javax.inject.Inject()
    public FileRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.SafFolderDao safFolderDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getAppDirectory() {
        return null;
    }
    
    public final void setAppDirectory(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDefaultAppDirectory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearStorageList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.model.FileModel> getFileList(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.SafFolder>> getSafFolders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SafFolder safFolder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/data/FileRepository$Companion;", "", "()V", "KEY_STORAGE_PATH", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}