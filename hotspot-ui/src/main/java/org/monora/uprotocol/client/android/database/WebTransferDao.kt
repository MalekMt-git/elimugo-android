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

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import org.monora.uprotocol.client.android.database.model.WebTransfer

@Dao
interface WebTransferDao {
    @Query("SELECT * FROM webTransfer WHERE id = :id")
    fun get(id: Int): LiveData<WebTransfer>

    @Query("SELECT * FROM webTransfer WHERE uri = :uri")
    suspend fun get(uri: Uri): WebTransfer?

    @Query("SELECT * FROM webTransfer ORDER BY dateCreated DESC")
    fun getAll(): LiveData<List<WebTransfer>>

    @Insert
    suspend fun insert(webTransfer: WebTransfer)

    @Delete
    suspend fun remove(webTransfer: WebTransfer)
}
