package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/PreparationViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "consumer", "Lkotlinx/coroutines/Job;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "shared", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/fragment/PreparationState;", "getShared", "()Landroidx/lifecycle/MutableLiveData;", "consume", "", "contents", "", "Landroid/net/Uri;", "hotspot-ui_debug"})
public final class PreparationViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job consumer;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.PreparationState> shared = null;
    
    @javax.inject.Inject()
    public PreparationViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.fragment.PreparationState> getShared() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void consume(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.net.Uri> contents) {
    }
}