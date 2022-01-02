package org.monora.uprotocol.client.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lorg/monora/uprotocol/client/android/model/ClientRoute;", "Landroid/os/Parcelable;", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "address", "Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "(Lorg/monora/uprotocol/client/android/database/model/UClient;Lorg/monora/uprotocol/client/android/database/model/UClientAddress;)V", "getAddress", "()Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "setAddress", "(Lorg/monora/uprotocol/client/android/database/model/UClientAddress;)V", "getClient", "()Lorg/monora/uprotocol/client/android/database/model/UClient;", "setClient", "(Lorg/monora/uprotocol/client/android/database/model/UClient;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class ClientRoute implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.client.android.database.model.UClient client;
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.client.android.database.model.UClientAddress address;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.ClientRoute> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.ClientRoute copy(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClientAddress address) {
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
    
    public ClientRoute(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClientAddress address) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClient component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClientAddress component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClientAddress getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClientAddress p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.ClientRoute> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.ClientRoute createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.ClientRoute[] newArray(int size) {
            return null;
        }
    }
}