package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ClientsViewModel;", "Landroidx/lifecycle/ViewModel;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "onlineClientRepository", "Lorg/monora/uprotocol/client/android/data/OnlineClientRepository;", "(Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/client/android/data/OnlineClientRepository;)V", "clients", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "getClients", "()Landroidx/lifecycle/LiveData;", "onlineClients", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "getOnlineClients", "hotspot-ui_fossReliantDebug"})
public final class ClientsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> onlineClients = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UClient>> clients = null;
    
    @javax.inject.Inject()
    public ClientsViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.OnlineClientRepository onlineClientRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> getOnlineClients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UClient>> getClients() {
        return null;
    }
}