package org.monora.uprotocol.client.android.activity;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerActivity;", "Lorg/monora/uprotocol/client/android/app/Activity;", "()V", "factory", "Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;", "getFactory", "()Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;", "setFactory", "(Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;)V", "uri", "Landroid/net/Uri;", "viewModel", "Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "Companion", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PackageInstallerActivity extends org.monora.uprotocol.client.android.app.Activity {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.Factory factory;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.activity.PackageInstallerActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PACKAGE_INSTALLED_ACTION = "com.example.android.apis.content.SESSION_API_PACKAGE_INSTALLED";
    
    public PackageInstallerActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.Factory p0) {
    }
    
    private final org.monora.uprotocol.client.android.activity.PackageInstallerViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerActivity$Companion;", "", "()V", "PACKAGE_INSTALLED_ACTION", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}