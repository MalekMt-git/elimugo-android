package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/database/ClientAddressDao;", "", "getAll", "", "Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "clientUid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "address", "(Lorg/monora/uprotocol/client/android/database/model/UClientAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotspot-ui_fossReliantDebug"})
public abstract interface ClientAddressDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM clientAddress WHERE clientUid = :clientUid")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.monora.uprotocol.client.android.database.model.UClientAddress>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClientAddress address, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}