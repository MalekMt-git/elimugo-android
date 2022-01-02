package org.monora.uprotocol.client.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lorg/monora/uprotocol/client/android/model/FileModel;", "Landroid/os/Parcelable;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "file", "Lcom/genonbeta/android/framework/io/DocumentFile;", "indexCount", "", "(Lcom/genonbeta/android/framework/io/DocumentFile;I)V", "getFile", "()Lcom/genonbeta/android/framework/io/DocumentFile;", "getIndexCount", "()I", "isSelected", "", "isSelected$annotations", "()V", "()Z", "setSelected", "(Z)V", "listId", "", "getListId", "()J", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class FileModel implements android.os.Parcelable, org.monora.uprotocol.client.android.model.ListItem {
    @org.jetbrains.annotations.NotNull()
    private final com.genonbeta.android.framework.io.DocumentFile file = null;
    private final int indexCount = 0;
    private boolean isSelected = false;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.FileModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.FileModel copy(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file, int indexCount) {
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
    
    public FileModel(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file, int indexCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.genonbeta.android.framework.io.DocumentFile getFile() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getIndexCount() {
        return 0;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void isSelected$annotations() {
    }
    
    public final void setSelected(boolean p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.FileModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.FileModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.FileModel[] newArray(int size) {
            return null;
        }
    }
}