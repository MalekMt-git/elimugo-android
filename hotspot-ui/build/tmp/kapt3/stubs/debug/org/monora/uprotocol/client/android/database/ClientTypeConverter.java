package org.monora.uprotocol.client.android.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/database/ClientTypeConverter;", "", "()V", "bouncyCastleProvider", "Lorg/spongycastle/jce/provider/BouncyCastleProvider;", "fromCertificate", "", "value", "Ljava/security/cert/X509Certificate;", "fromType", "Lorg/monora/uprotocol/core/protocol/ClientType;", "toCertificate", "toType", "hotspot-ui_debug"})
public final class ClientTypeConverter {
    private final org.spongycastle.jce.provider.BouncyCastleProvider bouncyCastleProvider = null;
    
    public ClientTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCertificate(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.security.cert.X509Certificate toCertificate(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromType(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final org.monora.uprotocol.core.protocol.ClientType toType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}