package org.monora.uprotocol.client.android.viewmodel.content;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@dagger.hilt.EntryPoint()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentComponent;", "", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "clientRepository", "Lorg/monora/uprotocol/client/android/data/ClientRepository;", "hotspot-ui_debug"})
public abstract interface ClientContentComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.backend.Backend backend();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.data.ClientRepository clientRepository();
}