package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0011J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/monora/uprotocol/client/android/data/ExtrasRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "crashLogFile", "Ljava/io/File;", "kotlin.jvm.PlatformType", "getCrashLogFile", "()Ljava/io/File;", "crashLogFile$delegate", "Lkotlin/Lazy;", "preferences", "Landroid/content/SharedPreferences;", "clearCrashLog", "", "getChangelog", "Landroidx/lifecycle/LiveData;", "Landroid/text/Spanned;", "getCrashLog", "", "getLicenses", "", "Lorg/monora/uprotocol/client/android/model/LibraryLicense;", "shouldShowCrashLog", "", "Companion", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class ExtrasRepository {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences preferences = null;
    private final kotlin.Lazy crashLogFile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.data.ExtrasRepository.Companion Companion = null;
    private static final java.lang.String TAG = "ExtrasRepository";
    private static final java.lang.String KEY_CHANGELOG_SEEN_VERSION = "changelog_seen_version";
    private static final java.lang.String FILE_UNHANDLED_CRASH_LOG = "unhandled_crash_log.txt";
    
    @javax.inject.Inject()
    public ExtrasRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    private final java.io.File getCrashLogFile() {
        return null;
    }
    
    public final void clearCrashLog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spanned> getChangelog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCrashLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.LibraryLicense>> getLicenses() {
        return null;
    }
    
    public final boolean shouldShowCrashLog() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/data/ExtrasRepository$Companion;", "", "()V", "FILE_UNHANDLED_CRASH_LOG", "", "KEY_CHANGELOG_SEEN_VERSION", "TAG", "getCrashLogFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getCrashLogFile(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}