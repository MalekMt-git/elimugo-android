package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\rJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/data/ClientRepository;", "", "clientDao", "Lorg/monora/uprotocol/client/android/database/ClientDao;", "clientAddressDao", "Lorg/monora/uprotocol/client/android/database/ClientAddressDao;", "(Lorg/monora/uprotocol/client/android/database/ClientDao;Lorg/monora/uprotocol/client/android/database/ClientAddressDao;)V", "delete", "", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "(Lorg/monora/uprotocol/client/android/database/model/UClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Landroidx/lifecycle/LiveData;", "uid", "", "getAddresses", "", "Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "clientUid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "getDirect", "getInetAddresses", "Ljava/net/InetAddress;", "insert", "address", "(Lorg/monora/uprotocol/client/android/database/model/UClientAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class ClientRepository {
    private final org.monora.uprotocol.client.android.database.ClientDao clientDao = null;
    private final org.monora.uprotocol.client.android.database.ClientAddressDao clientAddressDao = null;
    
    @javax.inject.Inject()
    public ClientRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.ClientDao clientDao, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.ClientAddressDao clientAddressDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDirect(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.UClient> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.UClient> get(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.UClient>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddresses(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.monora.uprotocol.client.android.database.model.UClientAddress>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {org.monora.uprotocol.client.android.protocol.NoAddressException.class})
    public final java.lang.Object getInetAddresses(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.net.InetAddress>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClientAddress address, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}