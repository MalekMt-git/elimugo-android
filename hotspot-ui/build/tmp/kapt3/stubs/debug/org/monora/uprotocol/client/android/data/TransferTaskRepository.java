package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBI\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;", "", "context", "Landroid/content/Context;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "taskRepository", "Lorg/monora/uprotocol/client/android/data/TaskRepository;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "transportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/backend/Backend;Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/core/protocol/ConnectionFactory;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;Lorg/monora/uprotocol/client/android/data/TaskRepository;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/core/TransportSeat;)V", "rejectTransfer", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "toggleTransferOperation", "detail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "Companion", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class TransferTaskRepository {
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    private final org.monora.uprotocol.client.android.data.ClientRepository clientRepository = null;
    private final org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory = null;
    private final org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider = null;
    private final org.monora.uprotocol.client.android.data.TaskRepository taskRepository = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.core.TransportSeat transportSeat = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.data.TransferTaskRepository.Companion Companion = null;
    private static final java.lang.String TAG = "TransferTaskRepository";
    
    @javax.inject.Inject()
    public TransferTaskRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSeat transportSeat) {
        super();
    }
    
    public final void rejectTransfer(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client) {
    }
    
    public final void toggleTransferOperation(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.TransferDetail detail) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/data/TransferTaskRepository$Companion;", "", "()V", "TAG", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}