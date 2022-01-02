package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u000e0\u000e0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&\u00a8\u00062"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/BarcodeScannerViewModel;", "Landroidx/lifecycle/ViewModel;", "connectionFactory", "Lorg/monora/uprotocol/core/protocol/ConnectionFactory;", "persistenceProvider", "Lorg/monora/uprotocol/core/persistence/PersistenceProvider;", "(Lorg/monora/uprotocol/core/protocol/ConnectionFactory;Lorg/monora/uprotocol/core/persistence/PersistenceProvider;)V", "value", "Lkotlinx/coroutines/Job;", "_job", "set_job", "(Lkotlinx/coroutines/Job;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "clickListener", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "needsAccess", "Landroidx/databinding/ObservableBoolean;", "getNeedsAccess", "()Landroidx/databinding/ObservableBoolean;", "requestPermissionsClickListener", "getRequestPermissionsClickListener", "setRequestPermissionsClickListener", "(Landroid/view/View$OnClickListener;)V", "running", "getRunning", "state", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getState", "()Landroidx/lifecycle/LiveData;", "stateButtonText", "Landroidx/databinding/ObservableField;", "", "getStateButtonText", "()Landroidx/databinding/ObservableField;", "stateImage", "Landroidx/databinding/ObservableInt;", "getStateImage", "()Landroidx/databinding/ObservableInt;", "stateText", "getStateText", "consume", "inetAddress", "Ljava/net/InetAddress;", "pin", "", "hotspot-ui_debug"})
public final class BarcodeScannerViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory = null;
    private final org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider = null;
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.pickclient.State> _state = null;
    private kotlinx.coroutines.Job _job;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener clickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean needsAccess = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener requestPermissionsClickListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean running = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.pickclient.State> state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> stateButtonText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableInt stateImage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> stateText = null;
    
    @javax.inject.Inject()
    public BarcodeScannerViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.protocol.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.core.persistence.PersistenceProvider persistenceProvider) {
        super();
    }
    
    private final void set_job(kotlinx.coroutines.Job value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getNeedsAccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getRequestPermissionsClickListener() {
        return null;
    }
    
    public final void setRequestPermissionsClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getRunning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.fragment.pickclient.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getStateButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableInt getStateImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getStateText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    public final synchronized kotlinx.coroutines.Job consume(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress inetAddress, int pin) {
        return null;
    }
}