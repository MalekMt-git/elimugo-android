package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\u0007H\'J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/database/WebTransferDao;", "", "get", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "id", "", "getAll", "", "insert", "", "webTransfer", "(Lorg/monora/uprotocol/client/android/database/model/WebTransfer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "hotspot-ui_debug"})
public abstract interface WebTransferDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM webTransfer WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.WebTransfer> get(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM webTransfer WHERE uri = :uri")
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.WebTransfer> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM webTransfer ORDER BY dateCreated DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.WebTransfer>> getAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebTransfer webTransfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebTransfer webTransfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}