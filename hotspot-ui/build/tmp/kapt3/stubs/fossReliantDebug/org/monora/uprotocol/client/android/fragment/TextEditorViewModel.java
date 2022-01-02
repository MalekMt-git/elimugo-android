package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TextEditorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState;", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "consume", "", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "text", "", "hotspot-ui_fossReliantDebug"})
public final class TextEditorViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.SendTextState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.SendTextState> state = null;
    
    @javax.inject.Inject()
    public TextEditorViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.SendTextState> getState() {
        return null;
    }
    
    public final void consume(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}