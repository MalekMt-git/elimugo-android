package org.monora.uprotocol.client.android.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {org.monora.uprotocol.client.android.database.ClientTypeConverter.class, org.monora.uprotocol.client.android.database.IOTypeConverter.class, org.monora.uprotocol.client.android.database.DirectionTypeConverter.class, org.monora.uprotocol.client.android.database.TransferItemStateTypeConverter.class, org.monora.uprotocol.client.android.database.WebTransferTypeConverter.class})
@androidx.room.Database(entities = {org.monora.uprotocol.client.android.database.model.UClient.class, org.monora.uprotocol.client.android.database.model.UClientAddress.class, org.monora.uprotocol.client.android.database.model.UTransferItem.class, org.monora.uprotocol.client.android.database.model.SafFolder.class, org.monora.uprotocol.client.android.database.model.SharedText.class, org.monora.uprotocol.client.android.database.model.Transfer.class, org.monora.uprotocol.client.android.database.model.WebClient.class, org.monora.uprotocol.client.android.database.model.WebTransfer.class}, views = {org.monora.uprotocol.client.android.database.model.TransferDetail.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "clientAddressDao", "Lorg/monora/uprotocol/client/android/database/ClientAddressDao;", "clientDao", "Lorg/monora/uprotocol/client/android/database/ClientDao;", "safFolderDao", "Lorg/monora/uprotocol/client/android/database/SafFolderDao;", "sharedTextDao", "Lorg/monora/uprotocol/client/android/database/SharedTextDao;", "transferDao", "Lorg/monora/uprotocol/client/android/database/TransferDao;", "transferItemDao", "Lorg/monora/uprotocol/client/android/database/TransferItemDao;", "webClientDao", "Lorg/monora/uprotocol/client/android/database/WebClientDao;", "webTransferDao", "Lorg/monora/uprotocol/client/android/database/WebTransferDao;", "hotspot-ui_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.ClientDao clientDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.ClientAddressDao clientAddressDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.SafFolderDao safFolderDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.SharedTextDao sharedTextDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.TransferDao transferDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.TransferItemDao transferItemDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.WebClientDao webClientDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.database.WebTransferDao webTransferDao();
}