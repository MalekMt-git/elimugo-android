package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.Entity(tableName = "client")
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\u0010H\u00c6\u0003J\t\u0010E\u001a\u00020\u0010H\u00c6\u0003J\t\u0010F\u001a\u00020\u0013H\u00c6\u0003J\t\u0010G\u001a\u00020\u0013H\u00c6\u0003J\t\u0010H\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\t\u0010J\u001a\u00020\u0004H\u00c6\u0003J\t\u0010K\u001a\u00020\u0004H\u00c6\u0003J\t\u0010L\u001a\u00020\u0004H\u00c6\u0003J\t\u0010M\u001a\u00020\tH\u00c6\u0003J\t\u0010N\u001a\u00020\u0004H\u00c6\u0003J\t\u0010O\u001a\u00020\fH\u00c6\u0003J\t\u0010P\u001a\u00020\fH\u00c6\u0003J\t\u0010Q\u001a\u00020\fH\u00c6\u0003J\u00a1\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001J\t\u0010S\u001a\u00020\fH\u00d6\u0001J\u0013\u0010T\u001a\u00020\u00132\b\u0010U\u001a\u0004\u0018\u00010VH\u00d6\u0003J\n\u0010W\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010X\u001a\u00020\u0010H\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016J\b\u0010Z\u001a\u00020\u0004H\u0016J\b\u0010[\u001a\u00020\u0004H\u0016J\b\u0010\\\u001a\u00020\fH\u0016J\b\u0010]\u001a\u00020\fH\u0016J\b\u0010^\u001a\u00020\u0010H\u0016J\b\u0010_\u001a\u00020\tH\u0016J\b\u0010`\u001a\u00020\u0004H\u0016J\b\u0010a\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020\u0004H\u0016J\t\u0010c\u001a\u00020\fH\u00d6\u0001J\b\u0010d\u001a\u00020\u0013H\u0016J\b\u0010e\u001a\u00020\u0013H\u0016J\b\u0010f\u001a\u00020\u0013H\u0016J\u0010\u0010g\u001a\u00020h2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010i\u001a\u00020h2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010j\u001a\u00020h2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010k\u001a\u00020h2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010l\u001a\u00020h2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010m\u001a\u00020h2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010n\u001a\u00020h2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010o\u001a\u00020h2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010p\u001a\u00020h2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010q\u001a\u00020h2\u0006\u0010r\u001a\u00020\u0010H\u0016J\u0010\u0010s\u001a\u00020h2\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010t\u001a\u00020h2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010u\u001a\u00020h2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010v\u001a\u00020h2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020h2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\t\u0010x\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010y\u001a\u00020h2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\fH\u00d6\u0001R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\u0015\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*\u00a8\u0006}"}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/UClient;", "Lorg/monora/uprotocol/core/protocol/Client;", "Landroid/os/Parcelable;", "uid", "", "nickname", "manufacturer", "product", "type", "Lorg/monora/uprotocol/core/protocol/ClientType;", "versionName", "versionCode", "", "protocolVersion", "protocolVersionMin", "revisionOfPicture", "", "lastUsageTime", "blocked", "", "local", "trusted", "certificate", "Ljava/security/cert/X509Certificate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/monora/uprotocol/core/protocol/ClientType;Ljava/lang/String;IIIJJZZZLjava/security/cert/X509Certificate;)V", "getBlocked", "()Z", "setBlocked", "(Z)V", "getCertificate", "()Ljava/security/cert/X509Certificate;", "setCertificate", "(Ljava/security/cert/X509Certificate;)V", "getLastUsageTime", "()J", "setLastUsageTime", "(J)V", "getLocal", "setLocal", "getManufacturer", "()Ljava/lang/String;", "setManufacturer", "(Ljava/lang/String;)V", "getNickname", "setNickname", "getProduct", "setProduct", "getProtocolVersion", "()I", "setProtocolVersion", "(I)V", "getProtocolVersionMin", "setProtocolVersionMin", "getRevisionOfPicture", "setRevisionOfPicture", "getTrusted", "setTrusted", "getType", "()Lorg/monora/uprotocol/core/protocol/ClientType;", "setType", "(Lorg/monora/uprotocol/core/protocol/ClientType;)V", "getUid", "setUid", "getVersionCode", "setVersionCode", "getVersionName", "setVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getClientCertificate", "getClientLastUsageTime", "getClientManufacturer", "getClientNickname", "getClientProduct", "getClientProtocolVersion", "getClientProtocolVersionMin", "getClientRevisionOfPicture", "getClientType", "getClientUid", "getClientVersionCode", "getClientVersionName", "hashCode", "isClientBlocked", "isClientLocal", "isClientTrusted", "setClientBlocked", "", "setClientCertificate", "setClientLastUsageTime", "setClientLocal", "setClientManufacturer", "setClientNickname", "setClientProduct", "setClientProtocolVersion", "setClientProtocolVersionMin", "setClientRevisionOfPicture", "revision", "setClientTrusted", "setClientType", "setClientUid", "setClientVersionCode", "setClientVersionName", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_debug"})
public final class UClient implements org.monora.uprotocol.core.protocol.Client, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String uid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickname;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String manufacturer;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String product;
    @org.jetbrains.annotations.NotNull()
    private org.monora.uprotocol.core.protocol.ClientType type;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versionName;
    private int versionCode;
    private int protocolVersion;
    private int protocolVersionMin;
    private long revisionOfPicture;
    private long lastUsageTime;
    private boolean blocked;
    private boolean local;
    private boolean trusted;
    @org.jetbrains.annotations.Nullable()
    private java.security.cert.X509Certificate certificate;
    public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UClient> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClient copy(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String product, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType type, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, int versionCode, int protocolVersion, int protocolVersionMin, long revisionOfPicture, long lastUsageTime, boolean blocked, boolean local, boolean trusted, @org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate certificate) {
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
    
    public UClient(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String product, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType type, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, int versionCode, int protocolVersion, int protocolVersionMin, long revisionOfPicture, long lastUsageTime, boolean blocked, boolean local, boolean trusted, @org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate certificate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManufacturer() {
        return null;
    }
    
    public final void setManufacturer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.ClientType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.ClientType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionName() {
        return null;
    }
    
    public final void setVersionName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    public final void setVersionCode(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getProtocolVersion() {
        return 0;
    }
    
    public final void setProtocolVersion(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getProtocolVersionMin() {
        return 0;
    }
    
    public final void setProtocolVersionMin(int p0) {
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getRevisionOfPicture() {
        return 0L;
    }
    
    public final void setRevisionOfPicture(long p0) {
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getLastUsageTime() {
        return 0L;
    }
    
    public final void setLastUsageTime(long p0) {
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getBlocked() {
        return false;
    }
    
    public final void setBlocked(boolean p0) {
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getLocal() {
        return false;
    }
    
    public final void setLocal(boolean p0) {
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getTrusted() {
        return false;
    }
    
    public final void setTrusted(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.security.cert.X509Certificate component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.security.cert.X509Certificate getCertificate() {
        return null;
    }
    
    public final void setCertificate(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.security.cert.X509Certificate getClientCertificate() {
        return null;
    }
    
    @java.lang.Override()
    public long getClientLastUsageTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientManufacturer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientProduct() {
        return null;
    }
    
    @java.lang.Override()
    public int getClientProtocolVersion() {
        return 0;
    }
    
    @java.lang.Override()
    public int getClientProtocolVersionMin() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.core.protocol.ClientType getClientType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientUid() {
        return null;
    }
    
    @java.lang.Override()
    public int getClientVersionCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientVersionName() {
        return null;
    }
    
    @java.lang.Override()
    public long getClientRevisionOfPicture() {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean isClientBlocked() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isClientLocal() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isClientTrusted() {
        return false;
    }
    
    @java.lang.Override()
    public void setClientBlocked(boolean blocked) {
    }
    
    @java.lang.Override()
    public void setClientCertificate(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate certificate) {
    }
    
    @java.lang.Override()
    public void setClientLastUsageTime(long lastUsageTime) {
    }
    
    @java.lang.Override()
    public void setClientLocal(boolean local) {
    }
    
    @java.lang.Override()
    public void setClientManufacturer(@org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer) {
    }
    
    @java.lang.Override()
    public void setClientNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String nickname) {
    }
    
    @java.lang.Override()
    public void setClientProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String product) {
    }
    
    @java.lang.Override()
    public void setClientProtocolVersion(int protocolVersion) {
    }
    
    @java.lang.Override()
    public void setClientProtocolVersionMin(int protocolVersionMin) {
    }
    
    @java.lang.Override()
    public void setClientRevisionOfPicture(long revision) {
    }
    
    @java.lang.Override()
    public void setClientTrusted(boolean trusted) {
    }
    
    @java.lang.Override()
    public void setClientType(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType type) {
    }
    
    @java.lang.Override()
    public void setClientUid(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    @java.lang.Override()
    public void setClientVersionCode(int versionCode) {
    }
    
    @java.lang.Override()
    public void setClientVersionName(@org.jetbrains.annotations.NotNull()
    java.lang.String versionName) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.database.model.UClient> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UClient createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.monora.uprotocol.client.android.database.model.UClient[] newArray(int size) {
            return null;
        }
    }
}