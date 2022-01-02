package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u001d\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "isInProgress", "", "(Lorg/monora/uprotocol/core/protocol/Client;Z)V", "getClient", "()Lorg/monora/uprotocol/core/protocol/Client;", "()Z", "Error", "Finishing", "InProgress", "Success", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$InProgress;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Success;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Finishing;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Error;", "hotspot-ui_fossReliantDebug"})
public abstract class GuidanceRequestState {
    @org.jetbrains.annotations.Nullable()
    private final org.monora.uprotocol.core.protocol.Client client = null;
    private final boolean isInProgress = false;
    
    private GuidanceRequestState(org.monora.uprotocol.core.protocol.Client client, boolean isInProgress) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.monora.uprotocol.core.protocol.Client getClient() {
        return null;
    }
    
    public final boolean isInProgress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$InProgress;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "()V", "hotspot-ui_fossReliantDebug"})
    public static final class InProgress extends org.monora.uprotocol.client.android.fragment.GuidanceRequestState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.fragment.GuidanceRequestState.InProgress INSTANCE = null;
        
        private InProgress() {
            super(null, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Success;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "(Lorg/monora/uprotocol/core/protocol/Client;)V", "hotspot-ui_fossReliantDebug"})
    public static final class Success extends org.monora.uprotocol.client.android.fragment.GuidanceRequestState {
        
        public Success(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.protocol.Client client) {
            super(null, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Finishing;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "(Lorg/monora/uprotocol/core/protocol/Client;)V", "hotspot-ui_fossReliantDebug"})
    public static final class Finishing extends org.monora.uprotocol.client.android.fragment.GuidanceRequestState {
        
        public Finishing(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.protocol.Client client) {
            super(null, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState$Error;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lorg/monora/uprotocol/core/protocol/Client;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "hotspot-ui_fossReliantDebug"})
    public static final class Error extends org.monora.uprotocol.client.android.fragment.GuidanceRequestState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super(null, false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
    }
}