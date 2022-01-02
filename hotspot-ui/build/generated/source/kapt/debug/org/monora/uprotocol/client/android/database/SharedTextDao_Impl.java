package org.monora.uprotocol.client.android.database;

import android.database.Cursor;
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
import org.monora.uprotocol.client.android.database.model.SharedText;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SharedTextDao_Impl implements SharedTextDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SharedText> __insertionAdapterOfSharedText;

  private final EntityDeletionOrUpdateAdapter<SharedText> __deletionAdapterOfSharedText;

  private final EntityDeletionOrUpdateAdapter<SharedText> __updateAdapterOfSharedText;

  public SharedTextDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSharedText = new EntityInsertionAdapter<SharedText>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sharedText` (`id`,`clientUid`,`text`,`created`,`modified`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SharedText value) {
        stmt.bindLong(1, value.getId());
        if (value.getClientUid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientUid());
        }
        if (value.getText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getText());
        }
        stmt.bindLong(4, value.getCreated());
        stmt.bindLong(5, value.getModified());
      }
    };
    this.__deletionAdapterOfSharedText = new EntityDeletionOrUpdateAdapter<SharedText>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `sharedText` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SharedText value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSharedText = new EntityDeletionOrUpdateAdapter<SharedText>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sharedText` SET `id` = ?,`clientUid` = ?,`text` = ?,`created` = ?,`modified` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SharedText value) {
        stmt.bindLong(1, value.getId());
        if (value.getClientUid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientUid());
        }
        if (value.getText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getText());
        }
        stmt.bindLong(4, value.getCreated());
        stmt.bindLong(5, value.getModified());
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public Object insert(final SharedText sharedText, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSharedText.insert(sharedText);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final SharedText sharedText, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSharedText.handle(sharedText);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final SharedText sharedText, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSharedText.handle(sharedText);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<SharedText>> getAll() {
    final String _sql = "SELECT * FROM sharedText ORDER BY created DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sharedText"}, false, new Callable<List<SharedText>>() {
      @Override
      public List<SharedText> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final int _cursorIndexOfModified = CursorUtil.getColumnIndexOrThrow(_cursor, "modified");
          final List<SharedText> _result = new ArrayList<SharedText>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SharedText _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpClientUid;
            if (_cursor.isNull(_cursorIndexOfClientUid)) {
              _tmpClientUid = null;
            } else {
              _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
            }
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final long _tmpCreated;
            _tmpCreated = _cursor.getLong(_cursorIndexOfCreated);
            final long _tmpModified;
            _tmpModified = _cursor.getLong(_cursorIndexOfModified);
            _item = new SharedText(_tmpId,_tmpClientUid,_tmpText,_tmpCreated,_tmpModified);
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
