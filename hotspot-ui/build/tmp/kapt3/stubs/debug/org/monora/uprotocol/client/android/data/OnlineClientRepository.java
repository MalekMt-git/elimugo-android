package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/data/OnlineClientRepository;", "", "nsdDaemon", "Lorg/monora/uprotocol/client/android/util/NsdDaemon;", "(Lorg/monora/uprotocol/client/android/util/NsdDaemon;)V", "getOnlineClients", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class OnlineClientRepository {
    private final org.monora.uprotocol.client.android.util.NsdDaemon nsdDaemon = null;
    
    @javax.inject.Inject()
    public OnlineClientRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.NsdDaemon nsdDaemon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> getOnlineClients() {
        return null;
    }
}