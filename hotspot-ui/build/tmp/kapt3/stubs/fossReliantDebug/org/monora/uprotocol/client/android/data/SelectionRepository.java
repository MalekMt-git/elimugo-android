package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00010\u00010\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016JV\u0010\u0017\u001a\u00020\u000e\"\b\b\u0000\u0010\u0018*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000526\u0010\u0019\u001a2\u0012\u0013\u0012\u0011H\u0018\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000e0\u001aR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \b*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/monora/uprotocol/client/android/data/SelectionRepository;", "", "()V", "_selectionState", "Landroidx/lifecycle/MutableLiveData;", "", "selectionState", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getSelectionState", "()Landroidx/lifecycle/LiveData;", "selections", "", "addAll", "", "list", "clearSelections", "getSelections", "Ljava/util/ArrayList;", "setSelected", "obj", "selected", "", "whenContains", "T", "handler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "hotspot-ui_fossReliantDebug"})
@javax.inject.Singleton()
public final class SelectionRepository {
    private final java.util.List<java.lang.Object> selections = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> _selectionState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> selectionState = null;
    
    @javax.inject.Inject()
    public SelectionRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getSelectionState() {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> list) {
    }
    
    public final void clearSelections() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Object> getSelections() {
        return null;
    }
    
    public final void setSelected(@org.jetbrains.annotations.NotNull()
    java.lang.Object obj, boolean selected) {
    }
    
    public final <T extends java.lang.Object>void whenContains(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit> handler) {
    }
}