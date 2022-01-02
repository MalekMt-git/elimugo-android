package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragmentArgs;", "Landroidx/navigation/NavArgs;", "networkDescription", "Lorg/monora/uprotocol/client/android/model/NetworkDescription;", "pin", "", "(Lorg/monora/uprotocol/client/android/model/NetworkDescription;I)V", "getNetworkDescription", "()Lorg/monora/uprotocol/client/android/model/NetworkDescription;", "getPin", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "Companion", "hotspot-ui_debug"})
public final class WifiConnectFragmentArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.model.NetworkDescription networkDescription = null;
    private final int pin = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragmentArgs copy(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.NetworkDescription networkDescription, int pin) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WifiConnectFragmentArgs(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.NetworkDescription networkDescription, int pin) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.NetworkDescription component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.NetworkDescription getNetworkDescription() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPin() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragmentArgs$Companion;", "", "()V", "fromBundle", "Lorg/monora/uprotocol/client/android/fragment/pickclient/WifiConnectFragmentArgs;", "bundle", "Landroid/os/Bundle;", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.monora.uprotocol.client.android.fragment.pickclient.WifiConnectFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            return null;
        }
    }
}