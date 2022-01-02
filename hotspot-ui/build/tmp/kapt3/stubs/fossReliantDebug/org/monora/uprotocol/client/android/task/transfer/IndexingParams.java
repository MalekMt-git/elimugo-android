package org.monora.uprotocol.client.android.task.transfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lorg/monora/uprotocol/client/android/task/transfer/IndexingParams;", "", "groupId", "", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "jsonData", "", "hasPin", "", "(JLorg/monora/uprotocol/client/android/database/model/UClient;Ljava/lang/String;Z)V", "getClient", "()Lorg/monora/uprotocol/client/android/database/model/UClient;", "getGroupId", "()J", "getHasPin", "()Z", "getJsonData", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "hotspot-ui_fossReliantDebug"})
public final class IndexingParams {
    private final long groupId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.database.model.UClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String jsonData = null;
    private final boolean hasPin = false;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.task.transfer.IndexingParams copy(long groupId, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    java.lang.String jsonData, boolean hasPin) {
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
    
    public IndexingParams(long groupId, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    java.lang.String jsonData, boolean hasPin) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getGroupId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClient component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.UClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJsonData() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getHasPin() {
        return false;
    }
}