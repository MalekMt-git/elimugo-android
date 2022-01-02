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
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.monora.uprotocol.client.android.database.model.UClient;
import org.monora.uprotocol.core.protocol.ClientType;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ClientDao_Impl implements ClientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UClient> __insertionAdapterOfUClient;

  private final ClientTypeConverter __clientTypeConverter = new ClientTypeConverter();

  private final EntityDeletionOrUpdateAdapter<UClient> __deletionAdapterOfUClient;

  private final EntityDeletionOrUpdateAdapter<UClient> __updateAdapterOfUClient;

  public ClientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUClient = new EntityInsertionAdapter<UClient>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `client` (`uid`,`nickname`,`manufacturer`,`product`,`type`,`versionName`,`versionCode`,`protocolVersion`,`protocolVersionMin`,`revisionOfPicture`,`lastUsageTime`,`blocked`,`local`,`trusted`,`certificate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UClient value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getNickname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNickname());
        }
        if (value.getManufacturer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getManufacturer());
        }
        if (value.getProduct() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProduct());
        }
        final String _tmp;
        _tmp = __clientTypeConverter.fromType(value.getType());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getVersionName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getVersionName());
        }
        stmt.bindLong(7, value.getVersionCode());
        stmt.bindLong(8, value.getProtocolVersion());
        stmt.bindLong(9, value.getProtocolVersionMin());
        stmt.bindLong(10, value.getRevisionOfPicture());
        stmt.bindLong(11, value.getLastUsageTime());
        final int _tmp_1;
        _tmp_1 = value.getBlocked() ? 1 : 0;
        stmt.bindLong(12, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getLocal() ? 1 : 0;
        stmt.bindLong(13, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getTrusted() ? 1 : 0;
        stmt.bindLong(14, _tmp_3);
        final String _tmp_4;
        _tmp_4 = __clientTypeConverter.fromCertificate(value.getCertificate());
        if (_tmp_4 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, _tmp_4);
        }
      }
    };
    this.__deletionAdapterOfUClient = new EntityDeletionOrUpdateAdapter<UClient>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `client` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UClient value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
      }
    };
    this.__updateAdapterOfUClient = new EntityDeletionOrUpdateAdapter<UClient>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `client` SET `uid` = ?,`nickname` = ?,`manufacturer` = ?,`product` = ?,`type` = ?,`versionName` = ?,`versionCode` = ?,`protocolVersion` = ?,`protocolVersionMin` = ?,`revisionOfPicture` = ?,`lastUsageTime` = ?,`blocked` = ?,`local` = ?,`trusted` = ?,`certificate` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UClient value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getNickname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNickname());
        }
        if (value.getManufacturer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getManufacturer());
        }
        if (value.getProduct() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProduct());
        }
        final String _tmp;
        _tmp = __clientTypeConverter.fromType(value.getType());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getVersionName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getVersionName());
        }
        stmt.bindLong(7, value.getVersionCode());
        stmt.bindLong(8, value.getProtocolVersion());
        stmt.bindLong(9, value.getProtocolVersionMin());
        stmt.bindLong(10, value.getRevisionOfPicture());
        stmt.bindLong(11, value.getLastUsageTime());
        final int _tmp_1;
        _tmp_1 = value.getBlocked() ? 1 : 0;
        stmt.bindLong(12, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getLocal() ? 1 : 0;
        stmt.bindLong(13, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getTrusted() ? 1 : 0;
        stmt.bindLong(14, _tmp_3);
        final String _tmp_4;
        _tmp_4 = __clientTypeConverter.fromCertificate(value.getCertificate());
        if (_tmp_4 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, _tmp_4);
        }
        if (value.getUid() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getUid());
        }
      }
    };
  }

  @Override
  public Object insert(final UClient client, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUClient.insert(client);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final UClient client, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUClient.handle(client);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final UClient client, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUClient.handle(client);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getSingle(final String uid, final Continuation<? super UClient> continuation) {
    final String _sql = "SELECT * FROM client WHERE uid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UClient>() {
      @Override
      public UClient call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
          final int _cursorIndexOfManufacturer = CursorUtil.getColumnIndexOrThrow(_cursor, "manufacturer");
          final int _cursorIndexOfProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "product");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfVersionName = CursorUtil.getColumnIndexOrThrow(_cursor, "versionName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfProtocolVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersion");
          final int _cursorIndexOfProtocolVersionMin = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersionMin");
          final int _cursorIndexOfRevisionOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "revisionOfPicture");
          final int _cursorIndexOfLastUsageTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsageTime");
          final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
          final int _cursorIndexOfLocal = CursorUtil.getColumnIndexOrThrow(_cursor, "local");
          final int _cursorIndexOfTrusted = CursorUtil.getColumnIndexOrThrow(_cursor, "trusted");
          final int _cursorIndexOfCertificate = CursorUtil.getColumnIndexOrThrow(_cursor, "certificate");
          final UClient _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            final String _tmpNickname;
            if (_cursor.isNull(_cursorIndexOfNickname)) {
              _tmpNickname = null;
            } else {
              _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
            }
            final String _tmpManufacturer;
            if (_cursor.isNull(_cursorIndexOfManufacturer)) {
              _tmpManufacturer = null;
            } else {
              _tmpManufacturer = _cursor.getString(_cursorIndexOfManufacturer);
            }
            final String _tmpProduct;
            if (_cursor.isNull(_cursorIndexOfProduct)) {
              _tmpProduct = null;
            } else {
              _tmpProduct = _cursor.getString(_cursorIndexOfProduct);
            }
            final ClientType _tmpType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __clientTypeConverter.toType(_tmp);
            final String _tmpVersionName;
            if (_cursor.isNull(_cursorIndexOfVersionName)) {
              _tmpVersionName = null;
            } else {
              _tmpVersionName = _cursor.getString(_cursorIndexOfVersionName);
            }
            final int _tmpVersionCode;
            _tmpVersionCode = _cursor.getInt(_cursorIndexOfVersionCode);
            final int _tmpProtocolVersion;
            _tmpProtocolVersion = _cursor.getInt(_cursorIndexOfProtocolVersion);
            final int _tmpProtocolVersionMin;
            _tmpProtocolVersionMin = _cursor.getInt(_cursorIndexOfProtocolVersionMin);
            final long _tmpRevisionOfPicture;
            _tmpRevisionOfPicture = _cursor.getLong(_cursorIndexOfRevisionOfPicture);
            final long _tmpLastUsageTime;
            _tmpLastUsageTime = _cursor.getLong(_cursorIndexOfLastUsageTime);
            final boolean _tmpBlocked;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfBlocked);
            _tmpBlocked = _tmp_1 != 0;
            final boolean _tmpLocal;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfLocal);
            _tmpLocal = _tmp_2 != 0;
            final boolean _tmpTrusted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfTrusted);
            _tmpTrusted = _tmp_3 != 0;
            final X509Certificate _tmpCertificate;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfCertificate)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfCertificate);
            }
            _tmpCertificate = __clientTypeConverter.toCertificate(_tmp_4);
            _result = new UClient(_tmpUid,_tmpNickname,_tmpManufacturer,_tmpProduct,_tmpType,_tmpVersionName,_tmpVersionCode,_tmpProtocolVersion,_tmpProtocolVersionMin,_tmpRevisionOfPicture,_tmpLastUsageTime,_tmpBlocked,_tmpLocal,_tmpTrusted,_tmpCertificate);
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
  public LiveData<UClient> get(final String uid) {
    final String _sql = "SELECT * FROM client WHERE uid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"client"}, false, new Callable<UClient>() {
      @Override
      public UClient call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
          final int _cursorIndexOfManufacturer = CursorUtil.getColumnIndexOrThrow(_cursor, "manufacturer");
          final int _cursorIndexOfProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "product");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfVersionName = CursorUtil.getColumnIndexOrThrow(_cursor, "versionName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfProtocolVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersion");
          final int _cursorIndexOfProtocolVersionMin = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersionMin");
          final int _cursorIndexOfRevisionOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "revisionOfPicture");
          final int _cursorIndexOfLastUsageTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsageTime");
          final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
          final int _cursorIndexOfLocal = CursorUtil.getColumnIndexOrThrow(_cursor, "local");
          final int _cursorIndexOfTrusted = CursorUtil.getColumnIndexOrThrow(_cursor, "trusted");
          final int _cursorIndexOfCertificate = CursorUtil.getColumnIndexOrThrow(_cursor, "certificate");
          final UClient _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            final String _tmpNickname;
            if (_cursor.isNull(_cursorIndexOfNickname)) {
              _tmpNickname = null;
            } else {
              _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
            }
            final String _tmpManufacturer;
            if (_cursor.isNull(_cursorIndexOfManufacturer)) {
              _tmpManufacturer = null;
            } else {
              _tmpManufacturer = _cursor.getString(_cursorIndexOfManufacturer);
            }
            final String _tmpProduct;
            if (_cursor.isNull(_cursorIndexOfProduct)) {
              _tmpProduct = null;
            } else {
              _tmpProduct = _cursor.getString(_cursorIndexOfProduct);
            }
            final ClientType _tmpType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __clientTypeConverter.toType(_tmp);
            final String _tmpVersionName;
            if (_cursor.isNull(_cursorIndexOfVersionName)) {
              _tmpVersionName = null;
            } else {
              _tmpVersionName = _cursor.getString(_cursorIndexOfVersionName);
            }
            final int _tmpVersionCode;
            _tmpVersionCode = _cursor.getInt(_cursorIndexOfVersionCode);
            final int _tmpProtocolVersion;
            _tmpProtocolVersion = _cursor.getInt(_cursorIndexOfProtocolVersion);
            final int _tmpProtocolVersionMin;
            _tmpProtocolVersionMin = _cursor.getInt(_cursorIndexOfProtocolVersionMin);
            final long _tmpRevisionOfPicture;
            _tmpRevisionOfPicture = _cursor.getLong(_cursorIndexOfRevisionOfPicture);
            final long _tmpLastUsageTime;
            _tmpLastUsageTime = _cursor.getLong(_cursorIndexOfLastUsageTime);
            final boolean _tmpBlocked;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfBlocked);
            _tmpBlocked = _tmp_1 != 0;
            final boolean _tmpLocal;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfLocal);
            _tmpLocal = _tmp_2 != 0;
            final boolean _tmpTrusted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfTrusted);
            _tmpTrusted = _tmp_3 != 0;
            final X509Certificate _tmpCertificate;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfCertificate)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfCertificate);
            }
            _tmpCertificate = __clientTypeConverter.toCertificate(_tmp_4);
            _result = new UClient(_tmpUid,_tmpNickname,_tmpManufacturer,_tmpProduct,_tmpType,_tmpVersionName,_tmpVersionCode,_tmpProtocolVersion,_tmpProtocolVersionMin,_tmpRevisionOfPicture,_tmpLastUsageTime,_tmpBlocked,_tmpLocal,_tmpTrusted,_tmpCertificate);
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
  public LiveData<List<UClient>> getAll() {
    final String _sql = "SELECT * FROM client ORDER BY lastUsageTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"client"}, false, new Callable<List<UClient>>() {
      @Override
      public List<UClient> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
          final int _cursorIndexOfManufacturer = CursorUtil.getColumnIndexOrThrow(_cursor, "manufacturer");
          final int _cursorIndexOfProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "product");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfVersionName = CursorUtil.getColumnIndexOrThrow(_cursor, "versionName");
          final int _cursorIndexOfVersionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "versionCode");
          final int _cursorIndexOfProtocolVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersion");
          final int _cursorIndexOfProtocolVersionMin = CursorUtil.getColumnIndexOrThrow(_cursor, "protocolVersionMin");
          final int _cursorIndexOfRevisionOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "revisionOfPicture");
          final int _cursorIndexOfLastUsageTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsageTime");
          final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
          final int _cursorIndexOfLocal = CursorUtil.getColumnIndexOrThrow(_cursor, "local");
          final int _cursorIndexOfTrusted = CursorUtil.getColumnIndexOrThrow(_cursor, "trusted");
          final int _cursorIndexOfCertificate = CursorUtil.getColumnIndexOrThrow(_cursor, "certificate");
          final List<UClient> _result = new ArrayList<UClient>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UClient _item;
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            final String _tmpNickname;
            if (_cursor.isNull(_cursorIndexOfNickname)) {
              _tmpNickname = null;
            } else {
              _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
            }
            final String _tmpManufacturer;
            if (_cursor.isNull(_cursorIndexOfManufacturer)) {
              _tmpManufacturer = null;
            } else {
              _tmpManufacturer = _cursor.getString(_cursorIndexOfManufacturer);
            }
            final String _tmpProduct;
            if (_cursor.isNull(_cursorIndexOfProduct)) {
              _tmpProduct = null;
            } else {
              _tmpProduct = _cursor.getString(_cursorIndexOfProduct);
            }
            final ClientType _tmpType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __clientTypeConverter.toType(_tmp);
            final String _tmpVersionName;
            if (_cursor.isNull(_cursorIndexOfVersionName)) {
              _tmpVersionName = null;
            } else {
              _tmpVersionName = _cursor.getString(_cursorIndexOfVersionName);
            }
            final int _tmpVersionCode;
            _tmpVersionCode = _cursor.getInt(_cursorIndexOfVersionCode);
            final int _tmpProtocolVersion;
            _tmpProtocolVersion = _cursor.getInt(_cursorIndexOfProtocolVersion);
            final int _tmpProtocolVersionMin;
            _tmpProtocolVersionMin = _cursor.getInt(_cursorIndexOfProtocolVersionMin);
            final long _tmpRevisionOfPicture;
            _tmpRevisionOfPicture = _cursor.getLong(_cursorIndexOfRevisionOfPicture);
            final long _tmpLastUsageTime;
            _tmpLastUsageTime = _cursor.getLong(_cursorIndexOfLastUsageTime);
            final boolean _tmpBlocked;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfBlocked);
            _tmpBlocked = _tmp_1 != 0;
            final boolean _tmpLocal;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfLocal);
            _tmpLocal = _tmp_2 != 0;
            final boolean _tmpTrusted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfTrusted);
            _tmpTrusted = _tmp_3 != 0;
            final X509Certificate _tmpCertificate;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfCertificate)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfCertificate);
            }
            _tmpCertificate = __clientTypeConverter.toCertificate(_tmp_4);
            _item = new UClient(_tmpUid,_tmpNickname,_tmpManufacturer,_tmpProduct,_tmpType,_tmpVersionName,_tmpVersionCode,_tmpProtocolVersion,_tmpProtocolVersionMin,_tmpRevisionOfPicture,_tmpLastUsageTime,_tmpBlocked,_tmpLocal,_tmpTrusted,_tmpCertificate);
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
