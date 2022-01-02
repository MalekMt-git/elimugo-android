package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u000eH\'J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/database/TransferDao;", "", "contains", "", "groupId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/database/model/Transfer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "getDetail", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "getDetailDirect", "getDetails", "", "insert", "update", "hotspot-ui_fossReliantDebug"})
public abstract interface TransferDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM transfer WHERE id = :groupId)")
    public abstract java.lang.Object contains(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM transfer WHERE id = :groupId")
    public abstract java.lang.Object get(long groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.Transfer> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transferDetail WHERE id = :groupId")
    public abstract androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.TransferDetail> getDetail(long groupId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM transferDetail WHERE id = :groupId")
    public abstract org.monora.uprotocol.client.android.database.model.TransferDetail getDetailDirect(long groupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transferDetail ORDER BY dateCreated DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.TransferDetail>> getDetails();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}