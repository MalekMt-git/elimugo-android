package org.monora.uprotocol.client.android.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.monora.uprotocol.client.android.database.model.UTransferItem;
import org.monora.uprotocol.core.protocol.Direction;
import org.monora.uprotocol.core.transfer.TransferItem;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransferItemDao_Impl implements TransferItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UTransferItem> __insertionAdapterOfUTransferItem;

  private final DirectionTypeConverter __directionTypeConverter = new DirectionTypeConverter();

  private final TransferItemStateTypeConverter __transferItemStateTypeConverter = new TransferItemStateTypeConverter();

  private final EntityDeletionOrUpdateAdapter<UTransferItem> __deletionAdapterOfUTransferItem;

  private final EntityDeletionOrUpdateAdapter<UTransferItem> __updateAdapterOfUTransferItem;

  public TransferItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUTransferItem = new EntityInsertionAdapter<UTransferItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `transferItem` (`id`,`groupId`,`name`,`mimeType`,`size`,`directory`,`location`,`direction`,`state`,`dateCreated`,`dateModified`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UTransferItem value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getGroupId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getMimeType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMimeType());
        }
        stmt.bindLong(5, value.getSize());
        if (value.getDirectory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDirectory());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLocation());
        }
        final String _tmp;
        _tmp = __directionTypeConverter.fromType(value.getDirection());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __transferItemStateTypeConverter.fromType(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_1);
        }
        stmt.bindLong(10, value.getDateCreated());
        stmt.bindLong(11, value.getDateModified());
      }
    };
    this.__deletionAdapterOfUTransferItem = new EntityDeletionOrUpdateAdapter<UTransferItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `transferItem` WHERE `groupId` = ? AND `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UTransferItem value) {
        stmt.bindLong(1, value.getGroupId());
        stmt.bindLong(2, value.getId());
      }
    };
    this.__updateAdapterOfUTransferItem = new EntityDeletionOrUpdateAdapter<UTransferItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `transferItem` SET `id` = ?,`groupId` = ?,`name` = ?,`mimeType` = ?,`size` = ?,`directory` = ?,`location` = ?,`direction` = ?,`state` = ?,`dateCreated` = ?,`dateModified` = ? WHERE `groupId` = ? AND `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UTransferItem value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getGroupId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getMimeType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMimeType());
        }
        stmt.bindLong(5, value.getSize());
        if (value.getDirectory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDirectory());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLocation());
        }
        final String _tmp;
        _tmp = __directionTypeConverter.fromType(value.getDirection());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __transferItemStateTypeConverter.fromType(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_1);
        }
        stmt.bindLong(10, value.getDateCreated());
        stmt.bindLong(11, value.getDateModified());
        stmt.bindLong(12, value.getGroupId());
        stmt.bindLong(13, value.getId());
      }
    };
  }

  @Override
  public Object insert(final List<UTransferItem> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUTransferItem.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final UTransferItem transferItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUTransferItem.handle(transferItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final UTransferItem transferItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUTransferItem.handle(transferItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<UTransferItem>> getAll(final long groupId) {
    final String _sql = "SELECT * FROM transferItem WHERE groupId = ? ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"transferItem"}, false, new Callable<List<UTransferItem>>() {
      @Override
      public List<UTransferItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDirectory = CursorUtil.getColumnIndexOrThrow(_cursor, "directory");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final List<UTransferItem> _result = new ArrayList<UTransferItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UTransferItem _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpGroupId;
            _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpMimeType;
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _tmpMimeType = null;
            } else {
              _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final String _tmpDirectory;
            if (_cursor.isNull(_cursorIndexOfDirectory)) {
              _tmpDirectory = null;
            } else {
              _tmpDirectory = _cursor.getString(_cursorIndexOfDirectory);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final Direction _tmpDirection;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp);
            final TransferItem.State _tmpState;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __transferItemStateTypeConverter.toType(_tmp_1);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            _item = new UTransferItem(_tmpId,_tmpGroupId,_tmpName,_tmpMimeType,_tmpSize,_tmpDirectory,_tmpLocation,_tmpDirection,_tmpState,_tmpDateCreated,_tmpDateModified);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getReceivable(final long groupId,
      final Continuation<? super UTransferItem> continuation) {
    final String _sql = "SELECT * FROM transferItem WHERE groupId = ? AND state == 'Pending' ORDER BY name LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UTransferItem>() {
      @Override
      public UTransferItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDirectory = CursorUtil.getColumnIndexOrThrow(_cursor, "directory");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final UTransferItem _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpGroupId;
            _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpMimeType;
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _tmpMimeType = null;
            } else {
              _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final String _tmpDirectory;
            if (_cursor.isNull(_cursorIndexOfDirectory)) {
              _tmpDirectory = null;
            } else {
              _tmpDirectory = _cursor.getString(_cursorIndexOfDirectory);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final Direction _tmpDirection;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp);
            final TransferItem.State _tmpState;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __transferItemStateTypeConverter.toType(_tmp_1);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            _result = new UTransferItem(_tmpId,_tmpGroupId,_tmpName,_tmpMimeType,_tmpSize,_tmpDirectory,_tmpLocation,_tmpDirection,_tmpState,_tmpDateCreated,_tmpDateModified);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object get(final long groupId, final long id, final Direction direction,
      final Continuation<? super UTransferItem> continuation) {
    final String _sql = "SELECT * FROM transferItem WHERE groupId = ? AND id = ? AND direction = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, id);
    _argIndex = 3;
    final String _tmp;
    _tmp = __directionTypeConverter.fromType(direction);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UTransferItem>() {
      @Override
      public UTransferItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDirectory = CursorUtil.getColumnIndexOrThrow(_cursor, "directory");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final UTransferItem _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpGroupId;
            _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpMimeType;
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _tmpMimeType = null;
            } else {
              _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final String _tmpDirectory;
            if (_cursor.isNull(_cursorIndexOfDirectory)) {
              _tmpDirectory = null;
            } else {
              _tmpDirectory = _cursor.getString(_cursorIndexOfDirectory);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final Direction _tmpDirection;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp_1);
            final TransferItem.State _tmpState;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __transferItemStateTypeConverter.toType(_tmp_2);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            _result = new UTransferItem(_tmpId,_tmpGroupId,_tmpName,_tmpMimeType,_tmpSize,_tmpDirectory,_tmpLocation,_tmpDirection,_tmpState,_tmpDateCreated,_tmpDateModified);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object get(final String location, final Direction direction,
      final Continuation<? super UTransferItem> continuation) {
    final String _sql = "SELECT * FROM transferItem WHERE location = ? AND direction = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (location == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, location);
    }
    _argIndex = 2;
    final String _tmp;
    _tmp = __directionTypeConverter.fromType(direction);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UTransferItem>() {
      @Override
      public UTransferItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDirectory = CursorUtil.getColumnIndexOrThrow(_cursor, "directory");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final UTransferItem _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpGroupId;
            _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpMimeType;
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _tmpMimeType = null;
            } else {
              _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final String _tmpDirectory;
            if (_cursor.isNull(_cursorIndexOfDirectory)) {
              _tmpDirectory = null;
            } else {
              _tmpDirectory = _cursor.getString(_cursorIndexOfDirectory);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final Direction _tmpDirection;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp_1);
            final TransferItem.State _tmpState;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __transferItemStateTypeConverter.toType(_tmp_2);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            _result = new UTransferItem(_tmpId,_tmpGroupId,_tmpName,_tmpMimeType,_tmpSize,_tmpDirectory,_tmpLocation,_tmpDirection,_tmpState,_tmpDateCreated,_tmpDateModified);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
