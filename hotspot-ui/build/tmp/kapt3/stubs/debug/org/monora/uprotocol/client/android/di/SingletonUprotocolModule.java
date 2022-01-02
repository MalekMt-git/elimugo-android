package org.monora.uprotocol.client.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lorg/monora/uprotocol/client/android/di/SingletonUprotocolModule;", "", "()V", "provideConnectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "mainConnectionFactory", "Lorg/monora/uprotocol/client/android/protocol/MainConnectionFactory;", "providePersistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "mainPersistenceProvider", "Lorg/monora/uprotocol/client/android/protocol/MainPersistenceProvider;", "provideTransportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "mainTransportSeat", "Lorg/monora/uprotocol/client/android/protocol/MainTransportSeat;", "hotspot-ui_debug"})
@dagger.Module()
public abstract class SingletonUprotocolModule {
    
    public SingletonUprotocolModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract org.monora.uprotocol.core.protocol.ConnectionFactory provideConnectionFactory(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.protocol.MainConnectionFactory mainConnectionFactory);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract org.monora.uprotocol.core.persistence.PersistenceProvider providePersistenceProvider(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.protocol.MainPersistenceProvider mainPersistenceProvider);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract org.monora.uprotocol.core.TransportSeat provideTransportSeat(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.protocol.MainTransportSeat mainTransportSeat);
}