package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.Entity(tableName = "transferItem", primaryKeys = {"groupId", "id"}, foreignKeys = {@androidx.room.ForeignKey(entity = org.monora.uprotocol.client.android.database.model.Transfer.class, childColumns = {"groupId"}, onDelete = 5, parentColumns = {"id"})})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\t\u00102\u001a\u00020\u0004H\u00c6\u0003J\t\u00103\u001a\u00020\u0004H\u00c6\u0003J\t\u00104\u001a\u00020\u0004H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\rH\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003Jy\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u00c6\u0001J\t\u0010=\u001a\u00020>H\u00d6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\b\u0010C\u001a\u00020\rH\u0016J\n\u0010D\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010E\u001a\u00020\u0004H\u0016J\b\u0010F\u001a\u00020\u0004H\u0016J\b\u0010G\u001a\u00020\u0004H\u0016J\b\u0010H\u001a\u00020\u0007H\u0016J\b\u0010I\u001a\u00020\u0007H\u0016J\b\u0010J\u001a\u00020\u0004H\u0016J\t\u0010K\u001a\u00020>H\u00d6\u0001J\u0010\u0010L\u001a\u00020M2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010N\u001a\u00020M2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010O\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010P\u001a\u00020M2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010Q\u001a\u00020M2\u0006\u0010R\u001a\u00020\u0004H\u0016J\u0010\u0010S\u001a\u00020M2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010T\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010U\u001a\u00020M2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\t\u0010V\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010W\u001a\u00020M2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020>H\u00d6\u0001R\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006["}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "Lorg/monora/uprotocol/core/transfer/TransferItem;", "Landroid/os/Parcelable;", "id", "", "groupId", "name", "", "mimeType", "size", "directory", "location", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "state", "Lorg/monora/uprotocol/core/transfer/TransferItem$State;", "dateCreated", "dateModified", "(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lorg/monora/uprotocol/core/protocol/Direction;Lorg/monora/uprotocol/core/transfer/TransferItem$State;JJ)V", "getDateCreated", "()J", "setDateCreated", "(J)V", "getDateModified", "setDateModified", "getDirection", "()Lorg/monora/uprotocol/core/protocol/Direction;", "setDirection", "(Lorg/monora/uprotocol/core/protocol/Direction;)V", "getDirectory", "()Ljava/lang/String;", "setDirectory", "(Ljava/lang/String;)V", "getGroupId", "setGroupId", "getId", "setId", "getLocation", "setLocation", "getMimeType", "setMimeType", "getName", "setName", "getSize", "setSize", "getState", "()Lorg/monora/uprotocol/core/transfer/TransferItem$State;", "setState", "(Lorg/monora/uprotocol/core/transfer/TransferItem$State;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "getItemDirection", "getItemDirectory", "getItemGroupId", "getItemId", "getItemLastChangeTime", "getItemMimeType", "getItemName", "getItemSize", "hashCode", "setItemDirection", "", "setItemDirectory", "setItemGroupId", "setItemId", "setItemLastChangeTime", "lastChangeTime", "setItemMimeType", "setItemName", "setItemSize", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class UTransferItem implements org.monora.uprotocol.core.transfer.TransferItem, android.os.Parcelable {
    private long id;
    private long groupId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mimeType;
    private long size;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String directory;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.core.protocol.Direction direction;
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.core.transfer.TransferItem.State state;
    private long dateCreated;
    private long dateModified;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UTransferItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UTransferItem copy(long id, long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, long size, @org.jetbrains.annotations.Nullable()
    java.lang.String directory, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem.State state, long dateCreated, long dateModified) {
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
    
    public UTransferItem(long id, long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, long size, @org.jetbrains.annotations.Nullable()
    java.lang.String directory, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem.State state, long dateCreated, long dateModified) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getGroupId() {
        return 0L;
    }
    
    public final void setGroupId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimeType() {
        return null;
    }
    
    public final void setMimeType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getSize() {
        return 0L;
    }
    
    public final void setSize(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirectory() {
        return null;
    }
    
    public final void setDirectory(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction getDirection() {
        return null;
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.transfer.TransferItem.State component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.transfer.TransferItem.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem.State p0) {
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getDateCreated() {
        return 0L;
    }
    
    public final void setDateCreated(long p0) {
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getDateModified() {
        return 0L;
    }
    
    public final void setDateModified(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.core.protocol.Direction getItemDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getItemDirectory() {
        return null;
    }
    
    @java.lang.Override()
    public long getItemGroupId() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getItemId() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getItemLastChangeTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getItemMimeType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getItemName() {
        return null;
    }
    
    @java.lang.Override()
    public long getItemSize() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setItemDirection(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
    }
    
    @java.lang.Override()
    public void setItemId(long id) {
    }
    
    @java.lang.Override()
    public void setItemGroupId(long groupId) {
    }
    
    @java.lang.Override()
    public void setItemName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public void setItemDirectory(@org.jetbrains.annotations.Nullable()
    java.lang.String directory) {
    }
    
    @java.lang.Override()
    public void setItemMimeType(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
    }
    
    @java.lang.Override()
    public void setItemSize(long size) {
    }
    
    @java.lang.Override()
    public void setItemLastChangeTime(long lastChangeTime) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UTransferItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UTransferItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UTransferItem[] newArray(int size) {
            return null;
        }
    }
}