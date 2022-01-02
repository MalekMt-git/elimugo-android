package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lorg/monora/uprotocol/client/android/fragment/TransferDetailsFragmentArgs;", "getArgs", "()Lorg/monora/uprotocol/client/android/fragment/TransferDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "factory", "Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;", "getFactory", "()Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;", "setFactory", "(Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel$Factory;)V", "managerViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/TransferManagerViewModel;", "getManagerViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/TransferManagerViewModel;", "managerViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/TransferDetailsViewModel;", "viewModel$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TransferDetailsFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel.Factory factory;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy managerViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.TransferDetailsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_TRANSFER_DETAIL = "org.monora.uprotocol.client.android.action.TRANSFER_DETAIL";
    
    public TransferDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel.Factory p0) {
    }
    
    private final org.monora.uprotocol.client.android.fragment.TransferDetailsFragmentArgs getArgs() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.TransferManagerViewModel getManagerViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.TransferDetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferDetailsFragment$Companion;", "", "()V", "ACTION_TRANSFER_DETAIL", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}