package org.monora.uprotocol.client.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0016"}, d2 = {"Lorg/monora/uprotocol/client/android/di/RoomModule;", "", "()V", "provideClientAddressDao", "Lorg/monora/uprotocol/client/android/database/ClientAddressDao;", "appDatabase", "Lorg/monora/uprotocol/client/android/database/AppDatabase;", "provideClientDao", "Lorg/monora/uprotocol/client/android/database/ClientDao;", "provideRoomDatabase", "context", "Landroid/content/Context;", "provideSafFolderDao", "Lorg/monora/uprotocol/client/android/database/SafFolderDao;", "provideSharedTextDao", "Lorg/monora/uprotocol/client/android/database/SharedTextDao;", "provideTransferDao", "Lorg/monora/uprotocol/client/android/database/TransferDao;", "provideTransferItemDao", "Lorg/monora/uprotocol/client/android/database/TransferItemDao;", "provideWebTransferDao", "Lorg/monora/uprotocol/client/android/database/WebTransferDao;", "hotspot-ui_debug"})
@dagger.Module()
public final class RoomModule {
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.di.RoomModule INSTANCE = null;
    
    private RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final org.monora.uprotocol.client.android.database.AppDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.ClientDao provideClientDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.ClientAddressDao provideClientAddressDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.SafFolderDao provideSafFolderDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.SharedTextDao provideSharedTextDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.TransferDao provideTransferDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.TransferItemDao provideTransferItemDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.monora.uprotocol.client.android.database.WebTransferDao provideWebTransferDao(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.AppDatabase appDatabase) {
        return null;
    }
}