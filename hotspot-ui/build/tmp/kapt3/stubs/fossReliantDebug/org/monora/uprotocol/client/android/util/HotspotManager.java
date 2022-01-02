package org.monora.uprotocol.client.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 $2\u00020\u0001:\u0003$%&B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\fH&J\b\u0010\u001e\u001a\u00020\fH&J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010!H&J\b\u0010#\u001a\u00020\fH&R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Lorg/monora/uprotocol/client/android/util/HotspotManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "configuration", "Landroid/net/wifi/WifiConfiguration;", "getConfiguration", "()Landroid/net/wifi/WifiConfiguration;", "getContext", "()Landroid/content/Context;", "enabled", "", "getEnabled", "()Z", "previousConfig", "getPreviousConfig", "secondaryCallback", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "getSecondaryCallback", "()Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "setSecondaryCallback", "(Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;)V", "started", "getStarted", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "disable", "enable", "enableConfigured", "apName", "", "passKeyWPA2", "unloadPreviousConfig", "Companion", "OldHotspotManager", "OreoHotspotManager", "hotspot-ui_fossReliantDebug"})
public abstract class HotspotManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.wifi.WifiManager.LocalOnlyHotspotCallback secondaryCallback;
    @org.jetbrains.annotations.NotNull()
    private final android.net.wifi.WifiManager wifiManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.HotspotManager.Companion Companion = null;
    private static final java.lang.String TAG = "HotspotManager";
    
    public HotspotManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.net.wifi.WifiConfiguration getConfiguration();
    
    public abstract boolean getEnabled();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.net.wifi.WifiConfiguration getPreviousConfig();
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.wifi.WifiManager.LocalOnlyHotspotCallback getSecondaryCallback() {
        return null;
    }
    
    public final void setSecondaryCallback(@org.jetbrains.annotations.Nullable()
    android.net.wifi.WifiManager.LocalOnlyHotspotCallback p0) {
    }
    
    public abstract boolean getStarted();
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.wifi.WifiManager getWifiManager() {
        return null;
    }
    
    public abstract boolean disable();
    
    public abstract boolean enable();
    
    public abstract boolean enableConfigured(@org.jetbrains.annotations.NotNull()
    java.lang.String apName, @org.jetbrains.annotations.Nullable()
    java.lang.String passKeyWPA2);
    
    public abstract boolean unloadPreviousConfig();
    
    @androidx.annotation.RequiresApi(value = 26)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lorg/monora/uprotocol/client/android/util/HotspotManager$OreoHotspotManager;", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "getCallback", "()Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "configuration", "Landroid/net/wifi/WifiConfiguration;", "getConfiguration", "()Landroid/net/wifi/WifiConfiguration;", "enabled", "", "getEnabled", "()Z", "hotspotReservation", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotReservation;", "Landroid/net/wifi/WifiManager;", "previousConfig", "getPreviousConfig", "started", "getStarted", "disable", "enable", "enableConfigured", "apName", "", "passKeyWPA2", "unloadPreviousConfig", "hotspot-ui_fossReliantDebug"})
    public static final class OreoHotspotManager extends org.monora.uprotocol.client.android.util.HotspotManager {
        private android.net.wifi.WifiManager.LocalOnlyHotspotReservation hotspotReservation;
        @org.jetbrains.annotations.NotNull()
        private final android.net.wifi.WifiManager.LocalOnlyHotspotCallback callback = null;
        
        public OreoHotspotManager(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.net.wifi.WifiConfiguration getConfiguration() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.net.wifi.WifiConfiguration getPreviousConfig() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getStarted() {
            return false;
        }
        
        @java.lang.Override()
        public boolean disable() {
            return false;
        }
        
        @java.lang.Override()
        public boolean enable() {
            return false;
        }
        
        @java.lang.Override()
        public boolean enableConfigured(@org.jetbrains.annotations.NotNull()
        java.lang.String apName, @org.jetbrains.annotations.Nullable()
        java.lang.String passKeyWPA2) {
            return false;
        }
        
        @java.lang.Override()
        public boolean unloadPreviousConfig() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.wifi.WifiManager.LocalOnlyHotspotCallback getCallback() {
            return null;
        }
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/util/HotspotManager$OldHotspotManager;", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "configuration", "Landroid/net/wifi/WifiConfiguration;", "getConfiguration", "()Landroid/net/wifi/WifiConfiguration;", "enabled", "", "getEnabled", "()Z", "previousConfig", "getPreviousConfig", "previousConfigPrivate", "started", "getStarted", "disable", "enable", "enableConfigured", "apName", "", "passKeyWPA2", "setHotspotConfig", "config", "setHotspotEnabled", "unloadPreviousConfig", "Companion", "hotspot-ui_fossReliantDebug"})
    static final class OldHotspotManager extends org.monora.uprotocol.client.android.util.HotspotManager {
        private android.net.wifi.WifiConfiguration previousConfigPrivate;
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.util.HotspotManager.OldHotspotManager.Companion Companion = null;
        private static java.lang.reflect.Method getWifiApConfiguration;
        private static java.lang.reflect.Method getWifiApState;
        private static java.lang.reflect.Method isWifiApEnabled;
        private static java.lang.reflect.Method setWifiApEnabled;
        private static java.lang.reflect.Method setWifiApConfiguration;
        
        public OldHotspotManager(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.net.wifi.WifiConfiguration getConfiguration() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.net.wifi.WifiConfiguration getPreviousConfig() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getStarted() {
            return false;
        }
        
        @java.lang.Override()
        public boolean disable() {
            return false;
        }
        
        @java.lang.Override()
        public boolean enable() {
            return false;
        }
        
        @java.lang.Override()
        public boolean enableConfigured(@org.jetbrains.annotations.NotNull()
        java.lang.String apName, @org.jetbrains.annotations.Nullable()
        java.lang.String passKeyWPA2) {
            return false;
        }
        
        private final boolean setHotspotConfig(android.net.wifi.WifiConfiguration config) {
            return false;
        }
        
        private final boolean setHotspotEnabled(android.net.wifi.WifiConfiguration config, boolean enabled) {
            return false;
        }
        
        @java.lang.Override()
        public boolean unloadPreviousConfig() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ9\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00012\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/monora/uprotocol/client/android/util/HotspotManager$OldHotspotManager$Companion;", "", "()V", "getWifiApConfiguration", "Ljava/lang/reflect/Method;", "getWifiApState", "isWifiApEnabled", "setWifiApConfiguration", "setWifiApEnabled", "enabled", "", "wifiManager", "Landroid/net/wifi/WifiManager;", "invokeSilently", "method", "receiver", "args", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "supported", "hotspot-ui_fossReliantDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            public final boolean enabled(@org.jetbrains.annotations.NotNull()
            android.net.wifi.WifiManager wifiManager) {
                return false;
            }
            
            private final java.lang.Object invokeSilently(java.lang.reflect.Method method, java.lang.Object receiver, java.lang.Object... args) {
                return null;
            }
            
            public final boolean supported() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/util/HotspotManager$Companion;", "", "()V", "TAG", "", "supported", "", "getSupported", "()Z", "newInstance", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "context", "Landroid/content/Context;", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getSupported() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.util.HotspotManager newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}