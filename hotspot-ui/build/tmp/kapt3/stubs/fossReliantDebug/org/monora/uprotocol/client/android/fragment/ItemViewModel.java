package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemViewModel;", "Landroidx/lifecycle/ViewModel;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/database/model/Transfer;)V", "items", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "getItems", "()Landroidx/lifecycle/LiveData;", "open", "", "context", "Landroid/content/Context;", "item", "recover", "Factory", "ModelFactory", "hotspot-ui_fossReliantDebug"})
public final class ItemViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem>> items = null;
    
    @dagger.assisted.AssistedInject()
    public ItemViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    org.monora.uprotocol.client.android.database.model.Transfer transfer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem>> getItems() {
        return null;
    }
    
    public final void open(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem item) {
    }
    
    public final void recover(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem item) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemViewModel$Factory;", "", "create", "Lorg/monora/uprotocol/client/android/fragment/ItemViewModel;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "hotspot-ui_fossReliantDebug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.monora.uprotocol.client.android.fragment.ItemViewModel create(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.Transfer transfer);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemViewModel$ModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/monora/uprotocol/client/android/fragment/ItemViewModel$Factory;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/fragment/ItemViewModel$Factory;Lorg/monora/uprotocol/client/android/database/model/Transfer;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotspot-ui_fossReliantDebug"})
    public static final class ModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.monora.uprotocol.client.android.fragment.ItemViewModel.Factory factory = null;
        private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
        
        public ModelFactory(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.fragment.ItemViewModel.Factory factory, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.Transfer transfer) {
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