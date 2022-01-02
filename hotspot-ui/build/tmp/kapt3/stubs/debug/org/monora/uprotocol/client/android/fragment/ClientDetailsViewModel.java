package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "(Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/client/android/database/model/UClient;)V", "Landroidx/lifecycle/LiveData;", "getClient", "()Landroidx/lifecycle/LiveData;", "Factory", "ModelFactory", "hotspot-ui_debug"})
public final class ClientDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.UClient> client = null;
    
    @dagger.assisted.AssistedInject()
    public ClientDetailsViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    org.monora.uprotocol.client.android.database.model.UClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.UClient> getClient() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel$Factory;", "", "create", "Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel;", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "hotspot-ui_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.monora.uprotocol.client.android.fragment.ClientDetailsViewModel create(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.UClient client);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel$ModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel$Factory;", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "(Lorg/monora/uprotocol/client/android/fragment/ClientDetailsViewModel$Factory;Lorg/monora/uprotocol/client/android/database/model/UClient;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotspot-ui_debug"})
    public static final class ModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.monora.uprotocol.client.android.fragment.ClientDetailsViewModel.Factory factory = null;
        private final org.monora.uprotocol.client.android.database.model.UClient client = null;
        
        public ModelFactory(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.fragment.ClientDetailsViewModel.Factory factory, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.UClient client) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}