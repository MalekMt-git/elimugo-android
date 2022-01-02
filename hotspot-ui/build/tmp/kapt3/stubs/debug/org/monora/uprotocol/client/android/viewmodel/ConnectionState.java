package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState;", "", "isConnecting", "", "isError", "(ZZ)V", "()Z", "Connected", "Connecting", "Error", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Connected;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Error;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Connecting;", "hotspot-ui_debug"})
public abstract class ConnectionState {
    private final boolean isConnecting = false;
    private final boolean isError = false;
    
    private ConnectionState(boolean isConnecting, boolean isError) {
        super();
    }
    
    public final boolean isConnecting() {
        return false;
    }
    
    public final boolean isError() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Connected;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState;", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "(Lorg/monora/uprotocol/core/CommunicationBridge;)V", "getBridge", "()Lorg/monora/uprotocol/core/CommunicationBridge;", "hotspot-ui_debug"})
    public static final class Connected extends org.monora.uprotocol.client.android.viewmodel.ConnectionState {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.core.CommunicationBridge bridge = null;
        
        public Connected(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.CommunicationBridge bridge) {
            super(false, false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.core.CommunicationBridge getBridge() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Error;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "hotspot-ui_debug"})
    public static final class Error extends org.monora.uprotocol.client.android.viewmodel.ConnectionState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception e = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
            super(false, false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState$Connecting;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState;", "()V", "hotspot-ui_debug"})
    public static final class Connecting extends org.monora.uprotocol.client.android.viewmodel.ConnectionState {
        
        public Connecting() {
            super(false, false);
        }
    }
}