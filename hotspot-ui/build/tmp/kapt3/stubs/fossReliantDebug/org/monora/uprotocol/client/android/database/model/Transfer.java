package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.Entity(tableName = "transfer", foreignKeys = {@androidx.room.ForeignKey(entity = org.monora.uprotocol.client.android.database.model.UClient.class, childColumns = {"clientUid"}, onDelete = 5, parentColumns = {"uid"})})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020#H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a\u00a8\u0006."}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/Transfer;", "Landroid/os/Parcelable;", "id", "", "clientUid", "", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "location", "accepted", "", "dateCreated", "(JLjava/lang/String;Lorg/monora/uprotocol/core/protocol/Direction;Ljava/lang/String;ZJ)V", "getAccepted", "()Z", "setAccepted", "(Z)V", "getClientUid", "()Ljava/lang/String;", "getDateCreated", "()J", "getDirection", "()Lorg/monora/uprotocol/core/protocol/Direction;", "getId", "getLocation", "setLocation", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_fossReliantDebug"})
public final class Transfer implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(index = true)
    private final java.lang.String clientUid = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.Direction direction = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String location;
    private boolean accepted;
    private final long dateCreated = 0L;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.Transfer> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.Transfer copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    java.lang.String location, boolean accepted, long dateCreated) {
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
    
    public Transfer(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    java.lang.String location, boolean accepted, long dateCreated) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction getDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getAccepted() {
        return false;
    }
    
    public final void setAccepted(boolean p0) {
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getDateCreated() {
        return 0L;
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.Transfer> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.Transfer createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.Transfer[] newArray(int size) {
            return null;
        }
    }
}