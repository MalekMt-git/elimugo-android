package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingViewModel;", "Landroidx/lifecycle/ViewModel;", "transportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "fileRepository", "Lorg/monora/uprotocol/client/android/data/FileRepository;", "(Lorg/monora/uprotocol/core/TransportSeat;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/data/FileRepository;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState;", "consumer", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "consume", "", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "groupId", "", "contents", "", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "hotspot-ui_fossReliantDebug"})
public final class SharingViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.core.TransportSeat transportSeat = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.data.FileRepository fileRepository = null;
    private kotlinx.coroutines.Job consumer;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.viewmodel.SharingState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.SharingState> state = null;
    
    @javax.inject.Inject()
    public SharingViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSeat transportSeat, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.FileRepository fileRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.SharingState> getState() {
        return null;
    }
    
    public final void consume(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge, long groupId, @org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> contents) {
    }
}