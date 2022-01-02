package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB)\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "taskRepository", "Lorg/monora/uprotocol/client/android/data/TaskRepository;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/client/android/data/TaskRepository;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/database/model/Transfer;)V", "client", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "getClient", "()Landroidx/lifecycle/LiveData;", "rejectionState", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "Lorg/monora/uprotocol/client/android/task/transfer/TransferRejectionParams;", "getRejectionState", "state", "Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "getState", "transferDetail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "getTransferDetail", "getTransferStorage", "Lcom/genonbeta/android/framework/io/DocumentFile;", "remove", "", "Factory", "ModelFactory", "hotspot-ui_debug"})
public final class TransferDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.UClient> client = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.TransferDetail> transferDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel> state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<org.monora.uprotocol.client.android.task.transfer.TransferRejectionParams>> rejectionState = null;
    
    @dagger.assisted.AssistedInject()
    public TransferDetailsViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository userRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    org.monora.uprotocol.client.android.database.model.Transfer transfer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.UClient> getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.TransferDetail> getTransferDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<org.monora.uprotocol.client.android.task.transfer.TransferRejectionParams>> getRejectionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getTransferStorage() {
        return null;
    }
    
    public final void remove() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;", "", "create", "Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "hotspot-ui_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel create(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.Transfer transfer);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$ModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;Lorg/monora/uprotocol/client/android/database/model/Transfer;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotspot-ui_debug"})
    public static final class ModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel.Factory factory = null;
        private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
        
        public ModelFactory(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel.Factory factory, @org.jetbrains.annotations.NotNull()
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