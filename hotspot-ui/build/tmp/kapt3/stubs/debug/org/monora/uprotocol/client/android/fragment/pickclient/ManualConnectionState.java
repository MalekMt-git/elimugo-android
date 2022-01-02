package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState;", "", "loading", "", "(Z)V", "getLoading", "()Z", "Error", "Loaded", "Loading", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Loading;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Error;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Loaded;", "hotspot-ui_debug"})
public abstract class ManualConnectionState {
    private final boolean loading = false;
    
    private ManualConnectionState(boolean loading) {
        super();
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Loading;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState;", "()V", "hotspot-ui_debug"})
    public static final class Loading extends org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState {
        
        public Loading() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Error;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "hotspot-ui_debug"})
    public static final class Error extends org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState$Loaded;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState;", "clientRoute", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "isUsed", "", "(Lorg/monora/uprotocol/client/android/model/ClientRoute;Z)V", "getClientRoute", "()Lorg/monora/uprotocol/client/android/model/ClientRoute;", "()Z", "setUsed", "(Z)V", "hotspot-ui_debug"})
    public static final class Loaded extends org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.model.ClientRoute clientRoute = null;
        private boolean isUsed;
        
        public Loaded(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.model.ClientRoute clientRoute, boolean isUsed) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.model.ClientRoute getClientRoute() {
            return null;
        }
        
        public final boolean isUsed() {
            return false;
        }
        
        public final void setUsed(boolean p0) {
        }
    }
}