package org.monora.uprotocol.client.android.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016JX\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0016H\u0016JB\u0010*\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\u000f2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\u0012\u00106\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u00107\u001a\u00020\u000fH\u0016J\u0012\u00108\u001a\u0004\u0018\u0001092\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010:\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020+H\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010@\u001a\u00020&H\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J(\u0010F\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u00101\u001a\u000202H\u0016J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020<H\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010I\u001a\u00020<H\u0016J \u0010L\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020\u000f2\u000e\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0OH\u0016J\u0018\u0010L\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020+H\u0016J\u0018\u0010L\u001a\u00020M2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u0011H\u0016J\u0010\u0010L\u001a\u00020M2\u0006\u0010R\u001a\u00020SH\u0016J\u001a\u0010T\u001a\u00020M2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010U\u001a\u0004\u0018\u000109H\u0016J\b\u0010V\u001a\u00020MH\u0016J\u0010\u0010W\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J0\u0010X\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020+2\u0006\u0010Y\u001a\u00020Z2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/MainPersistenceProvider;", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "context", "Landroid/content/Context;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "userDataRepository", "Lorg/monora/uprotocol/client/android/data/UserDataRepository;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/ClientRepository;Lorg/monora/uprotocol/client/android/data/UserDataRepository;Lorg/monora/uprotocol/client/android/data/TransferRepository;)V", "getContext", "()Landroid/content/Context;", "invalidationRequests", "", "", "approveInvalidationOfCredentials", "", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "containsTransfer", "groupId", "", "createClientAddressFor", "Lorg/monora/uprotocol/client/android/database/model/UClientAddress;", "address", "Ljava/net/InetAddress;", "clientUid", "createClientFor", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "uid", "nickname", "manufacturer", "product", "type", "Lorg/monora/uprotocol/core/protocol/ClientType;", "versionName", "versionCode", "", "protocolVersion", "protocolVersionMin", "revisionOfPicture", "createTransferItemFor", "Lorg/monora/uprotocol/core/transfer/TransferItem;", "id", "name", "mimeType", "size", "directory", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "getCertificate", "Ljava/security/cert/X509Certificate;", "getClient", "getClientFor", "getClientNickname", "getClientPicture", "", "getClientUid", "getDescriptorFor", "Lorg/monora/uprotocol/core/io/StreamDescriptor;", "transferItem", "getFirstReceivableItem", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "getNetworkPin", "getPrivateKey", "Ljava/security/PrivateKey;", "getPublicKey", "Ljava/security/PublicKey;", "hasRequestForInvalidationOfCredentials", "loadTransferItem", "openInputStream", "Ljava/io/InputStream;", "descriptor", "openOutputStream", "Ljava/io/OutputStream;", "persist", "", "itemList", "", "item", "updating", "clientAddress", "Lorg/monora/uprotocol/core/protocol/ClientAddress;", "persistClientPicture", "data", "revokeNetworkPin", "saveRequestForInvalidationOfCredentials", "setState", "state", "Lorg/monora/uprotocol/core/transfer/TransferItem$State;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hotspot-ui_fossReliantDebug"})
public final class MainPersistenceProvider implements org.monora.uprotocol.core.persistence.PersistenceProvider {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.data.ClientRepository clientRepository = null;
    private final org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final java.util.Set<java.lang.String> invalidationRequests = null;
    
    @javax.inject.Inject()
    public MainPersistenceProvider(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public boolean approveInvalidationOfCredentials(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client) {
        return false;
    }
    
    @java.lang.Override()
    public boolean containsTransfer(long groupId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.database.model.UClientAddress createClientAddressFor(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress address, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.database.model.UClient createClientFor(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String product, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientType type, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, int versionCode, int protocolVersion, int protocolVersionMin, long revisionOfPicture) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.core.transfer.TransferItem createTransferItemFor(long groupId, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, long size, @org.jetbrains.annotations.Nullable()
    java.lang.String directory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.security.cert.X509Certificate getCertificate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.database.model.UClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.database.model.UClient getClientFor(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public byte[] getClientPicture(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.core.io.StreamDescriptor getDescriptorFor(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem transferItem) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.database.model.UTransferItem getFirstReceivableItem(long groupId) {
        return null;
    }
    
    @java.lang.Override()
    public int getNetworkPin() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.security.PrivateKey getPrivateKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.security.PublicKey getPublicKey() {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasRequestForInvalidationOfCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.core.transfer.TransferItem loadTransferItem(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, long groupId, long id, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream openInputStream(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.io.StreamDescriptor descriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.OutputStream openOutputStream(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.io.StreamDescriptor descriptor) {
        return null;
    }
    
    @java.lang.Override()
    public void persist(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, boolean updating) {
    }
    
    @java.lang.Override()
    public void persist(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientAddress clientAddress) {
    }
    
    @java.lang.Override()
    public void persist(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem item) {
    }
    
    @java.lang.Override()
    public void persist(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.monora.uprotocol.core.transfer.TransferItem> itemList) {
    }
    
    @java.lang.Override()
    public void persistClientPicture(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.Nullable()
    byte[] data) {
    }
    
    @java.lang.Override()
    public void revokeNetworkPin() {
    }
    
    @java.lang.Override()
    public void saveRequestForInvalidationOfCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid) {
    }
    
    @java.lang.Override()
    public void setState(@org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem item, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem.State state, @org.jetbrains.annotations.Nullable()
    java.lang.Exception e) {
    }
}