package org.monora.uprotocol.client.android.fragment.content.transfer;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u000f*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/WebShareViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "webDataRepository", "Lorg/monora/uprotocol/client/android/data/WebDataRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/SelectionRepository;Lorg/monora/uprotocol/client/android/data/WebDataRepository;)V", "_changes", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/NamedInterface;", "changes", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getChanges", "()Landroidx/lifecycle/LiveData;", "Ljava/lang/ref/WeakReference;", "filter", "Landroid/content/IntentFilter;", "list", "Ljava/util/ArrayList;", "", "receiver", "Landroid/content/BroadcastReceiver;", "sharedCount", "", "getSharedCount", "()I", "onCleared", "", "reloadInterfaces", "hotspot-ui_debug"})
public final class WebShareViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    private final android.content.IntentFilter filter = null;
    private final java.util.ArrayList<java.lang.Object> list = null;
    private final android.content.BroadcastReceiver receiver = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.monora.uprotocol.client.android.fragment.content.transfer.NamedInterface>> _changes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.fragment.content.transfer.NamedInterface>> changes = null;
    private final int sharedCount = 0;
    
    @javax.inject.Inject()
    public WebShareViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.WebDataRepository webDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.fragment.content.transfer.NamedInterface>> getChanges() {
        return null;
    }
    
    public final int getSharedCount() {
        return 0;
    }
    
    private final void reloadInterfaces() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}