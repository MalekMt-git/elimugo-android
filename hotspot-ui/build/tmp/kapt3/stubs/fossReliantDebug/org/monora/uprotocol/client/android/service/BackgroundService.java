package org.monora.uprotocol.client.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/monora/uprotocol/client/android/service/BackgroundService;", "Landroidx/lifecycle/LifecycleService;", "()V", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "setBackend", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "binder", "Lorg/monora/uprotocol/client/android/service/BackgroundService$LocalBinder;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "LocalBinder", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BackgroundService extends androidx.lifecycle.LifecycleService {
    private final org.monora.uprotocol.client.android.service.BackgroundService.LocalBinder binder = null;
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.backend.Backend backend;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.service.BackgroundService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_ALL = "org.monora.uprotocol.client.android.action.STOP_ALL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_BG_SERVICE = "org.monora.uprotocol.client.android.action.STOP_BG_SERVICE";
    
    public BackgroundService() {
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
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/service/BackgroundService$LocalBinder;", "Landroid/os/Binder;", "(Lorg/monora/uprotocol/client/android/service/BackgroundService;)V", "service", "Lorg/monora/uprotocol/client/android/service/BackgroundService;", "getService", "()Lorg/monora/uprotocol/client/android/service/BackgroundService;", "hotspot-ui_fossReliantDebug"})
    public final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.BackgroundService getService() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/service/BackgroundService$Companion;", "", "()V", "ACTION_STOP_ALL", "", "ACTION_STOP_BG_SERVICE", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}