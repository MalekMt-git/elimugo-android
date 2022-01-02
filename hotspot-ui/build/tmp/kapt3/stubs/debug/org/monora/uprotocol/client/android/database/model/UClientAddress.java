package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.Entity(tableName = "clientAddress", foreignKeys = {@androidx.room.ForeignKey(entity = org.monora.uprotocol.client.android.database.model.UClient.class, childColumns = {"clientUid"}, onDelete = 5, parentColumns = {"uid"})})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\t\u0010#\u001a\u00020\u001bH\u00d6\u0001J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\'\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001bH\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006-"}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "Lorg/monora/uprotocol/core/protocol/ClientAddress;", "Landroid/os/Parcelable;", "inetAddress", "Ljava/net/InetAddress;", "clientUid", "", "lastUsageTime", "", "(Ljava/net/InetAddress;Ljava/lang/String;J)V", "getClientUid", "()Ljava/lang/String;", "setClientUid", "(Ljava/lang/String;)V", "getInetAddress", "()Ljava/net/InetAddress;", "setInetAddress", "(Ljava/net/InetAddress;)V", "getLastUsageTime", "()J", "setLastUsageTime", "(J)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "getClientAddress", "getClientAddressLastUsageTime", "getClientAddressOwnerUid", "hashCode", "setClientAddress", "", "setClientAddressLastUsageTime", "setClientAddressOwnerUid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class UClientAddress implements org.monora.uprotocol.core.protocol.ClientAddress, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.net.InetAddress inetAddress;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(index = true)
    private java.lang.String clientUid;
    private long lastUsageTime;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UClientAddress> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClientAddress copy(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress inetAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, long lastUsageTime) {
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
    
    public UClientAddress(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress inetAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, long lastUsageTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.net.InetAddress component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.net.InetAddress getInetAddress() {
        return null;
    }
    
    public final void setInetAddress(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientUid() {
        return null;
    }
    
    public final void setClientUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getLastUsageTime() {
        return 0L;
    }
    
    public final void setLastUsageTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.InetAddress getClientAddress() {
        return null;
    }
    
    @java.lang.Override()
    public long getClientAddressLastUsageTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientAddressOwnerUid() {
        return null;
    }
    
    @java.lang.Override()
    public void setClientAddress(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress inetAddress) {
    }
    
    @java.lang.Override()
    public void setClientAddressLastUsageTime(long lastUsageTime) {
    }
    
    @java.lang.Override()
    public void setClientAddressOwnerUid(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UClientAddress> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UClientAddress createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UClientAddress[] newArray(int size) {
            return null;
        }
    }
}