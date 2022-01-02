package org.monora.uprotocol.client.android.task.transfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J1\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0019H\u00d6\u0001J\t\u0010=\u001a\u00020>H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006?"}, d2 = {"Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "bytesTotal", "", "bytesSessionTotal", "(Lorg/monora/uprotocol/client/android/database/model/Transfer;Lorg/monora/uprotocol/core/protocol/Client;JJ)V", "averageSpeed", "getAverageSpeed", "()J", "setAverageSpeed", "(J)V", "bytesOngoing", "getBytesOngoing", "setBytesOngoing", "getBytesSessionTotal", "setBytesSessionTotal", "getBytesTotal", "setBytesTotal", "getClient", "()Lorg/monora/uprotocol/core/protocol/Client;", "count", "", "getCount", "()I", "setCount", "(I)V", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "lastFile", "Landroidx/documentfile/provider/DocumentFile;", "getLastFile", "()Landroidx/documentfile/provider/DocumentFile;", "setLastFile", "(Landroidx/documentfile/provider/DocumentFile;)V", "ongoing", "Lorg/monora/uprotocol/core/transfer/TransferItem;", "getOngoing", "()Lorg/monora/uprotocol/core/transfer/TransferItem;", "setOngoing", "(Lorg/monora/uprotocol/core/transfer/TransferItem;)V", "startTime", "getStartTime", "getTransfer", "()Lorg/monora/uprotocol/client/android/database/model/Transfer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "hotspot-ui_fossReliantDebug"})
public final class TransferParams {
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.Client client = null;
    private long bytesTotal;
    private long bytesSessionTotal;
    private long averageSpeed = 0L;
    private long bytesOngoing = 0L;
    private int count = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.Nullable()
    private androidx.documentfile.provider.DocumentFile lastFile;
    @org.jetbrains.annotations.Nullable()
    private org.monora.uprotocol.core.transfer.TransferItem ongoing;
    private final long startTime = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.task.transfer.TransferParams copy(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, long bytesTotal, long bytesSessionTotal) {
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
    
    public TransferParams(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Client client, long bytesTotal, long bytesSessionTotal) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.Transfer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.Transfer getTransfer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Client component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Client getClient() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getBytesTotal() {
        return 0L;
    }
    
    public final void setBytesTotal(long p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getBytesSessionTotal() {
        return 0L;
    }
    
    public final void setBytesSessionTotal(long p0) {
    }
    
    public final long getAverageSpeed() {
        return 0L;
    }
    
    public final void setAverageSpeed(long p0) {
    }
    
    public final long getBytesOngoing() {
        return 0L;
    }
    
    public final void setBytesOngoing(long p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.documentfile.provider.DocumentFile getLastFile() {
        return null;
    }
    
    public final void setLastFile(@org.jetbrains.annotations.Nullable()
    androidx.documentfile.provider.DocumentFile p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.monora.uprotocol.core.transfer.TransferItem getOngoing() {
        return null;
    }
    
    public final void setOngoing(@org.jetbrains.annotations.Nullable()
    org.monora.uprotocol.core.transfer.TransferItem p0) {
    }
    
    public final long getStartTime() {
        return 0L;
    }
}