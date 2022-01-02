package org.monora.uprotocol.client.android.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\b\'\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\u0005J\u0012\u00103\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u000201H\u0014J\b\u00107\u001a\u000201H\u0014J+\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u000201H\u0014J\u001a\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020\u00162\b\u0010D\u001a\u0004\u0018\u00010=H\u0016J\b\u0010E\u001a\u000201H\u0014J\b\u0010F\u001a\u000201H\u0014J(\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020\u00052\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u0005\u0018\u00010JH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0007R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0005@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010-\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0005@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010+\u00a8\u0006L"}, d2 = {"Lorg/monora/uprotocol/client/android/app/Activity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "amoledThemeEnabled", "", "getAmoledThemeEnabled", "()Z", "amoledThemeState", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "setBackend", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "customFontsEnabled", "getCustomFontsEnabled", "customFontsState", "darkThemeEnabled", "getDarkThemeEnabled", "darkThemeState", "defaultPreferences", "Landroid/content/SharedPreferences;", "getDefaultPreferences", "()Landroid/content/SharedPreferences;", "intentFilter", "Landroid/content/IntentFilter;", "ongoingRequest", "Landroidx/appcompat/app/AlertDialog;", "powerSaveEnabled", "getPowerSaveEnabled", "receiver", "Landroid/content/BroadcastReceiver;", "sharedTextRepository", "Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "getSharedTextRepository", "()Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "setSharedTextRepository", "(Lorg/monora/uprotocol/client/android/data/SharedTextRepository;)V", "<set-?>", "skipPermissionRequest", "getSkipPermissionRequest", "setSkipPermissionRequest", "(Z)V", "themeLoadingFailed", "welcomePageDisallowed", "getWelcomePageDisallowed", "setWelcomePageDisallowed", "checkForThemeChange", "", "hasIntroductionShown", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "key", "onStart", "onStop", "requestRequiredPermissions", "finishOtherwise", "results", "", "Companion", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class Activity extends androidx.appcompat.app.AppCompatActivity implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.backend.Backend backend;
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository;
    private boolean amoledThemeState = false;
    private boolean customFontsState = false;
    private boolean darkThemeState = false;
    private final android.content.IntentFilter intentFilter = null;
    private androidx.appcompat.app.AlertDialog ongoingRequest;
    private final android.content.BroadcastReceiver receiver = null;
    private boolean skipPermissionRequest = false;
    private boolean themeLoadingFailed = false;
    private boolean welcomePageDisallowed = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.app.Activity.Companion Companion = null;
    private static final java.lang.String TAG = "Activity (monora)";
    private static final java.lang.String ACTION_SYSTEM_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
    private static final int REQUEST_PERMISSION = 1;
    
    public Activity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.data.SharedTextRepository getSharedTextRepository() {
        return null;
    }
    
    public final void setSharedTextRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SharedTextRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.SharedPreferences getDefaultPreferences() {
        return null;
    }
    
    private final boolean getAmoledThemeEnabled() {
        return false;
    }
    
    private final boolean getCustomFontsEnabled() {
        return false;
    }
    
    private final boolean getDarkThemeEnabled() {
        return false;
    }
    
    private final boolean getPowerSaveEnabled() {
        return false;
    }
    
    public final boolean getSkipPermissionRequest() {
        return false;
    }
    
    protected final void setSkipPermissionRequest(boolean p0) {
    }
    
    public final boolean getWelcomePageDisallowed() {
        return false;
    }
    
    protected final void setWelcomePageDisallowed(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void checkForThemeChange() {
    }
    
    public final boolean hasIntroductionShown() {
        return false;
    }
    
    private final void requestRequiredPermissions(boolean finishOtherwise, java.util.Map<java.lang.String, java.lang.Boolean> results) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/app/Activity$Companion;", "", "()V", "ACTION_SYSTEM_POWER_SAVE_MODE_CHANGED", "", "REQUEST_PERMISSION", "", "TAG", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}