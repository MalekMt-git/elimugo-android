package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/TransferManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "transferTaskRepository", "Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;", "(Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;)V", "rejectTransferRequest", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "toggleTransferOperation", "detail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "hotspot-ui_debug"})
public final class TransferManagerViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.TransferTaskRepository transferTaskRepository = null;
    
    @javax.inject.Inject()
    public TransferManagerViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferTaskRepository transferTaskRepository) {
        super();
    }
    
    public final void rejectTransferRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client) {
    }
    
    public final void toggleTransferOperation(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.TransferDetail detail) {
    }
}