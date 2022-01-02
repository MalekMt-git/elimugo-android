package org.monora.uprotocol.client.android.service.web.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@dagger.hilt.EntryPoint()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/di/WebEntryPoint;", "", "fileRepository", "Lorg/monora/uprotocol/client/android/data/FileRepository;", "services", "Lorg/monora/uprotocol/client/android/backend/Services;", "webDataRepository", "Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "hotspot-ui_debug"})
public abstract interface WebEntryPoint {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.data.FileRepository fileRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.backend.Services services();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository();
}