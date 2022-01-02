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
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
import org.monora.uprotocol.client.android.database.model.Transfer;
import org.monora.uprotocol.client.android.database.model.TransferDetail;
import org.monora.uprotocol.core.protocol.Direction;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransferDao_Impl implements TransferDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Transfer> __insertionAdapterOfTransfer;

  private final DirectionTypeConverter __directionTypeConverter = new DirectionTypeConverter();

  private final EntityDeletionOrUpdateAdapter<Transfer> __deletionAdapterOfTransfer;

  private final EntityDeletionOrUpdateAdapter<Transfer> __updateAdapterOfTransfer;

  public TransferDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransfer = new EntityInsertionAdapter<Transfer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `transfer` (`id`,`clientUid`,`direction`,`location`,`accepted`,`dateCreated`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Transfer value) {
        stmt.bindLong(1, value.getId());
        if (value.getClientUid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientUid());
        }
        final String _tmp;
        _tmp = __directionTypeConverter.fromType(value.getDirection());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getLocation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLocation());
        }
        final int _tmp_1;
        _tmp_1 = value.getAccepted() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        stmt.bindLong(6, value.getDateCreated());
      }
    };
    this.__deletionAdapterOfTransfer = new EntityDeletionOrUpdateAdapter<Transfer>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `transfer` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Transfer value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTransfer = new EntityDeletionOrUpdateAdapter<Transfer>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `transfer` SET `id` = ?,`clientUid` = ?,`direction` = ?,`location` = ?,`accepted` = ?,`dateCreated` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Transfer value) {
        stmt.bindLong(1, value.getId());
        if (value.getClientUid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientUid());
        }
        final String _tmp;
        _tmp = __directionTypeConverter.fromType(value.getDirection());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getLocation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLocation());
        }
        final int _tmp_1;
        _tmp_1 = value.getAccepted() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        stmt.bindLong(6, value.getDateCreated());
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Transfer transfer, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTransfer.insert(transfer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Transfer transfer, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTransfer.handle(transfer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Transfer transfer, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTransfer.handle(transfer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object contains(final long groupId, final Continuation<? super Boolean> continuation) {
    final String _sql = "SELECT EXISTS(SELECT * FROM transfer WHERE id = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
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
  public Object get(final long groupId, final Continuation<? super Transfer> continuation) {
    final String _sql = "SELECT * FROM transfer WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Transfer>() {
      @Override
      public Transfer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfAccepted = CursorUtil.getColumnIndexOrThrow(_cursor, "accepted");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final Transfer _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpClientUid;
            if (_cursor.isNull(_cursorIndexOfClientUid)) {
              _tmpClientUid = null;
            } else {
              _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
            }
            final Direction _tmpDirection;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp);
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final boolean _tmpAccepted;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAccepted);
            _tmpAccepted = _tmp_1 != 0;
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            _result = new Transfer(_tmpId,_tmpClientUid,_tmpDirection,_tmpLocation,_tmpAccepted,_tmpDateCreated);
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
  public LiveData<TransferDetail> getDetail(final long groupId) {
    final String _sql = "SELECT * FROM transferDetail WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"transferDetail"}, false, new Callable<TransferDetail>() {
      @Override
      public TransferDetail call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfAccepted = CursorUtil.getColumnIndexOrThrow(_cursor, "accepted");
          final int _cursorIndexOfClientNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "clientNickname");
          final int _cursorIndexOfItemsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsCount");
          final int _cursorIndexOfItemsDoneCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsDoneCount");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfSizeOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeOfDone");
          final TransferDetail _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpClientUid;
            if (_cursor.isNull(_cursorIndexOfClientUid)) {
              _tmpClientUid = null;
            } else {
              _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
            }
            final Direction _tmpDirection;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final boolean _tmpAccepted;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAccepted);
            _tmpAccepted = _tmp_1 != 0;
            final String _tmpClientNickname;
            if (_cursor.isNull(_cursorIndexOfClientNickname)) {
              _tmpClientNickname = null;
            } else {
              _tmpClientNickname = _cursor.getString(_cursorIndexOfClientNickname);
            }
            final int _tmpItemsCount;
            _tmpItemsCount = _cursor.getInt(_cursorIndexOfItemsCount);
            final int _tmpItemsDoneCount;
            _tmpItemsDoneCount = _cursor.getInt(_cursorIndexOfItemsDoneCount);
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final long _tmpSizeOfDone;
            _tmpSizeOfDone = _cursor.getLong(_cursorIndexOfSizeOfDone);
            _result = new TransferDetail(_tmpId,_tmpClientUid,_tmpClientNickname,_tmpLocation,_tmpDirection,_tmpSize,_tmpAccepted,_tmpSizeOfDone,_tmpItemsCount,_tmpItemsDoneCount,_tmpDateCreated);
          } else {
            _result = null;
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
  public TransferDetail getDetailDirect(final long groupId) {
    final String _sql = "SELECT * FROM transferDetail WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
      final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
      final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
      final int _cursorIndexOfAccepted = CursorUtil.getColumnIndexOrThrow(_cursor, "accepted");
      final int _cursorIndexOfClientNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "clientNickname");
      final int _cursorIndexOfItemsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsCount");
      final int _cursorIndexOfItemsDoneCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsDoneCount");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfSizeOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeOfDone");
      final TransferDetail _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpLocation;
        if (_cursor.isNull(_cursorIndexOfLocation)) {
          _tmpLocation = null;
        } else {
          _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        }
        final String _tmpClientUid;
        if (_cursor.isNull(_cursorIndexOfClientUid)) {
          _tmpClientUid = null;
        } else {
          _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
        }
        final Direction _tmpDirection;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfDirection)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfDirection);
        }
        _tmpDirection = __directionTypeConverter.toType(_tmp);
        final long _tmpDateCreated;
        _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
        final boolean _tmpAccepted;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfAccepted);
        _tmpAccepted = _tmp_1 != 0;
        final String _tmpClientNickname;
        if (_cursor.isNull(_cursorIndexOfClientNickname)) {
          _tmpClientNickname = null;
        } else {
          _tmpClientNickname = _cursor.getString(_cursorIndexOfClientNickname);
        }
        final int _tmpItemsCount;
        _tmpItemsCount = _cursor.getInt(_cursorIndexOfItemsCount);
        final int _tmpItemsDoneCount;
        _tmpItemsDoneCount = _cursor.getInt(_cursorIndexOfItemsDoneCount);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final long _tmpSizeOfDone;
        _tmpSizeOfDone = _cursor.getLong(_cursorIndexOfSizeOfDone);
        _result = new TransferDetail(_tmpId,_tmpClientUid,_tmpClientNickname,_tmpLocation,_tmpDirection,_tmpSize,_tmpAccepted,_tmpSizeOfDone,_tmpItemsCount,_tmpItemsDoneCount,_tmpDateCreated);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<TransferDetail>> getDetails() {
    final String _sql = "SELECT * FROM transferDetail ORDER BY dateCreated DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"transferDetail"}, false, new Callable<List<TransferDetail>>() {
      @Override
      public List<TransferDetail> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfAccepted = CursorUtil.getColumnIndexOrThrow(_cursor, "accepted");
          final int _cursorIndexOfClientNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "clientNickname");
          final int _cursorIndexOfItemsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsCount");
          final int _cursorIndexOfItemsDoneCount = CursorUtil.getColumnIndexOrThrow(_cursor, "itemsDoneCount");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfSizeOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeOfDone");
          final List<TransferDetail> _result = new ArrayList<TransferDetail>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransferDetail _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpClientUid;
            if (_cursor.isNull(_cursorIndexOfClientUid)) {
              _tmpClientUid = null;
            } else {
              _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
            }
            final Direction _tmpDirection;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDirection)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDirection);
            }
            _tmpDirection = __directionTypeConverter.toType(_tmp);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final boolean _tmpAccepted;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAccepted);
            _tmpAccepted = _tmp_1 != 0;
            final String _tmpClientNickname;
            if (_cursor.isNull(_cursorIndexOfClientNickname)) {
              _tmpClientNickname = null;
            } else {
              _tmpClientNickname = _cursor.getString(_cursorIndexOfClientNickname);
            }
            final int _tmpItemsCount;
            _tmpItemsCount = _cursor.getInt(_cursorIndexOfItemsCount);
            final int _tmpItemsDoneCount;
            _tmpItemsDoneCount = _cursor.getInt(_cursorIndexOfItemsDoneCount);
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final long _tmpSizeOfDone;
            _tmpSizeOfDone = _cursor.getLong(_cursorIndexOfSizeOfDone);
            _item = new TransferDetail(_tmpId,_tmpClientUid,_tmpClientNickname,_tmpLocation,_tmpDirection,_tmpSize,_tmpAccepted,_tmpSizeOfDone,_tmpItemsCount,_tmpItemsDoneCount,_tmpDateCreated);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
