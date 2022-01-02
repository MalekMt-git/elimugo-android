package org.monora.uprotocol.client.android.util;

import java.lang.System;

/**
 * created by: veli
 * date: 15/04/18 18:37
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0015J\b\u0010!\u001a\u00020\u0015H\u0007J:\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00152\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0-0,J2\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\f\u001a\u00020/2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0-0,J\u000e\u00100\u001a\u00020#2\u0006\u0010&\u001a\u00020\'J$\u00101\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\'2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0-0,H\u0002J\u001a\u00102\u001a\u00020\u00152\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0-0,R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00064"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Connections;", "", "contextLocal", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "context", "getContext", "()Landroid/content/Context;", "locationManager", "Landroid/location/LocationManager;", "p2pManager", "Landroid/net/wifi/p2p/WifiP2pManager;", "getP2pManager", "()Landroid/net/wifi/p2p/WifiP2pManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "canAccessLocation", "", "canReadScanResults", "canReadWifiInfo", "hasLocationPermission", "isConnectedToAnyNetwork", "isConnectedToNetwork", "ssid", "", "bssid", "description", "Lorg/monora/uprotocol/client/android/model/NetworkDescription;", "isLocationServiceEnabled", "isMobileDataActive", "toggleHotspot", "", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "provider", "Lcom/genonbeta/android/framework/ui/callback/SnackbarPlacementProvider;", "manager", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "suggestActions", "permissionsResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "toggleWiFiDirect", "Lorg/monora/uprotocol/client/android/util/WiFiDirectManager;", "turnOnWiFi", "validateLocationAccess", "validateLocationAccessNoPrompt", "Companion", "hotspot-ui_debug"})
public final class Connections {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.net.ConnectivityManager connectivityManager = null;
    private final android.location.LocationManager locationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.wifi.WifiManager wifiManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.Connections.Companion Companion = null;
    private static final java.lang.String TAG = "Connections";
    
    public Connections(@org.jetbrains.annotations.NotNull()
    android.content.Context contextLocal) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.wifi.p2p.WifiP2pManager getP2pManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.wifi.WifiManager getWifiManager() {
        return null;
    }
    
    public final boolean canAccessLocation() {
        return false;
    }
    
    private final boolean canReadScanResults() {
        return false;
    }
    
    public final boolean canReadWifiInfo() {
        return false;
    }
    
    public final boolean hasLocationPermission() {
        return false;
    }
    
    public final boolean isConnectedToAnyNetwork() {
        return false;
    }
    
    public final boolean isConnectedToNetwork(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.NetworkDescription description) {
        return false;
    }
    
    private final boolean isConnectedToNetwork(java.lang.String ssid, java.lang.String bssid) {
        return false;
    }
    
    public final boolean isLocationServiceEnabled() {
        return false;
    }
    
    @java.lang.Deprecated()
    public final boolean isMobileDataActive() {
        return false;
    }
    
    public final void toggleHotspot(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend, @org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider provider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.HotspotManager manager, boolean suggestActions, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionsResultLauncher) {
    }
    
    public final void toggleWiFiDirect(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend, @org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider provider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.WiFiDirectManager p2pManager, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionsResultLauncher) {
    }
    
    public final void turnOnWiFi(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider provider) {
    }
    
    private final boolean validateLocationAccess(com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider provider, androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionsResultLauncher) {
        return false;
    }
    
    public final boolean validateLocationAccessNoPrompt(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionsResultLauncher) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Connections$Companion;", "", "()V", "TAG", "", "getCleanSsid", "ssid", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCleanSsid(@org.jetbrains.annotations.Nullable()
        java.lang.String ssid) {
            return null;
        }
    }
}