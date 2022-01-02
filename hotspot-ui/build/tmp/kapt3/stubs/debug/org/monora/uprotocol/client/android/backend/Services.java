package org.monora.uprotocol.client.android.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003+,-B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u0006\u0010)\u001a\u00020\'J\u0006\u0010*\u001a\u00020\'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0018\u00010!R\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006."}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Services;", "", "context", "Landroid/content/Context;", "nsdDaemon", "Lorg/monora/uprotocol/client/android/util/NsdDaemon;", "transportSession", "Lorg/monora/uprotocol/core/TransportSession;", "webDataRepository", "Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "webShareServer", "Lcom/yanzhenjie/andserver/Server;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/util/NsdDaemon;Lorg/monora/uprotocol/core/TransportSession;Lorg/monora/uprotocol/client/android/data/WebDataRepository;Lcom/yanzhenjie/andserver/Server;)V", "hotspotManager", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "getHotspotManager", "()Lorg/monora/uprotocol/client/android/util/HotspotManager;", "isServingAnything", "", "()Z", "mWiFiDirectManager", "Lorg/monora/uprotocol/client/android/util/WiFiDirectManager;", "mediaScannerConnection", "Landroid/media/MediaScannerConnection;", "getMediaScannerConnection", "()Landroid/media/MediaScannerConnection;", "mediaScannerConnectionClient", "Lorg/monora/uprotocol/client/android/backend/Services$MediaScannerConnectionClient;", "notifications", "Lorg/monora/uprotocol/client/android/util/Notifications;", "getNotifications", "()Lorg/monora/uprotocol/client/android/util/Notifications;", "wifiLock", "Landroid/net/wifi/WifiManager$WifiLock;", "Landroid/net/wifi/WifiManager;", "wifiManager", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "start", "", "stop", "toggleHotspot", "toggleWiFiDirect", "Companion", "MediaScannerConnectionClient", "SecondaryHotspotCallback", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class Services {
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.util.NsdDaemon nsdDaemon = null;
    private final org.monora.uprotocol.core.TransportSession transportSession = null;
    private final org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository = null;
    private final com.yanzhenjie.andserver.Server webShareServer = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.util.HotspotManager hotspotManager = null;
    private final org.monora.uprotocol.client.android.util.WiFiDirectManager mWiFiDirectManager = null;
    private final org.monora.uprotocol.client.android.backend.Services.MediaScannerConnectionClient mediaScannerConnectionClient = null;
    @org.jetbrains.annotations.NotNull()
    private final android.media.MediaScannerConnection mediaScannerConnection = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.util.Notifications notifications = null;
    private android.net.wifi.WifiManager.WifiLock wifiLock;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.backend.Services.Companion Companion = null;
    private static final java.lang.String TAG = "Services";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OREO_HOTSPOT_STARTED = "org.monora.trebleshot.intent.action.HOTSPOT_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HOTSPOT_CONFIG = "hotspotConfig";
    
    @javax.inject.Inject()
    public Services(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.NsdDaemon nsdDaemon, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSession transportSession, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository, @org.jetbrains.annotations.NotNull()
    @org.monora.uprotocol.client.android.di.WebShareServer()
    com.yanzhenjie.andserver.Server webShareServer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.HotspotManager getHotspotManager() {
        return null;
    }
    
    public final boolean isServingAnything() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.MediaScannerConnection getMediaScannerConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.Notifications getNotifications() {
        return null;
    }
    
    private final android.net.wifi.WifiManager getWifiManager() {
        return null;
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void toggleHotspot() {
    }
    
    public final void toggleWiFiDirect() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006R\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Services$SecondaryHotspotCallback;", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "(Lorg/monora/uprotocol/client/android/backend/Services;)V", "onStarted", "", "reservation", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotReservation;", "Landroid/net/wifi/WifiManager;", "hotspot-ui_debug"})
    final class SecondaryHotspotCallback extends android.net.wifi.WifiManager.LocalOnlyHotspotCallback {
        
        public SecondaryHotspotCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onStarted(@org.jetbrains.annotations.NotNull()
        android.net.wifi.WifiManager.LocalOnlyHotspotReservation reservation) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Services$MediaScannerConnectionClient;", "Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;", "()V", "onMediaScannerConnected", "", "onScanCompleted", "path", "", "uri", "Landroid/net/Uri;", "hotspot-ui_debug"})
    static final class MediaScannerConnectionClient implements android.media.MediaScannerConnection.MediaScannerConnectionClient {
        
        public MediaScannerConnectionClient() {
            super();
        }
        
        @java.lang.Override()
        public void onScanCompleted(@org.jetbrains.annotations.Nullable()
        java.lang.String path, @org.jetbrains.annotations.Nullable()
        android.net.Uri uri) {
        }
        
        @java.lang.Override()
        public void onMediaScannerConnected() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Services$Companion;", "", "()V", "ACTION_OREO_HOTSPOT_STARTED", "", "EXTRA_HOTSPOT_CONFIG", "TAG", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}