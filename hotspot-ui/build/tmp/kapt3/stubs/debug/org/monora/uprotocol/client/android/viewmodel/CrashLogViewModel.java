package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/CrashLogViewModel;", "Landroidx/lifecycle/ViewModel;", "extrasRepository", "Lorg/monora/uprotocol/client/android/data/ExtrasRepository;", "(Lorg/monora/uprotocol/client/android/data/ExtrasRepository;)V", "crashLog", "Landroidx/lifecycle/LiveData;", "", "getCrashLog", "()Landroidx/lifecycle/LiveData;", "crashLog$delegate", "Lkotlin/Lazy;", "shouldShowCrashLog", "", "getShouldShowCrashLog", "()Z", "clearCrashLog", "", "hotspot-ui_debug"})
public final class CrashLogViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.ExtrasRepository extrasRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy crashLog$delegate = null;
    
    @javax.inject.Inject()
    public CrashLogViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ExtrasRepository extrasRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCrashLog() {
        return null;
    }
    
    public final boolean getShouldShowCrashLog() {
        return false;
    }
    
    public final void clearCrashLog() {
    }
}