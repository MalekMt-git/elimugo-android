package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/database/WebClientDao;", "", "get", "Lorg/monora/uprotocol/client/android/database/model/WebClient;", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "webClient", "(Lorg/monora/uprotocol/client/android/database/model/WebClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotspot-ui_debug"})
public abstract interface WebClientDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM webClient WHERE address = :address")
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.WebClient> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebClient webClient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}