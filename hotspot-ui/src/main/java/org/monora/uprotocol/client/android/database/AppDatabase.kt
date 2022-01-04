/*
 * Copyright (C) 2021 Veli Tasalı
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.monora.uprotocol.client.android.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.monora.uprotocol.client.android.database.model.SafFolder
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.TransferDetail
import org.monora.uprotocol.client.android.database.model.UClient
import org.monora.uprotocol.client.android.database.model.UClientAddress
import org.monora.uprotocol.client.android.database.model.UTransferItem
import org.monora.uprotocol.client.android.database.model.WebClient
import org.monora.uprotocol.client.android.database.model.WebTransfer

@Database(
    entities = [
        UClient::class,
        UClientAddress::class,
        UTransferItem::class,
        SafFolder::class,
        SharedText::class,
        Transfer::class,
        WebClient::class,
        WebTransfer::class,
    ],
    views = [TransferDetail::class],
    version = 1
)
@TypeConverters(
    ClientTypeConverter::class, IOTypeConverter::class, DirectionTypeConverter::class,
    TransferItemStateTypeConverter::class, WebTransferTypeConverter::class
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun clientDao(): ClientDao

    abstract fun clientAddressDao(): ClientAddressDao

    abstract fun safFolderDao(): SafFolderDao

    abstract fun sharedTextDao(): SharedTextDao

    abstract fun transferDao(): TransferDao

    abstract fun transferItemDao(): TransferItemDao

    abstract fun webClientDao(): WebClientDao

    abstract fun webTransferDao(): WebTransferDao
}
