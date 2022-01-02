package org.monora.uprotocol.client.android.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bBP\u0012\'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "gibSubscriberListener", "Lkotlin/Function1;", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "Lkotlin/ParameterName;", "name", "detail", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;", "", "binding", "Lorg/monora/uprotocol/client/android/databinding/ListTransferBinding;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lorg/monora/uprotocol/client/android/databinding/ListTransferBinding;)V", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "bind", "transferDetail", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onAppear", "onDestroy", "onDisappear", "ClickType", "hotspot-ui_debug"})
public final class TransferDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements androidx.lifecycle.LifecycleOwner {
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.TransferDetail, androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel>> gibSubscriberListener = null;
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.TransferDetail, org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType, kotlin.Unit> clickListener = null;
    private final org.monora.uprotocol.client.android.databinding.ListTransferBinding binding = null;
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry = null;
    
    public TransferDetailViewHolder(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.database.model.TransferDetail, ? extends androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel>> gibSubscriberListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.TransferDetail, ? super org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.databinding.ListTransferBinding binding) {
        super(null);
    }
    
    public final void onAppear() {
    }
    
    public final void onDisappear() {
    }
    
    public final void onDestroy() {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.TransferDetail transferDetail) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;", "", "(Ljava/lang/String;I)V", "Default", "ToggleTask", "Reject", "hotspot-ui_debug"})
    public static enum ClickType {
        /*public static final*/ Default /* = new Default() */,
        /*public static final*/ ToggleTask /* = new ToggleTask() */,
        /*public static final*/ Reject /* = new Reject() */;
        
        ClickType() {
        }
    }
}