package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ClientConnectionViewModel;", "Landroidx/lifecycle/ViewModel;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "(Lorg/monora/uprotocol/core/protocol/ConnectionFactory;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;Lorg/monora/uprotocol/client/android/data/ClientRepository;)V", "getClientRepository", "()Lorg/monora/uprotocol/client/android/data/ClientRepository;", "setClientRepository", "(Lorg/monora/uprotocol/client/android/data/ClientRepository;)V", "getConnectionFactory", "()Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "job", "Lkotlinx/coroutines/Job;", "getPersistenceProvider", "()Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/viewmodel/ConnectionState;", "getState", "()Landroidx/lifecycle/MutableLiveData;", "start", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "address", "Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "hotspot-ui_debug"})
public final class ClientConnectionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider = null;
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.client.android.data.ClientRepository clientRepository;
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.viewmodel.ConnectionState> state = null;
    
    @javax.inject.Inject()
    public ClientConnectionViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.ConnectionFactory getConnectionFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.persistence.PersistenceProvider getPersistenceProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.data.ClientRepository getClientRepository() {
        return null;
    }
    
    public final void setClientRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.viewmodel.ConnectionState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job start(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.Nullable()
    org.monora.uprotocol.client.android.database.model.UClientAddress address) {
        return null;
    }
}