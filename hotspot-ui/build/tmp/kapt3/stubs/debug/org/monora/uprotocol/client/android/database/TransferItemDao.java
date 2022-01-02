package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u00122\u0006\u0010\b\u001a\u00020\tH\'J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lorg/monora/uprotocol/client/android/database/TransferItemDao;", "", "delete", "", "transferItem", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "(Lorg/monora/uprotocol/client/android/database/model/UTransferItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "groupId", "", "id", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "(JJLorg/monora/uprotocol/core/protocol/Direction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "", "(Ljava/lang/String;Lorg/monora/uprotocol/core/protocol/Direction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getReceivable", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "hotspot-ui_debug"})
public abstract interface TransferItemDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem transferItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transferItem WHERE groupId = :groupId ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem>> getAll(long groupId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM transferItem WHERE groupId = :groupId AND state == \'Pending\' ORDER BY name LIMIT 1")
    public abstract java.lang.Object getReceivable(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UTransferItem> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM transferItem WHERE groupId = :groupId AND id = :id AND direction = :direction LIMIT 1")
    public abstract java.lang.Object get(long groupId, long id, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UTransferItem> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM transferItem WHERE location = :location AND direction = :direction")
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UTransferItem> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem transferItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}