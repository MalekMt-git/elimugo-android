package org.monora.uprotocol.client.android.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010&\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\"H\u0016J(\u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010-\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/MainTransportSeat;", "Lorg/monora/uprotocol/core/TransportSeat;", "context", "Landroid/content/Context;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "fileRepository", "Lorg/monora/uprotocol/client/android/data/FileRepository;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "sharedTextRepository", "Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "taskRepository", "Lorg/monora/uprotocol/client/android/data/TaskRepository;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "transportRegistry", "Lorg/monora/uprotocol/client/android/backend/TransportRegistry;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/backend/Backend;Lorg/monora/uprotocol/client/android/data/FileRepository;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;Lorg/monora/uprotocol/client/android/data/SharedTextRepository;Lorg/monora/uprotocol/client/android/data/TaskRepository;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/backend/TransportRegistry;)V", "getContext", "()Landroid/content/Context;", "beginFileTransfer", "", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "groupId", "", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "handleClipboardRequest", "", "content", "", "type", "Lorg/monora/uprotocol/core/protocol/ClipboardType;", "handleFileTransferRejection", "handleFileTransferRequest", "hasPin", "jsonArray", "handleGuidanceRequest", "clientAddress", "Lorg/monora/uprotocol/core/protocol/ClientAddress;", "hasOngoingIndexingFor", "hasOngoingTransferFor", "clientUid", "notifyClientCredentialsChanged", "hotspot-ui_debug"})
public final class MainTransportSeat implements org.monora.uprotocol.core.TransportSeat {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    private final org.monora.uprotocol.client.android.data.FileRepository fileRepository = null;
    private final org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider = null;
    private final org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository = null;
    private final org.monora.uprotocol.client.android.data.TaskRepository taskRepository = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.backend.TransportRegistry transportRegistry = null;
    
    @javax.inject.Inject()
    public MainTransportSeat(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.FileRepository fileRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.TransportRegistry transportRegistry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void beginFileTransfer(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, long groupId, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
    }
    
    @java.lang.Override()
    public boolean handleClipboardRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClipboardType type) {
        return false;
    }
    
    @java.lang.Override()
    public boolean handleFileTransferRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, boolean hasPin, long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String jsonArray) {
        return false;
    }
    
    @java.lang.Override()
    public boolean handleFileTransferRejection(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, long groupId) {
        return false;
    }
    
    @java.lang.Override()
    public void handleGuidanceRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ClientAddress clientAddress, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
    }
    
    @java.lang.Override()
    public boolean hasOngoingTransferFor(long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasOngoingIndexingFor(long groupId) {
        return false;
    }
    
    @java.lang.Override()
    public void notifyClientCredentialsChanged(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client) {
    }
}