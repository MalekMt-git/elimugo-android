package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B#\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "webDataRepository", "Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/WebDataRepository;Lorg/monora/uprotocol/client/android/database/model/WebTransfer;)V", "detail", "Landroidx/lifecycle/LiveData;", "getDetail", "()Landroidx/lifecycle/LiveData;", "file", "Lcom/genonbeta/android/framework/io/DocumentFile;", "getFile", "remove", "", "Factory", "ModelFactory", "hotspot-ui_debug"})
public final class WebTransferDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository = null;
    private final org.monora.uprotocol.client.android.database.model.WebTransfer transfer = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.WebTransfer> detail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.genonbeta.android.framework.io.DocumentFile> file = null;
    
    @dagger.assisted.AssistedInject()
    public WebTransferDetailsViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    org.monora.uprotocol.client.android.database.model.WebTransfer transfer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.database.model.WebTransfer> getDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.genonbeta.android.framework.io.DocumentFile> getFile() {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.WebTransfer transfer) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel$Factory;", "", "create", "Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "hotspot-ui_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.monora.uprotocol.client.android.fragment.WebTransferDetailsViewModel create(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.WebTransfer transfer);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel$ModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel$Factory;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "(Lorg/monora/uprotocol/client/android/fragment/WebTransferDetailsViewModel$Factory;Lorg/monora/uprotocol/client/android/database/model/WebTransfer;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotspot-ui_debug"})
    public static final class ModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.monora.uprotocol.client.android.fragment.WebTransferDetailsViewModel.Factory factory = null;
        private final org.monora.uprotocol.client.android.database.model.WebTransfer transfer = null;
        
        public ModelFactory(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.fragment.WebTransferDetailsViewModel.Factory factory, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.WebTransfer transfer) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}