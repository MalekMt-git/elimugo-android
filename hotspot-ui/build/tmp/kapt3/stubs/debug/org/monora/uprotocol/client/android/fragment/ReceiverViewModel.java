package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00070\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ReceiverViewModel;", "Landroidx/lifecycle/ViewModel;", "transportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "(Lorg/monora/uprotocol/core/TransportSeat;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/GuidanceRequestState;", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "consume", "", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "hotspot-ui_debug"})
public final class ReceiverViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.core.TransportSeat transportSeat = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.GuidanceRequestState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.GuidanceRequestState> state = null;
    
    @javax.inject.Inject()
    public ReceiverViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSeat transportSeat) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.GuidanceRequestState> getState() {
        return null;
    }
    
    public final void consume(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge) {
    }
}