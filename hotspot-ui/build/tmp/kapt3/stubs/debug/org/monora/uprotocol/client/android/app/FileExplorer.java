package org.monora.uprotocol.client.android.app;

import java.lang.System;

/**
 * created by: Veli
 * date: 25.02.2018 01:23
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/app/FileExplorer;", "Landroidx/multidex/MultiDexApplication;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "crashLogFile", "Ljava/io/File;", "defaultExceptionHandler", "initializeSettings", "", "onCreate", "uncaughtException", "t", "Ljava/lang/Thread;", "e", "", "Companion", "hotspot-ui_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class FileExplorer extends androidx.multidex.MultiDexApplication implements java.lang.Thread.UncaughtExceptionHandler {
    private java.io.File crashLogFile;
    private java.lang.Thread.UncaughtExceptionHandler defaultExceptionHandler;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.app.FileExplorer.Companion Companion = null;
    private static final java.lang.String TAG = "App";
    private static final int MIGRATION_NONE = -1;
    
    public FileExplorer() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initializeSettings() {
    }
    
    @java.lang.Override()
    public void uncaughtException(@org.jetbrains.annotations.NotNull()
    java.lang.Thread t, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/app/FileExplorer$Companion;", "", "()V", "MIGRATION_NONE", "", "TAG", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}