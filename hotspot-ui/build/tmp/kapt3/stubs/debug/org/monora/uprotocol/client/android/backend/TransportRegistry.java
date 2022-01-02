package org.monora.uprotocol.client.android.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001f !B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J=\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2%\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0018j\u0002`\u001bJJ\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162:\u0010\u0017\u001a6\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u001dj\u0002`\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/monora/uprotocol/client/android/backend/TransportRegistry;", "", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "guidanceRequest", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry$GuidanceLifecycleObserver;", "transferRequest", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry$TransferRequestLifecycleObserver;", "handleGuidanceRequest", "", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "handleTransferRequest", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "hasPin", "registerForGuidanceRequests", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lorg/monora/uprotocol/client/android/backend/AcquaintanceCallback;", "registerForTransferRequests", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/backend/TransferRequestCallback;", "GuidanceLifecycleObserver", "HandlerLifecycleObserver", "TransferRequestLifecycleObserver", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class TransportRegistry {
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    private org.monora.uprotocol.client.android.backend.TransportRegistry.GuidanceLifecycleObserver guidanceRequest;
    private org.monora.uprotocol.client.android.backend.TransportRegistry.TransferRequestLifecycleObserver transferRequest;
    
    @javax.inject.Inject()
    public TransportRegistry(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend) {
        super();
    }
    
    public final void handleGuidanceRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
    }
    
    public final boolean handleTransferRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, boolean hasPin) {
        return false;
    }
    
    public final void registerForGuidanceRequests(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.core.CommunicationBridge, kotlin.Unit> callback) {
    }
    
    public final void registerForTransferRequests(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.Transfer, ? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012:\u0010\u0004\u001a6\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\r\u00a2\u0006\u0002\u0010\u000eRE\u0010\u0004\u001a6\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/TransportRegistry$TransferRequestLifecycleObserver;", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry$HandlerLifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "callback", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "Lkotlin/ParameterName;", "name", "transfer", "", "hasPin", "", "Lorg/monora/uprotocol/client/android/backend/TransferRequestCallback;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)V", "getCallback", "()Lkotlin/jvm/functions/Function2;", "hotspot-ui_debug"})
    public static final class TransferRequestLifecycleObserver extends org.monora.uprotocol.client.android.backend.TransportRegistry.HandlerLifecycleObserver {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.Transfer, java.lang.Boolean, kotlin.Unit> callback = null;
        
        public TransferRequestLifecycleObserver(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.Transfer, ? super java.lang.Boolean, kotlin.Unit> callback) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.Transfer, java.lang.Boolean, kotlin.Unit> getCallback() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012%\u0010\u0006\u001a!\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007j\u0002`\r\u00a2\u0006\u0002\u0010\u000eR0\u0010\u0006\u001a!\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007j\u0002`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/TransportRegistry$GuidanceLifecycleObserver;", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry$HandlerLifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "callback", "Lkotlin/Function1;", "Lorg/monora/uprotocol/core/CommunicationBridge;", "Lkotlin/ParameterName;", "name", "bridge", "", "Lorg/monora/uprotocol/client/android/backend/AcquaintanceCallback;", "(Landroidx/lifecycle/LifecycleOwner;Lorg/monora/uprotocol/core/protocol/Direction;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getDirection", "()Lorg/monora/uprotocol/core/protocol/Direction;", "hotspot-ui_debug"})
    public static final class GuidanceLifecycleObserver extends org.monora.uprotocol.client.android.backend.TransportRegistry.HandlerLifecycleObserver {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.core.protocol.Direction direction = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<org.monora.uprotocol.core.CommunicationBridge, kotlin.Unit> callback = null;
        
        public GuidanceLifecycleObserver(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.monora.uprotocol.core.CommunicationBridge, kotlin.Unit> callback) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.core.protocol.Direction getDirection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<org.monora.uprotocol.core.CommunicationBridge, kotlin.Unit> getCallback() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/TransportRegistry$HandlerLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "<set-?>", "", "destroyed", "getDestroyed", "()Z", "enabled", "getEnabled", "destroy", "", "start", "stop", "hotspot-ui_debug"})
    public static class HandlerLifecycleObserver implements androidx.lifecycle.LifecycleObserver {
        private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
        private boolean enabled = false;
        private boolean destroyed = false;
        
        public HandlerLifecycleObserver(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final boolean getDestroyed() {
            return false;
        }
        
        @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_RESUME)
        public final void start() {
        }
        
        @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
        public final void stop() {
        }
        
        @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
        public final void destroy() {
        }
    }
}