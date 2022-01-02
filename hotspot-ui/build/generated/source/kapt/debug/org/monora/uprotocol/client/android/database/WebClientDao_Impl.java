package org.monora.uprotocol.client.android.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.monora.uprotocol.client.android.database.model.WebClient;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WebClientDao_Impl implements WebClientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WebClient> __insertionAdapterOfWebClient;

  public WebClientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWebClient = new EntityInsertionAdapter<WebClient>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `webClient` (`address`,`title`,`blocked`,`created`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WebClient value) {
        if (value.getAddress() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAddress());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final int _tmp;
        _tmp = value.getBlocked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getCreated());
      }
    };
  }

  @Override
  public Object insert(final WebClient webClient, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWebClient.insert(webClient);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object get(final String address, final Continuation<? super WebClient> continuation) {
    final String _sql = "SELECT * FROM webClient WHERE address = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (address == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, address);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WebClient>() {
      @Override
      public WebClient call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final WebClient _result;
          if(_cursor.moveToFirst()) {
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpBlocked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfBlocked);
            _tmpBlocked = _tmp != 0;
            final long _tmpCreated;
            _tmpCreated = _cursor.getLong(_cursorIndexOfCreated);
            _result = new WebClient(_tmpAddress,_tmpTitle,_tmpBlocked,_tmpCreated);
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
