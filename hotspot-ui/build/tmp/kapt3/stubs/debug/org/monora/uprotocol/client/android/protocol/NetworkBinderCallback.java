package org.monora.uprotocol.client.android.protocol;

import java.lang.System;

@androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/NetworkBinderCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectivityManager", "Landroid/net/ConnectivityManager;", "inetAddress", "Ljava/net/InetAddress;", "(Landroid/net/ConnectivityManager;Ljava/net/InetAddress;)V", "bound", "", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "exception", "Ljava/io/IOException;", "getInetAddress", "()Ljava/net/InetAddress;", "lock", "Ljava/lang/Object;", "resultConnection", "Lorg/monora/coolsocket/core/session/ActiveConnection;", "bindNetwork", "network", "Landroid/net/Network;", "onAvailable", "", "waitForConnection", "Companion", "hotspot-ui_debug"})
final class NetworkBinderCallback extends android.net.ConnectivityManager.NetworkCallback {
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager connectivityManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.net.InetAddress inetAddress = null;
    private final java.lang.Object lock = null;
    private boolean bound = false;
    private java.io.IOException exception;
    private org.monora.coolsocket.core.session.ActiveConnection resultConnection;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.protocol.NetworkBinderCallback.Companion Companion = null;
    private static final java.lang.String TAG = "MainConnectionFactory";
    
    public NetworkBinderCallback(@org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    java.net.InetAddress inetAddress) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.net.InetAddress getInetAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void onAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    public final boolean bindNetwork(@org.jetbrains.annotations.Nullable()
    android.net.Network network) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final org.monora.coolsocket.core.session.ActiveConnection waitForConnection() throws java.io.IOException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/NetworkBinderCallback$Companion;", "", "()V", "TAG", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}