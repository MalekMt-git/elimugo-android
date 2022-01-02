package org.monora.uprotocol.client.android.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0014\u0010\u001f\u001a\u00020\r2\n\u0010 \u001a\u00060!j\u0002`\"H\u0016J\b\u0010#\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\u0010\u0010\'\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/MainTransferOperation;", "Lorg/monora/uprotocol/core/transfer/TransferOperation;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "transferRepository", "Lorg/monora/uprotocol/client/android/data/TransferRepository;", "transferParams", "Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "cancellationCallback", "Lkotlin/Function0;", "", "(Lorg/monora/uprotocol/client/android/backend/Backend;Lorg/monora/uprotocol/client/android/data/TransferRepository;Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function0;)V", "bytesIncreaseInSec", "", "speedCalcTime", "clearBytesOngoing", "clearOngoing", "finishOperation", "getBytesOngoing", "getBytesTotal", "getCount", "", "getOngoing", "Lorg/monora/uprotocol/core/transfer/TransferItem;", "installReceivedContent", "descriptor", "Lorg/monora/uprotocol/core/io/StreamDescriptor;", "onCancelOperation", "onUnhandledException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "publishProgress", "setBytesOngoing", "bytes", "bytesIncrease", "setBytesTotal", "setCount", "count", "setOngoing", "transferItem", "Companion", "hotspot-ui_fossReliantDebug"})
public final class MainTransferOperation implements org.monora.uprotocol.core.transfer.TransferOperation {
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    private final org.monora.uprotocol.client.android.data.TransferRepository transferRepository = null;
    private final org.monora.uprotocol.client.android.task.transfer.TransferParams transferParams = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> state = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> cancellationCallback = null;
    private long speedCalcTime = 0L;
    private long bytesIncreaseInSec = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.protocol.MainTransferOperation.Companion Companion = null;
    private static final java.lang.String TAG = "MainTransferOperation";
    
    public MainTransferOperation(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.TransferRepository transferRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.task.transfer.TransferParams transferParams, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> cancellationCallback) {
        super();
    }
    
    @java.lang.Override()
    public void clearBytesOngoing() {
    }
    
    @java.lang.Override()
    public void clearOngoing() {
    }
    
    @java.lang.Override()
    public void finishOperation() {
    }
    
    @java.lang.Override()
    public long getBytesOngoing() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getBytesTotal() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.monora.uprotocol.core.transfer.TransferItem getOngoing() {
        return null;
    }
    
    @java.lang.Override()
    public void installReceivedContent(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.io.StreamDescriptor descriptor) {
    }
    
    @java.lang.Override()
    public void onCancelOperation() {
    }
    
    @java.lang.Override()
    public void onUnhandledException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @java.lang.Override()
    public void publishProgress() {
    }
    
    @java.lang.Override()
    public void setBytesOngoing(long bytes, long bytesIncrease) {
    }
    
    @java.lang.Override()
    public void setBytesTotal(long bytes) {
    }
    
    @java.lang.Override()
    public void setCount(int count) {
    }
    
    @java.lang.Override()
    public void setOngoing(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.transfer.TransferItem transferItem) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/protocol/MainTransferOperation$Companion;", "", "()V", "TAG", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}