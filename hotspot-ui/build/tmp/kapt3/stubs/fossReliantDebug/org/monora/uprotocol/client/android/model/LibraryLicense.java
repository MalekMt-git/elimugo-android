package org.monora.uprotocol.client.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020#H\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006/"}, d2 = {"Lorg/monora/uprotocol/client/android/model/LibraryLicense;", "Landroid/os/Parcelable;", "artifactId", "Lorg/monora/uprotocol/client/android/model/ArtifactId;", "license", "", "licenseUrl", "normalizedLicense", "url", "libraryName", "(Lorg/monora/uprotocol/client/android/model/ArtifactId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArtifactId", "()Lorg/monora/uprotocol/client/android/model/ArtifactId;", "setArtifactId", "(Lorg/monora/uprotocol/client/android/model/ArtifactId;)V", "getLibraryName", "()Ljava/lang/String;", "setLibraryName", "(Ljava/lang/String;)V", "getLicense", "setLicense", "getLicenseUrl", "setLicenseUrl", "getNormalizedLicense", "setNormalizedLicense", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_fossReliantDebug"})
public final class LibraryLicense implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "artifactId")
    private org.monora.uprotocol.client.android.model.ArtifactId artifactId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "license")
    private java.lang.String license;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "licenseUrl")
    private java.lang.String licenseUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "normalizedLicense")
    private java.lang.String normalizedLicense;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "url")
    private java.lang.String url;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "libraryName")
    private java.lang.String libraryName;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.LibraryLicense> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.LibraryLicense copy(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ArtifactId artifactId, @org.jetbrains.annotations.Nullable()
    java.lang.String license, @org.jetbrains.annotations.Nullable()
    java.lang.String licenseUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String normalizedLicense, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String libraryName) {
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
    
    public LibraryLicense(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ArtifactId artifactId, @org.jetbrains.annotations.Nullable()
    java.lang.String license, @org.jetbrains.annotations.Nullable()
    java.lang.String licenseUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String normalizedLicense, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String libraryName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.ArtifactId component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.model.ArtifactId getArtifactId() {
        return null;
    }
    
    public final void setArtifactId(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ArtifactId p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLicense() {
        return null;
    }
    
    public final void setLicense(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLicenseUrl() {
        return null;
    }
    
    public final void setLicenseUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNormalizedLicense() {
        return null;
    }
    
    public final void setNormalizedLicense(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLibraryName() {
        return null;
    }
    
    public final void setLibraryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.model.LibraryLicense> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.LibraryLicense createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.model.LibraryLicense[] newArray(int size) {
            return null;
        }
    }
}