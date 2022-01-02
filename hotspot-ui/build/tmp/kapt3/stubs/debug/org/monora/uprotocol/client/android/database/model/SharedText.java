package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.Entity(tableName = "sharedText", foreignKeys = {@androidx.room.ForeignKey(entity = org.monora.uprotocol.client.android.database.model.UClient.class, childColumns = {"clientUid"}, onDelete = 5, parentColumns = {"uid"})})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0004H\u00d6\u0001J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001b\u00a8\u0006."}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/SharedText;", "Landroid/os/Parcelable;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "id", "", "clientUid", "", "text", "created", "", "modified", "(ILjava/lang/String;Ljava/lang/String;JJ)V", "getClientUid", "()Ljava/lang/String;", "getCreated", "()J", "getId", "()I", "listId", "getListId$annotations", "()V", "getListId", "getModified", "setModified", "(J)V", "getText", "setText", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class SharedText implements android.os.Parcelable, org.monora.uprotocol.client.android.model.ListItem {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String clientUid = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String text;
    private final long created = 0L;
    private long modified;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.SharedText> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.SharedText copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    java.lang.String text, long created, long modified) {
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
    
    public SharedText(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    java.lang.String text, long created, long modified) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getCreated() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getModified() {
        return 0L;
    }
    
    public final void setModified(long p0) {
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getListId$annotations() {
    }
    
    @java.lang.Override()
    public long getListId() {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.SharedText> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.SharedText createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.SharedText[] newArray(int size) {
            return null;
        }
    }
}