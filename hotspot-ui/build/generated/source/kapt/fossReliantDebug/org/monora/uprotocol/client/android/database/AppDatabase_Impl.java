package org.monora.uprotocol.client.android.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ClientDao _clientDao;

  private volatile ClientAddressDao _clientAddressDao;

  private volatile SafFolderDao _safFolderDao;

  private volatile SharedTextDao _sharedTextDao;

  private volatile TransferDao _transferDao;

  private volatile TransferItemDao _transferItemDao;

  private volatile WebClientDao _webClientDao;

  private volatile WebTransferDao _webTransferDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `client` (`uid` TEXT NOT NULL, `nickname` TEXT NOT NULL, `manufacturer` TEXT NOT NULL, `product` TEXT NOT NULL, `type` TEXT NOT NULL, `versionName` TEXT NOT NULL, `versionCode` INTEGER NOT NULL, `protocolVersion` INTEGER NOT NULL, `protocolVersionMin` INTEGER NOT NULL, `revisionOfPicture` INTEGER NOT NULL, `lastUsageTime` INTEGER NOT NULL, `blocked` INTEGER NOT NULL, `local` INTEGER NOT NULL, `trusted` INTEGER NOT NULL, `certificate` TEXT, PRIMARY KEY(`uid`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `clientAddress` (`inetAddress` TEXT NOT NULL, `clientUid` TEXT NOT NULL, `lastUsageTime` INTEGER NOT NULL, PRIMARY KEY(`inetAddress`), FOREIGN KEY(`clientUid`) REFERENCES `client`(`uid`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_clientAddress_clientUid` ON `clientAddress` (`clientUid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transferItem` (`id` INTEGER NOT NULL, `groupId` INTEGER NOT NULL, `name` TEXT NOT NULL, `mimeType` TEXT NOT NULL, `size` INTEGER NOT NULL, `directory` TEXT, `location` TEXT NOT NULL, `direction` TEXT NOT NULL, `state` TEXT NOT NULL, `dateCreated` INTEGER NOT NULL, `dateModified` INTEGER NOT NULL, PRIMARY KEY(`groupId`, `id`), FOREIGN KEY(`groupId`) REFERENCES `transfer`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `safFolder` (`uri` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`uri`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sharedText` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `clientUid` TEXT, `text` TEXT NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, FOREIGN KEY(`clientUid`) REFERENCES `client`(`uid`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transfer` (`id` INTEGER NOT NULL, `clientUid` TEXT NOT NULL, `direction` TEXT NOT NULL, `location` TEXT NOT NULL, `accepted` INTEGER NOT NULL, `dateCreated` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`clientUid`) REFERENCES `client`(`uid`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_transfer_clientUid` ON `transfer` (`clientUid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `webClient` (`address` TEXT NOT NULL, `title` TEXT NOT NULL, `blocked` INTEGER NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY(`address`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `webTransfer` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `mimeType` TEXT NOT NULL, `size` INTEGER NOT NULL, `dateCreated` INTEGER NOT NULL)");
        _db.execSQL("CREATE VIEW `transferDetail` AS SELECT transfer.id, transfer.location, transfer.clientUid, transfer.direction, transfer.dateCreated, transfer.accepted, client.nickname AS clientNickname, COUNT(items.id) AS itemsCount, COUNT(CASE WHEN items.state == 'Done' THEN items.id END) as itemsDoneCount, SUM(items.size) AS size, SUM(CASE WHEN items.state == 'Done' THEN items.size END) as sizeOfDone FROM transfer INNER JOIN client ON client.uid = transfer.clientUid INNER JOIN transferItem items ON items.groupId = transfer.id GROUP BY items.groupId");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eec1362128a629b1f0316c328f65312d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `client`");
        _db.execSQL("DROP TABLE IF EXISTS `clientAddress`");
        _db.execSQL("DROP TABLE IF EXISTS `transferItem`");
        _db.execSQL("DROP TABLE IF EXISTS `safFolder`");
        _db.execSQL("DROP TABLE IF EXISTS `sharedText`");
        _db.execSQL("DROP TABLE IF EXISTS `transfer`");
        _db.execSQL("DROP TABLE IF EXISTS `webClient`");
        _db.execSQL("DROP TABLE IF EXISTS `webTransfer`");
        _db.execSQL("DROP VIEW IF EXISTS `transferDetail`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsClient = new HashMap<String, TableInfo.Column>(15);
        _columnsClient.put("uid", new TableInfo.Column("uid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("nickname", new TableInfo.Column("nickname", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("manufacturer", new TableInfo.Column("manufacturer", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("versionName", new TableInfo.Column("versionName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("versionCode", new TableInfo.Column("versionCode", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("protocolVersion", new TableInfo.Column("protocolVersion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("protocolVersionMin", new TableInfo.Column("protocolVersionMin", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("revisionOfPicture", new TableInfo.Column("revisionOfPicture", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("lastUsageTime", new TableInfo.Column("lastUsageTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("blocked", new TableInfo.Column("blocked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("local", new TableInfo.Column("local", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("trusted", new TableInfo.Column("trusted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("certificate", new TableInfo.Column("certificate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClient = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesClient = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoClient = new TableInfo("client", _columnsClient, _foreignKeysClient, _indicesClient);
        final TableInfo _existingClient = TableInfo.read(_db, "client");
        if (! _infoClient.equals(_existingClient)) {
          return new RoomOpenHelper.ValidationResult(false, "client(org.monora.uprotocol.client.android.database.model.UClient).\n"
                  + " Expected:\n" + _infoClient + "\n"
                  + " Found:\n" + _existingClient);
        }
        final HashMap<String, TableInfo.Column> _columnsClientAddress = new HashMap<String, TableInfo.Column>(3);
        _columnsClientAddress.put("inetAddress", new TableInfo.Column("inetAddress", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClientAddress.put("clientUid", new TableInfo.Column("clientUid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClientAddress.put("lastUsageTime", new TableInfo.Column("lastUsageTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClientAddress = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysClientAddress.add(new TableInfo.ForeignKey("client", "CASCADE", "NO ACTION",Arrays.asList("clientUid"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesClientAddress = new HashSet<TableInfo.Index>(1);
        _indicesClientAddress.add(new TableInfo.Index("index_clientAddress_clientUid", false, Arrays.asList("clientUid")));
        final TableInfo _infoClientAddress = new TableInfo("clientAddress", _columnsClientAddress, _foreignKeysClientAddress, _indicesClientAddress);
        final TableInfo _existingClientAddress = TableInfo.read(_db, "clientAddress");
        if (! _infoClientAddress.equals(_existingClientAddress)) {
          return new RoomOpenHelper.ValidationResult(false, "clientAddress(org.monora.uprotocol.client.android.database.model.UClientAddress).\n"
                  + " Expected:\n" + _infoClientAddress + "\n"
                  + " Found:\n" + _existingClientAddress);
        }
        final HashMap<String, TableInfo.Column> _columnsTransferItem = new HashMap<String, TableInfo.Column>(11);
        _columnsTransferItem.put("id", new TableInfo.Column("id", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("groupId", new TableInfo.Column("groupId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("mimeType", new TableInfo.Column("mimeType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("directory", new TableInfo.Column("directory", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("direction", new TableInfo.Column("direction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransferItem.put("dateModified", new TableInfo.Column("dateModified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransferItem = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTransferItem.add(new TableInfo.ForeignKey("transfer", "CASCADE", "NO ACTION",Arrays.asList("groupId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTransferItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransferItem = new TableInfo("transferItem", _columnsTransferItem, _foreignKeysTransferItem, _indicesTransferItem);
        final TableInfo _existingTransferItem = TableInfo.read(_db, "transferItem");
        if (! _infoTransferItem.equals(_existingTransferItem)) {
          return new RoomOpenHelper.ValidationResult(false, "transferItem(org.monora.uprotocol.client.android.database.model.UTransferItem).\n"
                  + " Expected:\n" + _infoTransferItem + "\n"
                  + " Found:\n" + _existingTransferItem);
        }
        final HashMap<String, TableInfo.Column> _columnsSafFolder = new HashMap<String, TableInfo.Column>(2);
        _columnsSafFolder.put("uri", new TableInfo.Column("uri", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSafFolder.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSafFolder = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSafFolder = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSafFolder = new TableInfo("safFolder", _columnsSafFolder, _foreignKeysSafFolder, _indicesSafFolder);
        final TableInfo _existingSafFolder = TableInfo.read(_db, "safFolder");
        if (! _infoSafFolder.equals(_existingSafFolder)) {
          return new RoomOpenHelper.ValidationResult(false, "safFolder(org.monora.uprotocol.client.android.database.model.SafFolder).\n"
                  + " Expected:\n" + _infoSafFolder + "\n"
                  + " Found:\n" + _existingSafFolder);
        }
        final HashMap<String, TableInfo.Column> _columnsSharedText = new HashMap<String, TableInfo.Column>(5);
        _columnsSharedText.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSharedText.put("clientUid", new TableInfo.Column("clientUid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSharedText.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSharedText.put("created", new TableInfo.Column("created", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSharedText.put("modified", new TableInfo.Column("modified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSharedText = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysSharedText.add(new TableInfo.ForeignKey("client", "CASCADE", "NO ACTION",Arrays.asList("clientUid"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesSharedText = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSharedText = new TableInfo("sharedText", _columnsSharedText, _foreignKeysSharedText, _indicesSharedText);
        final TableInfo _existingSharedText = TableInfo.read(_db, "sharedText");
        if (! _infoSharedText.equals(_existingSharedText)) {
          return new RoomOpenHelper.ValidationResult(false, "sharedText(org.monora.uprotocol.client.android.database.model.SharedText).\n"
                  + " Expected:\n" + _infoSharedText + "\n"
                  + " Found:\n" + _existingSharedText);
        }
        final HashMap<String, TableInfo.Column> _columnsTransfer = new HashMap<String, TableInfo.Column>(6);
        _columnsTransfer.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransfer.put("clientUid", new TableInfo.Column("clientUid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransfer.put("direction", new TableInfo.Column("direction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransfer.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransfer.put("accepted", new TableInfo.Column("accepted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransfer.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransfer = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTransfer.add(new TableInfo.ForeignKey("client", "CASCADE", "NO ACTION",Arrays.asList("clientUid"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesTransfer = new HashSet<TableInfo.Index>(1);
        _indicesTransfer.add(new TableInfo.Index("index_transfer_clientUid", false, Arrays.asList("clientUid")));
        final TableInfo _infoTransfer = new TableInfo("transfer", _columnsTransfer, _foreignKeysTransfer, _indicesTransfer);
        final TableInfo _existingTransfer = TableInfo.read(_db, "transfer");
        if (! _infoTransfer.equals(_existingTransfer)) {
          return new RoomOpenHelper.ValidationResult(false, "transfer(org.monora.uprotocol.client.android.database.model.Transfer).\n"
                  + " Expected:\n" + _infoTransfer + "\n"
                  + " Found:\n" + _existingTransfer);
        }
        final HashMap<String, TableInfo.Column> _columnsWebClient = new HashMap<String, TableInfo.Column>(4);
        _columnsWebClient.put("address", new TableInfo.Column("address", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebClient.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebClient.put("blocked", new TableInfo.Column("blocked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebClient.put("created", new TableInfo.Column("created", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWebClient = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWebClient = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWebClient = new TableInfo("webClient", _columnsWebClient, _foreignKeysWebClient, _indicesWebClient);
        final TableInfo _existingWebClient = TableInfo.read(_db, "webClient");
        if (! _infoWebClient.equals(_existingWebClient)) {
          return new RoomOpenHelper.ValidationResult(false, "webClient(org.monora.uprotocol.client.android.database.model.WebClient).\n"
                  + " Expected:\n" + _infoWebClient + "\n"
                  + " Found:\n" + _existingWebClient);
        }
        final HashMap<String, TableInfo.Column> _columnsWebTransfer = new HashMap<String, TableInfo.Column>(6);
        _columnsWebTransfer.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebTransfer.put("uri", new TableInfo.Column("uri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebTransfer.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebTransfer.put("mimeType", new TableInfo.Column("mimeType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebTransfer.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWebTransfer.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWebTransfer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWebTransfer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWebTransfer = new TableInfo("webTransfer", _columnsWebTransfer, _foreignKeysWebTransfer, _indicesWebTransfer);
        final TableInfo _existingWebTransfer = TableInfo.read(_db, "webTransfer");
        if (! _infoWebTransfer.equals(_existingWebTransfer)) {
          return new RoomOpenHelper.ValidationResult(false, "webTransfer(org.monora.uprotocol.client.android.database.model.WebTransfer).\n"
                  + " Expected:\n" + _infoWebTransfer + "\n"
                  + " Found:\n" + _existingWebTransfer);
        }
        final ViewInfo _infoTransferDetail = new ViewInfo("transferDetail", "CREATE VIEW `transferDetail` AS SELECT transfer.id, transfer.location, transfer.clientUid, transfer.direction, transfer.dateCreated, transfer.accepted, client.nickname AS clientNickname, COUNT(items.id) AS itemsCount, COUNT(CASE WHEN items.state == 'Done' THEN items.id END) as itemsDoneCount, SUM(items.size) AS size, SUM(CASE WHEN items.state == 'Done' THEN items.size END) as sizeOfDone FROM transfer INNER JOIN client ON client.uid = transfer.clientUid INNER JOIN transferItem items ON items.groupId = transfer.id GROUP BY items.groupId");
        final ViewInfo _existingTransferDetail = ViewInfo.read(_db, "transferDetail");
        if (! _infoTransferDetail.equals(_existingTransferDetail)) {
          return new RoomOpenHelper.ValidationResult(false, "transferDetail(org.monora.uprotocol.client.android.database.model.TransferDetail).\n"
                  + " Expected:\n" + _infoTransferDetail + "\n"
                  + " Found:\n" + _existingTransferDetail);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "eec1362128a629b1f0316c328f65312d", "2787718c7fede949c6b562eea6a8319b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(1);
    HashSet<String> _tables = new HashSet<String>(3);
    _tables.add("transfer");
    _tables.add("client");
    _tables.add("transferItem");
    _viewTables.put("transferdetail", _tables);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "client","clientAddress","transferItem","safFolder","sharedText","transfer","webClient","webTransfer");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `client`");
      _db.execSQL("DELETE FROM `clientAddress`");
      _db.execSQL("DELETE FROM `transferItem`");
      _db.execSQL("DELETE FROM `safFolder`");
      _db.execSQL("DELETE FROM `sharedText`");
      _db.execSQL("DELETE FROM `transfer`");
      _db.execSQL("DELETE FROM `webClient`");
      _db.execSQL("DELETE FROM `webTransfer`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ClientDao.class, ClientDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ClientAddressDao.class, ClientAddressDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SafFolderDao.class, SafFolderDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SharedTextDao.class, SharedTextDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TransferDao.class, TransferDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TransferItemDao.class, TransferItemDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WebClientDao.class, WebClientDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WebTransferDao.class, WebTransferDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ClientDao clientDao() {
    if (_clientDao != null) {
      return _clientDao;
    } else {
      synchronized(this) {
        if(_clientDao == null) {
          _clientDao = new ClientDao_Impl(this);
        }
        return _clientDao;
      }
    }
  }

  @Override
  public ClientAddressDao clientAddressDao() {
    if (_clientAddressDao != null) {
      return _clientAddressDao;
    } else {
      synchronized(this) {
        if(_clientAddressDao == null) {
          _clientAddressDao = new ClientAddressDao_Impl(this);
        }
        return _clientAddressDao;
      }
    }
  }

  @Override
  public SafFolderDao safFolderDao() {
    if (_safFolderDao != null) {
      return _safFolderDao;
    } else {
      synchronized(this) {
        if(_safFolderDao == null) {
          _safFolderDao = new SafFolderDao_Impl(this);
        }
        return _safFolderDao;
      }
    }
  }

  @Override
  public SharedTextDao sharedTextDao() {
    if (_sharedTextDao != null) {
      return _sharedTextDao;
    } else {
      synchronized(this) {
        if(_sharedTextDao == null) {
          _sharedTextDao = new SharedTextDao_Impl(this);
        }
        return _sharedTextDao;
      }
    }
  }

  @Override
  public TransferDao transferDao() {
    if (_transferDao != null) {
      return _transferDao;
    } else {
      synchronized(this) {
        if(_transferDao == null) {
          _transferDao = new TransferDao_Impl(this);
        }
        return _transferDao;
      }
    }
  }

  @Override
  public TransferItemDao transferItemDao() {
    if (_transferItemDao != null) {
      return _transferItemDao;
    } else {
      synchronized(this) {
        if(_transferItemDao == null) {
          _transferItemDao = new TransferItemDao_Impl(this);
        }
        return _transferItemDao;
      }
    }
  }

  @Override
  public WebClientDao webClientDao() {
    if (_webClientDao != null) {
      return _webClientDao;
    } else {
      synchronized(this) {
        if(_webClientDao == null) {
          _webClientDao = new WebClientDao_Impl(this);
        }
        return _webClientDao;
      }
    }
  }

  @Override
  public WebTransferDao webTransferDao() {
    if (_webTransferDao != null) {
      return _webTransferDao;
    } else {
      synchronized(this) {
        if(_webTransferDao == null) {
          _webTransferDao = new WebTransferDao_Impl(this);
        }
        return _webTransferDao;
      }
    }
  }
}
