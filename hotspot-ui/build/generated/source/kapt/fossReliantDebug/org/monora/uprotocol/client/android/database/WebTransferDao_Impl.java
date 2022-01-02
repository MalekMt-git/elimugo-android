package org.monora.uprotocol.client.android.database;

import android.database.Cursor;
import android.net.Uri;
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
import org.monora.uprotocol.client.android.database.model.WebTransfer;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WebTransferDao_Impl implements WebTransferDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WebTransfer> __insertionAdapterOfWebTransfer;

  private final WebTransferTypeConverter __webTransferTypeConverter = new WebTransferTypeConverter();

  private final EntityDeletionOrUpdateAdapter<WebTransfer> __deletionAdapterOfWebTransfer;

  public WebTransferDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWebTransfer = new EntityInsertionAdapter<WebTransfer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `webTransfer` (`id`,`uri`,`name`,`mimeType`,`size`,`dateCreated`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WebTransfer value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __webTransferTypeConverter.fromType(value.getUri());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
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
        stmt.bindLong(6, value.getDateCreated());
      }
    };
    this.__deletionAdapterOfWebTransfer = new EntityDeletionOrUpdateAdapter<WebTransfer>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `webTransfer` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WebTransfer value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final WebTransfer webTransfer,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWebTransfer.insert(webTransfer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object remove(final WebTransfer webTransfer,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWebTransfer.handle(webTransfer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<WebTransfer> get(final int id) {
    final String _sql = "SELECT * FROM webTransfer WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"webTransfer"}, false, new Callable<WebTransfer>() {
      @Override
      public WebTransfer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final WebTransfer _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Uri _tmpUri;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfUri)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfUri);
            }
            _tmpUri = __webTransferTypeConverter.toType(_tmp);
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
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            _result = new WebTransfer(_tmpId,_tmpUri,_tmpName,_tmpMimeType,_tmpSize,_tmpDateCreated);
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
  public Object get(final Uri uri, final Continuation<? super WebTransfer> continuation) {
    final String _sql = "SELECT * FROM webTransfer WHERE uri = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __webTransferTypeConverter.fromType(uri);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WebTransfer>() {
      @Override
      public WebTransfer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final WebTransfer _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Uri _tmpUri;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfUri)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfUri);
            }
            _tmpUri = __webTransferTypeConverter.toType(_tmp_1);
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
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            _result = new WebTransfer(_tmpId,_tmpUri,_tmpName,_tmpMimeType,_tmpSize,_tmpDateCreated);
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
  public LiveData<List<WebTransfer>> getAll() {
    final String _sql = "SELECT * FROM webTransfer ORDER BY dateCreated DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"webTransfer"}, false, new Callable<List<WebTransfer>>() {
      @Override
      public List<WebTransfer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final List<WebTransfer> _result = new ArrayList<WebTransfer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WebTransfer _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Uri _tmpUri;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfUri)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfUri);
            }
            _tmpUri = __webTransferTypeConverter.toType(_tmp);
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
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            _item = new WebTransfer(_tmpId,_tmpUri,_tmpName,_tmpMimeType,_tmpSize,_tmpDateCreated);
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
