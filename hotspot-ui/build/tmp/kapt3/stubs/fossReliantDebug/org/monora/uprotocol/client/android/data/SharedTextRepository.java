package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "", "sharedTextDao", "Lorg/monora/uprotocol/client/android/database/SharedTextDao;", "(Lorg/monora/uprotocol/client/android/database/SharedTextDao;)V", "delete", "", "sharedText", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "(Lorg/monora/uprotocol/client/android/database/model/SharedText;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSharedTexts", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "hotspot-ui_fossReliantDebug"})
@javax.inject.Singleton()
public final class SharedTextRepository {
    private final org.monora.uprotocol.client.android.database.SharedTextDao sharedTextDao = null;
    
    @javax.inject.Inject()
    public SharedTextRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.SharedTextDao sharedTextDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.SharedText>> getSharedTexts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}