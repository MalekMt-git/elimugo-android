package org.monora.uprotocol.client.android.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/MainConnectionFactory;", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "enableCipherSuites", "", "supportedCipherSuites", "", "", "enabledCipherSuiteList", "", "([Ljava/lang/String;Ljava/util/List;)V", "openConnection", "Lorg/monora/coolsocket/core/session/ActiveConnection;", "address", "Ljava/net/InetAddress;", "hotspot-ui_fossReliantDebug"})
public final class MainConnectionFactory implements org.monora.uprotocol.core.protocol.ConnectionFactory {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public MainConnectionFactory(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void enableCipherSuites(@org.jetbrains.annotations.NotNull()
    java.lang.String[] supportedCipherSuites, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> enabledCipherSuiteList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.coolsocket.core.session.ActiveConnection openConnection(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress address) {
        return null;
    }
}