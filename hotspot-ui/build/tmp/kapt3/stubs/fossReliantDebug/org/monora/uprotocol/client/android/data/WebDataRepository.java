package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0015J\u0019\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001e\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\rR\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "", "webTransferDao", "Lorg/monora/uprotocol/client/android/database/WebTransferDao;", "(Lorg/monora/uprotocol/client/android/database/WebTransferDao;)V", "isServing", "", "()Z", "sharedContents", "", "clear", "", "getList", "", "getNetworkInterfaces", "Ljava/net/NetworkInterface;", "getReceivedContent", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "id", "", "getReceivedContents", "insert", "webTransfer", "(Lorg/monora/uprotocol/client/android/database/model/WebTransfer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "transfer", "serve", "list", "hotspot-ui_fossReliantDebug"})
@javax.inject.Singleton()
public final class WebDataRepository {
    private final org.monora.uprotocol.client.android.database.WebTransferDao webTransferDao = null;
    private final java.util.List<java.lang.Object> sharedContents = null;
    
    @javax.inject.Inject()
    public WebDataRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.WebTransferDao webTransferDao) {
        super();
    }
    
    public final boolean isServing() {
        return false;
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.WebTransfer> getReceivedContent(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReceivedContent(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.monora.uprotocol.client.android.database.model.WebTransfer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.database.model.WebTransfer>> getReceivedContents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebTransfer webTransfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.net.NetworkInterface> getNetworkInterfaces() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebTransfer transfer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void serve(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> list) {
    }
}