package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

/**
 * created by: veli
 * date: 11/04/18 20:53
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0003Z[\\B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020LH\u0016J\b\u0010P\u001a\u00020LH\u0016J\u001a\u0010Q\u001a\u00020L2\u0006\u0010R\u001a\u00020 2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010S\u001a\u00020LH\u0002J\b\u0010T\u001a\u00020LH\u0002J\u000e\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020 J\b\u0010W\u001a\u00020LH\u0002J\b\u0010X\u001a\u00020LH\u0002J\b\u0010Y\u001a\u00020LH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u00107\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:0908X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010<\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:0908X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u00060BR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020>X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activeType", "Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment$Type;", "args", "Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragmentArgs;", "getArgs", "()Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "setBackend", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "clientPickerViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "getClientPickerViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "clientPickerViewModel$delegate", "Lkotlin/Lazy;", "codeText", "Landroid/widget/TextView;", "codeView", "Landroid/widget/ImageView;", "colorPassiveState", "Landroid/content/res/ColorStateList;", "connections", "Lorg/monora/uprotocol/client/android/util/Connections;", "containerText1", "Landroid/view/View;", "containerText2", "containerText3", "getP2pInfo", "", "helpMenuItem", "Landroid/view/MenuItem;", "imageView2", "imageView3", "intentFilter", "Landroid/content/IntentFilter;", "manager", "Lorg/monora/uprotocol/client/android/util/HotspotManager;", "p2pManager", "Lorg/monora/uprotocol/client/android/util/WiFiDirectManager;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "getPersistenceProvider", "()Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "setPersistenceProvider", "(Lorg/monora/uprotocol/core/persistence/PersistenceProvider;)V", "prefP2p", "Landroid/content/SharedPreferences;", "requestHotspotPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "requestLocationPermission", "secondButton", "Landroid/widget/Button;", "snackbarPlacementProvider", "Lcom/genonbeta/android/framework/ui/callback/SnackbarPlacementProvider;", "statusReceiver", "Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment$StatusReceiver;", "text1", "text2", "text3", "toggleButton", "toggleButtonDefaultStateList", "toggleButtonEnabledStateList", "getWifiConfiguration", "Landroid/net/wifi/WifiConfiguration;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "openWifiSettings", "showMenu", "toggle", "v", "toggleHotspot", "updateState", "updateViews", "Companion", "StatusReceiver", "Type", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NetworkManagerFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.backend.Backend backend;
    @javax.inject.Inject()
    public org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy clientPickerViewModel$delegate = null;
    private final android.content.IntentFilter intentFilter = null;
    private final org.monora.uprotocol.client.android.fragment.NetworkManagerFragment.StatusReceiver statusReceiver = null;
    private org.monora.uprotocol.client.android.util.Connections connections;
    private android.view.View containerText1;
    private android.view.View containerText2;
    private android.view.View containerText3;
    private android.widget.TextView codeText;
    private android.widget.TextView text1;
    private android.widget.TextView text2;
    private android.widget.TextView text3;
    private android.widget.ImageView imageView2;
    private android.widget.ImageView imageView3;
    private android.widget.ImageView codeView;
    private android.widget.Button toggleButton;
    private android.widget.Button secondButton;
    private android.view.MenuItem helpMenuItem;
    private android.content.res.ColorStateList colorPassiveState;
    private org.monora.uprotocol.client.android.util.HotspotManager manager;
    private org.monora.uprotocol.client.android.util.WiFiDirectManager p2pManager;
    private android.content.SharedPreferences prefP2p;
    private boolean getP2pInfo = false;
    private android.content.res.ColorStateList toggleButtonDefaultStateList;
    private android.content.res.ColorStateList toggleButtonEnabledStateList;
    private org.monora.uprotocol.client.android.fragment.NetworkManagerFragment.Type activeType;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestHotspotPermission = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestLocationPermission = null;
    private final com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider snackbarPlacementProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.NetworkManagerFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIFI_AP_STATE_CHANGED = "android.net.wifi.WIFI_AP_STATE_CHANGED";
    
    public NetworkManagerFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.persistence.PersistenceProvider getPersistenceProvider() {
        return null;
    }
    
    public final void setPersistenceProvider(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider p0) {
    }
    
    private final org.monora.uprotocol.client.android.fragment.NetworkManagerFragmentArgs getArgs() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel getClientPickerViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final android.net.wifi.WifiConfiguration getWifiConfiguration() {
        return null;
    }
    
    private final void openWifiSettings() {
    }
    
    private final void showMenu() {
    }
    
    private final void toggleHotspot() {
    }
    
    public final void toggle(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void updateState() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updateViews() throws org.json.JSONException {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment$StatusReceiver;", "Landroid/content/BroadcastReceiver;", "(Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "hotspot-ui_fossReliantDebug"})
    final class StatusReceiver extends android.content.BroadcastReceiver {
        
        public StatusReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment$Type;", "", "(Ljava/lang/String;I)V", "None", "WiFi", "Hotspot", "HotspotExternal", "LocationAccess", "hotspot-ui_fossReliantDebug"})
    static enum Type {
        /*public static final*/ None /* = new None() */,
        /*public static final*/ WiFi /* = new WiFi() */,
        /*public static final*/ Hotspot /* = new Hotspot() */,
        /*public static final*/ HotspotExternal /* = new HotspotExternal() */,
        /*public static final*/ LocationAccess /* = new LocationAccess() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/NetworkManagerFragment$Companion;", "", "()V", "WIFI_AP_STATE_CHANGED", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}