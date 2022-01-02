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
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.monora.uprotocol.client.android.database.model.UClientAddress;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ClientAddressDao_Impl implements ClientAddressDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UClientAddress> __insertionAdapterOfUClientAddress;

  private final IOTypeConverter __iOTypeConverter = new IOTypeConverter();

  public ClientAddressDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUClientAddress = new EntityInsertionAdapter<UClientAddress>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `clientAddress` (`inetAddress`,`clientUid`,`lastUsageTime`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UClientAddress value) {
        final String _tmp;
        _tmp = __iOTypeConverter.fromInetAddress(value.getInetAddress());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getClientUid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientUid());
        }
        stmt.bindLong(3, value.getLastUsageTime());
      }
    };
  }

  @Override
  public Object insert(final UClientAddress address,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUClientAddress.insert(address);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAll(final String clientUid,
      final Continuation<? super List<UClientAddress>> continuation) {
    final String _sql = "SELECT * FROM clientAddress WHERE clientUid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (clientUid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, clientUid);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UClientAddress>>() {
      @Override
      public List<UClientAddress> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInetAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "inetAddress");
          final int _cursorIndexOfClientUid = CursorUtil.getColumnIndexOrThrow(_cursor, "clientUid");
          final int _cursorIndexOfLastUsageTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsageTime");
          final List<UClientAddress> _result = new ArrayList<UClientAddress>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UClientAddress _item;
            final InetAddress _tmpInetAddress;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfInetAddress)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfInetAddress);
            }
            _tmpInetAddress = __iOTypeConverter.toInetAddress(_tmp);
            final String _tmpClientUid;
            if (_cursor.isNull(_cursorIndexOfClientUid)) {
              _tmpClientUid = null;
            } else {
              _tmpClientUid = _cursor.getString(_cursorIndexOfClientUid);
            }
            final long _tmpLastUsageTime;
            _tmpLastUsageTime = _cursor.getLong(_cursorIndexOfLastUsageTime);
            _item = new UClientAddress(_tmpInetAddress,_tmpClientUid,_tmpLastUsageTime);
            _result.add(_item);
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
