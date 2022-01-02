package org.monora.uprotocol.client.android.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00064"}, d2 = {"Lorg/monora/uprotocol/client/android/receiver/BgBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "getBackend", "()Lorg/monora/uprotocol/client/android/backend/Backend;", "setBackend", "(Lorg/monora/uprotocol/client/android/backend/Backend;)V", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "getClientRepository", "()Lorg/monora/uprotocol/client/android/data/ClientRepository;", "setClientRepository", "(Lorg/monora/uprotocol/client/android/data/ClientRepository;)V", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "getConnectionFactory", "()Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "setConnectionFactory", "(Lorg/monora/uprotocol/core/protocol/ConnectionFactory;)V", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "getPersistenceProvider", "()Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "setPersistenceProvider", "(Lorg/monora/uprotocol/core/persistence/PersistenceProvider;)V", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "getTransferRepository", "()Lorg/monora/uprotocol/client/android/data/TransferRepository;", "setTransferRepository", "(Lorg/monora/uprotocol/client/android/data/TransferRepository;)V", "transferTaskRepository", "Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;", "getTransferTaskRepository", "()Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;", "setTransferTaskRepository", "(Lorg/monora/uprotocol/client/android/data/TransferTaskRepository;)V", "transportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "getTransportSeat", "()Lorg/monora/uprotocol/core/TransportSeat;", "setTransportSeat", "(Lorg/monora/uprotocol/core/TransportSeat;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BgBroadcastReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.backend.Backend backend;
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.data.ClientRepository clientRepository;
    @javax.inject.Inject()
    public org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory;
    @javax.inject.Inject()
    public org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider;
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.data.TransferRepository transferRepository;
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.data.TransferTaskRepository transferTaskRepository;
    @javax.inject.Inject()
    public org.monora.uprotocol.core.TransportSeat transportSeat;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.receiver.BgBroadcastReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CLIPBOARD_COPY = "org.monora.uprotocol.client.android.action.CLIPBOARD_COPY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DEVICE_KEY_CHANGE_APPROVAL = "org.monora.uprotocol.client.android.action.DEVICE_APPROVAL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FILE_TRANSFER = "org.monora.uprotocol.client.android.action.FILE_TRANSFER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PIN_USED = "org.monora.uprotocol.client.android.transaction.action.PIN_USED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_ALL_TASKS = "org.monora.uprotocol.client.android.transaction.action.STOP_ALL_TASKS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHARED_TEXT = "extraText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CLIENT = "extraClient";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TRANSFER = "extraTransfer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ACCEPTED = "extraAccepted";
    
    public BgBroadcastReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Backend getBackend() {
        return null;
    }
    
    public final void setBackend(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.data.ClientRepository getClientRepository() {
        return null;
    }
    
    public final void setClientRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ClientRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.ConnectionFactory getConnectionFactory() {
        return null;
    }
    
    public final void setConnectionFactory(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.persistence.PersistenceProvider getPersistenceProvider() {
        return null;
    }
    
    public final void setPersistenceProvider(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.data.TransferRepository getTransferRepository() {
        return null;
    }
    
    public final void setTransferRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.data.TransferTaskRepository getTransferTaskRepository() {
        return null;
    }
    
    public final void setTransferTaskRepository(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferTaskRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.TransportSeat getTransportSeat() {
        return null;
    }
    
    public final void setTransportSeat(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSeat p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/receiver/BgBroadcastReceiver$Companion;", "", "()V", "ACTION_CLIPBOARD_COPY", "", "ACTION_DEVICE_KEY_CHANGE_APPROVAL", "ACTION_FILE_TRANSFER", "ACTION_PIN_USED", "ACTION_STOP_ALL_TASKS", "EXTRA_ACCEPTED", "EXTRA_CLIENT", "EXTRA_SHARED_TEXT", "EXTRA_TRANSFER", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}