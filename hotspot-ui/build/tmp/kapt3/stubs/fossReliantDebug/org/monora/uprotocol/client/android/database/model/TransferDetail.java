package org.monora.uprotocol.client.android.database.model;

import java.lang.System;

@androidx.room.DatabaseView(viewName = "transferDetail", value = "SELECT transfer.id, transfer.location, transfer.clientUid, transfer.direction, transfer.dateCreated, transfer.accepted, client.nickname AS clientNickname, COUNT(items.id) AS itemsCount, COUNT(CASE WHEN items.state == \'Done\' THEN items.id END) as itemsDoneCount, SUM(items.size) AS size, SUM(CASE WHEN items.state == \'Done\' THEN items.size END) as sizeOfDone FROM transfer INNER JOIN client ON client.uid = transfer.clientUid INNER JOIN transferItem items ON items.groupId = transfer.id GROUP BY items.groupId")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u000fH\u00c6\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u000fH\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019\u00a8\u00066"}, d2 = {"Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "id", "", "clientUid", "", "clientNickname", "location", "direction", "Lorg/monora/uprotocol/core/protocol/Direction;", "size", "accepted", "", "sizeOfDone", "itemsCount", "", "itemsDoneCount", "dateCreated", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/monora/uprotocol/core/protocol/Direction;JZJIIJ)V", "getAccepted", "()Z", "getClientNickname", "()Ljava/lang/String;", "getClientUid", "getDateCreated", "()J", "getDirection", "()Lorg/monora/uprotocol/core/protocol/Direction;", "getId", "getItemsCount", "()I", "getItemsDoneCount", "listId", "getListId", "getLocation", "getSize", "getSizeOfDone", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "hotspot-ui_fossReliantDebug"})
public final class TransferDetail implements org.monora.uprotocol.client.android.model.ListItem {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientUid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientNickname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String location = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.Direction direction = null;
    private final long size = 0L;
    private final boolean accepted = false;
    private final long sizeOfDone = 0L;
    private final int itemsCount = 0;
    private final int itemsDoneCount = 0;
    private final long dateCreated = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.database.model.TransferDetail copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    java.lang.String clientNickname, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, long size, boolean accepted, long sizeOfDone, int itemsCount, int itemsDoneCount, long dateCreated) {
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
    
    public TransferDetail(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String clientUid, @org.jetbrains.annotations.NotNull()
    java.lang.String clientNickname, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.Direction direction, long size, boolean accepted, long sizeOfDone, int itemsCount, int itemsDoneCount, long dateCreated) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Direction getDirection() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getSize() {
        return 0L;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getAccepted() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getSizeOfDone() {
        return 0L;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getItemsCount() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getItemsDoneCount() {
        return 0;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getDateCreated() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getListId() {
        return 0L;
    }
}