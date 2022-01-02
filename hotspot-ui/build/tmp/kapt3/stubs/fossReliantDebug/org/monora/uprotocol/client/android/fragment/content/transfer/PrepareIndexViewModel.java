package org.monora.uprotocol.client.android.fragment.content.transfer;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/PrepareIndexViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState;", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "Companion", "hotspot-ui_fossReliantDebug"})
public final class PrepareIndexViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState> state = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.content.transfer.PrepareIndexViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "PrepareIndexViewModel";
    
    @javax.inject.Inject()
    public PrepareIndexViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState> getState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/PrepareIndexViewModel$Companion;", "", "()V", "TAG", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}