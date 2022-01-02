package org.monora.uprotocol.client.android.service;

import java.lang.System;

/**
 * created by: Veli
 * date: 10.10.2017 07:58
 */
@androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/service/TogglingTileService;", "Landroid/service/quicksettings/TileService;", "()V", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "setBackend", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "observer", "Landroidx/lifecycle/Observer;", "", "onClick", "", "onStartListening", "onStopListening", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TogglingTileService extends android.service.quicksettings.TileService {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.backend.Backend backend;
    private final androidx.lifecycle.Observer<java.lang.Boolean> observer = null;
    
    public TogglingTileService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend p0) {
    }
    
    @java.lang.Override()
    public void onStartListening() {
    }
    
    @java.lang.Override()
    public void onStopListening() {
    }
    
    @java.lang.Override()
    public void onClick() {
    }
}