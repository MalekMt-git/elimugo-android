package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u00150\u000fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0014J\u0016\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \b*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "selectionRepository", "Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/SelectionRepository;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "externalState", "Landroidx/lifecycle/MutableLiveData;", "", "getExternalState", "()Landroidx/lifecycle/MutableLiveData;", "selectionState", "Landroidx/lifecycle/LiveData;", "", "", "getSelectionState", "()Landroidx/lifecycle/LiveData;", "getEditorList", "", "getItemOrder", "", "any", "onCleared", "setSelected", "obj", "selected", "", "hotspot-ui_debug"})
public final class SharingSelectionViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> externalState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> selectionState = null;
    
    @javax.inject.Inject()
    public SharingSelectionViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SelectionRepository selectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getExternalState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getSelectionState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getEditorList() {
        return null;
    }
    
    private final int getItemOrder(java.lang.Object any) {
        return 0;
    }
    
    public final void setSelected(@org.jetbrains.annotations.NotNull()
    java.lang.Object obj, boolean selected) {
    }
}