package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u001eH\u0002J\u0012\u00109\u001a\u0002062\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000206H\u0016J\b\u0010=\u001a\u000206H\u0016J\u001a\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020@2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010A\u001a\u000206H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u001e0\u001e0\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b(\u0010)R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b2\u00103\u00a8\u0006C"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/BarcodeScannerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lorg/monora/uprotocol/client/android/databinding/LayoutBarcodeScannerBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lorg/monora/uprotocol/client/android/databinding/LayoutBarcodeScannerBinding;", "binding$delegate", "Lkotlin/Lazy;", "clientPickerViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "getClientPickerViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientPickerViewModel;", "clientPickerViewModel$delegate", "connections", "Lorg/monora/uprotocol/client/android/util/Connections;", "getConnections", "()Lorg/monora/uprotocol/client/android/util/Connections;", "connections$delegate", "intentFilter", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter$delegate", "receiver", "Landroid/content/BroadcastReceiver;", "requestPermissions", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "requestPermissionsClickListener", "Landroid/view/View$OnClickListener;", "scanner", "Lorg/monora/android/codescanner/CodeScanner;", "getScanner", "()Lorg/monora/android/codescanner/CodeScanner;", "scanner$delegate", "sharedTextsViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/SharedTextsViewModel;", "getSharedTextsViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/SharedTextsViewModel;", "sharedTextsViewModel$delegate", "snackbarPlacementProvider", "Lcom/genonbeta/android/framework/ui/callback/SnackbarPlacementProvider;", "state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/Change;", "viewModel", "Lorg/monora/uprotocol/client/android/fragment/pickclient/BarcodeScannerViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/fragment/pickclient/BarcodeScannerViewModel;", "viewModel$delegate", "emitState", "", "handleBarcode", "code", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "resumeIfPossible", "Companion", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BarcodeScannerFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy clientPickerViewModel$delegate = null;
    private final kotlin.Lazy sharedTextsViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissions = null;
    private final kotlin.Lazy connections$delegate = null;
    private final kotlin.Lazy intentFilter$delegate = null;
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy scanner$delegate = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.pickclient.Change> state = null;
    private final android.content.BroadcastReceiver receiver = null;
    private final android.view.View.OnClickListener requestPermissionsClickListener = null;
    private final com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider snackbarPlacementProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerFragment.Companion Companion = null;
    private static final java.lang.String TAG = "BarcodeScannerFragment";
    
    public BarcodeScannerFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel getClientPickerViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.SharedTextsViewModel getSharedTextsViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerViewModel getViewModel() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.util.Connections getConnections() {
        return null;
    }
    
    private final android.content.IntentFilter getIntentFilter() {
        return null;
    }
    
    private final org.monora.uprotocol.client.android.databinding.LayoutBarcodeScannerBinding getBinding() {
        return null;
    }
    
    private final org.monora.android.codescanner.CodeScanner getScanner() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void emitState() {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void handleBarcode(java.lang.String code) {
    }
    
    private final void resumeIfPossible() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/BarcodeScannerFragment$Companion;", "", "()V", "TAG", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}