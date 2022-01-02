package org.monora.uprotocol.client.android.database;

import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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
import org.monora.uprotocol.client.android.database.model.SafFolder;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SafFolderDao_Impl implements SafFolderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SafFolder> __insertionAdapterOfSafFolder;

  private final WebTransferTypeConverter __webTransferTypeConverter = new WebTransferTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfRemoveAll;

  public SafFolderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSafFolder = new EntityInsertionAdapter<SafFolder>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `safFolder` (`uri`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SafFolder value) {
        final String _tmp;
        _tmp = __webTransferTypeConverter.fromType(value.getUri());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__preparedStmtOfRemoveAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM safFolder";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SafFolder folder, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSafFolder.insert(folder);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object removeAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfRemoveAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<SafFolder>> getAll() {
    final String _sql = "SELECT * FROM safFolder ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"safFolder"}, false, new Callable<List<SafFolder>>() {
      @Override
      public List<SafFolder> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<SafFolder> _result = new ArrayList<SafFolder>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SafFolder _item;
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
            _item = new SafFolder(_tmpUri,_tmpName);
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
