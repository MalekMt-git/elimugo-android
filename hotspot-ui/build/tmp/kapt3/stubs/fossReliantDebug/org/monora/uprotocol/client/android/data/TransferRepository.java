package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0&0\"J+\u0010\'\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&0\"2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u001f\u0010.\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0019\u0010.\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001e\u00101\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u000203J\u0019\u00104\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u00104\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lorg/monora/uprotocol/client/android/data/TransferRepository;", "", "context", "Landroid/content/Context;", "fileRepository", "Lorg/monora/uprotocol/client/android/data/FileRepository;", "transferDao", "Lorg/monora/uprotocol/client/android/database/TransferDao;", "transferItemDao", "Lorg/monora/uprotocol/client/android/database/TransferItemDao;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/FileRepository;Lorg/monora/uprotocol/client/android/database/TransferDao;Lorg/monora/uprotocol/client/android/database/TransferItemDao;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "containsTransfer", "", "groupId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/database/model/Transfer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferItem", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "(Lorg/monora/uprotocol/client/android/database/model/UTransferItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIncomingFile", "Lcom/genonbeta/android/framework/io/DocumentFile;", "getIncomingPseudoFile", "item", "createIfNeeded", "getReceivable", "getTransfer", "getTransferDetail", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "getTransferDetailDirect", "getTransferDetails", "", "getTransferItem", "id", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "(JJLorg/monora/uprotocol/core/protocol/Direction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransferItems", "getTransferStorage", "insert", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveReceivedFile", "currentFile", "Lorg/monora/uprotocol/core/transfer/TransferItem;", "update", "hotspot-ui_fossReliantDebug"})
@javax.inject.Singleton()
public final class TransferRepository {
    private final org.monora.uprotocol.client.android.data.FileRepository fileRepository = null;
    private final org.monora.uprotocol.client.android.database.TransferDao transferDao = null;
    private final org.monora.uprotocol.client.android.database.TransferItemDao transferItemDao = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    
    @javax.inject.Inject()
    public TransferRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.FileRepository fileRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.TransferDao transferDao, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.TransferItemDao transferItemDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object containsTransfer(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem transferItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getIncomingFile(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem transferItem, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer) {
        return null;
    }
    
    private final com.genonbeta.android.framework.io.DocumentFile getIncomingPseudoFile(org.monora.uprotocol.client.android.database.model.UTransferItem item, org.monora.uprotocol.client.android.database.model.Transfer transfer, boolean createIfNeeded) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReceivable(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UTransferItem> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTransfer(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.Transfer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.TransferDetail> getTransferDetail(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.monora.uprotocol.client.android.database.model.TransferDetail getTransferDetailDirect(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.TransferDetail>> getTransferDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTransferItem(long groupId, long id, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UTransferItem> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem>> getTransferItems(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getTransferStorage(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile saveReceivedFile(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile currentFile, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem transferItem) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem transferItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}