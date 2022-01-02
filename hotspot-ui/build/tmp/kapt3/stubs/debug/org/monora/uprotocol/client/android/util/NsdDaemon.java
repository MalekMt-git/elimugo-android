package org.monora.uprotocol.client.android.util;

import java.lang.System;

/**
 * created by: Veli
 * date: 22.01.2018 15:35
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0004\'()*B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NsdDaemon;", "", "context", "Landroid/content/Context;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "(Landroid/content/Context;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;Lorg/monora/uprotocol/core/protocol/ConnectionFactory;Lorg/monora/uprotocol/client/android/backend/Backend;)V", "_onlineClients", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "getConnectionFactory", "()Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "discoveryListener", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "nsdManager", "Landroid/net/nsd/NsdManager;", "onlineClientMap", "Landroidx/collection/ArrayMap;", "", "onlineClients", "Landroidx/lifecycle/LiveData;", "getOnlineClients", "()Landroidx/lifecycle/LiveData;", "getPersistenceProvider", "()Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "registrationListener", "Landroid/net/nsd/NsdManager$RegistrationListener;", "registerService", "", "startDiscovering", "stopDiscovering", "unregisterService", "Companion", "DiscoveryListener", "RegistrationListener", "ResolveListener", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class NsdDaemon {
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    private final androidx.collection.ArrayMap<java.lang.String, org.monora.uprotocol.client.android.model.ClientRoute> onlineClientMap = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> _onlineClients = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> onlineClients = null;
    private final android.net.nsd.NsdManager nsdManager = null;
    private android.net.nsd.NsdManager.DiscoveryListener discoveryListener;
    private android.net.nsd.NsdManager.RegistrationListener registrationListener;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.NsdDaemon.Companion Companion = null;
    private static final java.lang.String TAG = "NsdDaemon";
    
    @javax.inject.Inject()
    public NsdDaemon(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.persistence.PersistenceProvider getPersistenceProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.ConnectionFactory getConnectionFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Backend getBackend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.model.ClientRoute>> getOnlineClients() {
        return null;
    }
    
    public final void registerService() {
    }
    
    public final void startDiscovering() {
    }
    
    public final void stopDiscovering() {
    }
    
    public final void unregisterService() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.JELLY_BEAN)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NsdDaemon$RegistrationListener;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "(Lorg/monora/uprotocol/client/android/util/NsdDaemon;)V", "clear", "", "onRegistrationFailed", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "errorCode", "", "onServiceRegistered", "onServiceUnregistered", "onUnregistrationFailed", "hotspot-ui_debug"})
    final class RegistrationListener implements android.net.nsd.NsdManager.RegistrationListener {
        
        public RegistrationListener() {
            super();
        }
        
        @java.lang.Override()
        public void onRegistrationFailed(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
        }
        
        @java.lang.Override()
        public void onUnregistrationFailed(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
        }
        
        @java.lang.Override()
        public void onServiceRegistered(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo) {
        }
        
        @java.lang.Override()
        public void onServiceUnregistered(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo) {
        }
        
        public final void clear() {
        }
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.JELLY_BEAN)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NsdDaemon$DiscoveryListener;", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "(Lorg/monora/uprotocol/client/android/util/NsdDaemon;)V", "clear", "", "onDiscoveryStarted", "serviceType", "", "onDiscoveryStopped", "onServiceFound", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "onServiceLost", "onStartDiscoveryFailed", "errorCode", "", "onStopDiscoveryFailed", "hotspot-ui_debug"})
    final class DiscoveryListener implements android.net.nsd.NsdManager.DiscoveryListener {
        
        public DiscoveryListener() {
            super();
        }
        
        @java.lang.Override()
        public void onStartDiscoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceType, int errorCode) {
        }
        
        @java.lang.Override()
        public void onStopDiscoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceType, int errorCode) {
        }
        
        @java.lang.Override()
        public void onDiscoveryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceType) {
        }
        
        @java.lang.Override()
        public void onDiscoveryStopped(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceType) {
        }
        
        @java.lang.Override()
        public void onServiceFound(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo) {
        }
        
        @java.lang.Override()
        public void onServiceLost(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo) {
        }
        
        public final void clear() {
        }
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.JELLY_BEAN)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NsdDaemon$ResolveListener;", "Landroid/net/nsd/NsdManager$ResolveListener;", "(Lorg/monora/uprotocol/client/android/util/NsdDaemon;)V", "onResolveFailed", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "errorCode", "", "onServiceResolved", "hotspot-ui_debug"})
    final class ResolveListener implements android.net.nsd.NsdManager.ResolveListener {
        
        public ResolveListener() {
            super();
        }
        
        @java.lang.Override()
        public void onResolveFailed(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
        }
        
        @java.lang.Override()
        public void onServiceResolved(@org.jetbrains.annotations.NotNull()
        android.net.nsd.NsdServiceInfo serviceInfo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NsdDaemon$Companion;", "", "()V", "TAG", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}