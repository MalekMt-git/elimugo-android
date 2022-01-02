package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/database/SharedTextDao;", "", "delete", "", "sharedText", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "(Lorg/monora/uprotocol/client/android/database/model/SharedText;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "hotspot-ui_fossReliantDebug"})
public abstract interface SharedTextDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sharedText ORDER BY created DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.SharedText>> getAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}