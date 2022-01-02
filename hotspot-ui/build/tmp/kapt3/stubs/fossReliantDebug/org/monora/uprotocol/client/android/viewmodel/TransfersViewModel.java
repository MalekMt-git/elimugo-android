package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00102\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/TransfersViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "sharedTextRepository", "Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "taskRepository", "Lorg/monora/uprotocol/client/android/data/TaskRepository;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "webDataRepository", "Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/client/android/data/SharedTextRepository;Lorg/monora/uprotocol/client/android/data/TaskRepository;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/data/WebDataRepository;)V", "transfers", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/model/ListItem;", "kotlin.jvm.PlatformType", "getTransfers", "()Landroidx/lifecycle/LiveData;", "getClient", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "clientUid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "groupId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "transferDetail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "hotspot-ui_fossReliantDebug"})
public final class TransfersViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.ClientRepository clientRepository = null;
    private final org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository = null;
    private final org.monora.uprotocol.client.android.data.TaskRepository taskRepository = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ListItem>> transfers = null;
    
    @javax.inject.Inject()
    public TransfersViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ListItem>> getTransfers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTransfer(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.Transfer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getClient(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UClient> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel> subscribe(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.TransferDetail transferDetail) {
        return null;
    }
}