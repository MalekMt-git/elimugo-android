package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionViewModel;", "Landroidx/lifecycle/ViewModel;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "(Lorg/monora/uprotocol/core/protocol/ConnectionFactory;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;)V", "_job", "Lkotlinx/coroutines/Job;", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/ManualConnectionState;", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "connect", "address", "", "hotspot-ui_debug"})
public final class ManualConnectionViewModel extends androidx.lifecycle.ViewModel {
    private org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory;
    private org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState> _state = null;
    private kotlinx.coroutines.Job _job;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState> state = null;
    
    @javax.inject.Inject()
    public ManualConnectionViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.pickclient.ManualConnectionState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job connect(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
}