package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J\u001a\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "args", "Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragmentArgs;", "getArgs", "()Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lorg/monora/uprotocol/client/android/databinding/LayoutWifiConnectBinding;", "connections", "Lorg/monora/uprotocol/client/android/util/Connections;", "getConnections", "()Lorg/monora/uprotocol/client/android/util/Connections;", "connections$delegate", "Lkotlin/Lazy;", "notification", "Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "getNotification", "()Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "notification$delegate", "notifications", "Lorg/monora/uprotocol/client/android/util/Notifications;", "getNotifications", "()Lorg/monora/uprotocol/client/android/util/Notifications;", "notifications$delegate", "waitingForResult", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onResume", "onViewCreated", "view", "Companion", "hotspot-ui_debug"})
public final class WifiConnectFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private boolean waitingForResult = false;
    private final kotlin.Lazy connections$delegate = null;
    private final kotlin.Lazy notifications$delegate = null;
    private final kotlin.Lazy notification$delegate = null;
    private org.monora.uprotocol.client.android.databinding.LayoutWifiConnectBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_INET_ADDRESS = "requestInetAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_INET_ADDRESS = "extraInetAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PIN = "extraPin";
    
    public WifiConnectFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragmentArgs getArgs() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.util.Connections getConnections() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.util.Notifications getNotifications() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.util.DynamicNotification getNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
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
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragment$Companion;", "", "()V", "EXTRA_INET_ADDRESS", "", "EXTRA_PIN", "REQUEST_INET_ADDRESS", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}