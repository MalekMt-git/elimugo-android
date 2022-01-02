package org.monora.uprotocol.client.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/di/TransportSessionModule;", "", "()V", "provideTransportSession", "Lorg/monora/uprotocol/core/TransportSession;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "transportSeat", "Lorg/monora/uprotocol/core/TransportSeat;", "hotspot-ui_fossReliantDebug"})
@dagger.Module()
public final class TransportSessionModule {
    
    public TransportSessionModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final org.monora.uprotocol.core.TransportSession provideTransportSession(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.TransportSeat transportSeat) {
        return null;
    }
}