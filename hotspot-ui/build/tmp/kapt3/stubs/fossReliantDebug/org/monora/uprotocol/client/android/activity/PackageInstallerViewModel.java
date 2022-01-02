package org.monora.uprotocol.client.android.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003+,-B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020\'H\u0014J\u0016\u0010(\u001a\u00020\'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0010*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u00060\u001fR\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", "_installationDetails", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/activity/PackageDetails;", "_installationState", "Lorg/monora/uprotocol/client/android/activity/PreparationState;", "_installationStatusText", "", "installationDetails", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getInstallationDetails", "()Landroidx/lifecycle/LiveData;", "installationState", "getInstallationState", "installationStatusText", "getInstallationStatusText", "isAborted", "", "()Z", "packageInstaller", "Landroid/content/pm/PackageInstaller;", "packageManager", "Landroid/content/pm/PackageManager;", "sessionCallback", "Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$MySessionCallback;", "getSessionCallback", "()Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$MySessionCallback;", "sessionCallback$delegate", "Lkotlin/Lazy;", "sessionId", "", "onCleared", "", "submitInstallationResult", "intent", "Landroid/content/Intent;", "Factory", "ModelFactory", "MySessionCallback", "hotspot-ui_fossReliantDebug"})
public final class PackageInstallerViewModel extends androidx.lifecycle.ViewModel {
    private final android.net.Uri uri = null;
    private final android.content.pm.PackageManager packageManager = null;
    private final android.content.pm.PackageInstaller packageInstaller = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.activity.PackageDetails> _installationDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.activity.PackageDetails> installationDetails = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.activity.PreparationState> _installationState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.activity.PreparationState> installationState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _installationStatusText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> installationStatusText = null;
    private final kotlin.Lazy sessionCallback$delegate = null;
    private final int sessionId = 0;
    
    @dagger.assisted.AssistedInject()
    public PackageInstallerViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.net.Uri uri) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.activity.PackageDetails> getInstallationDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.activity.PreparationState> getInstallationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getInstallationStatusText() {
        return null;
    }
    
    public final boolean isAborted() {
        return false;
    }
    
    private final org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.MySessionCallback getSessionCallback() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void submitInstallationResult(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$MySessionCallback;", "Landroid/content/pm/PackageInstaller$SessionCallback;", "(Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel;)V", "onActiveChanged", "", "sessionId", "", "active", "", "onBadgingChanged", "onCreated", "onFinished", "success", "onProgressChanged", "progress", "", "hotspot-ui_fossReliantDebug"})
    final class MySessionCallback extends android.content.pm.PackageInstaller.SessionCallback {
        
        public MySessionCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onCreated(int sessionId) {
        }
        
        @java.lang.Override()
        public void onBadgingChanged(int sessionId) {
        }
        
        @java.lang.Override()
        public void onActiveChanged(int sessionId, boolean active) {
        }
        
        @java.lang.Override()
        public void onProgressChanged(int sessionId, float progress) {
        }
        
        @java.lang.Override()
        public void onFinished(int sessionId, boolean success) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;", "", "create", "Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel;", "uri", "Landroid/net/Uri;", "hotspot-ui_fossReliantDebug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.monora.uprotocol.client.android.activity.PackageInstallerViewModel create(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$ModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;", "uri", "Landroid/net/Uri;", "(Lorg/monora/uprotocol/client/android/activity/PackageInstallerViewModel$Factory;Landroid/net/Uri;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotspot-ui_fossReliantDebug"})
    public static final class ModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.Factory factory = null;
        private final android.net.Uri uri = null;
        
        public ModelFactory(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.activity.PackageInstallerViewModel.Factory factory, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}