package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2%\u0010\u0010\u001a!\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u0014JJ\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2:\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000b0\u0016j\u0002`\u001bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "transportRegistry", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry;", "(Lorg/monora/uprotocol/client/android/backend/TransportRegistry;)V", "bridge", "Lorg/monora/uprotocol/client/android/lifecycle/SingleLiveEvent;", "Lorg/monora/uprotocol/core/CommunicationBridge;", "getBridge", "()Lorg/monora/uprotocol/client/android/lifecycle/SingleLiveEvent;", "registerForGuidanceRequests", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lorg/monora/uprotocol/client/android/backend/AcquaintanceCallback;", "registerForTransferRequests", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "transfer", "", "hasPin", "Lorg/monora/uprotocol/client/android/backend/TransferRequestCallback;", "hotspot-ui_debug"})
public final class ClientPickerViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.backend.TransportRegistry transportRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.lifecycle.SingleLiveEvent<org.monora.uprotocol.core.CommunicationBridge> bridge = null;
    
    @javax.inject.Inject()
    public ClientPickerViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.TransportRegistry transportRegistry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.lifecycle.SingleLiveEvent<org.monora.uprotocol.core.CommunicationBridge> getBridge() {
        return null;
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
}