package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B=\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "Lorg/monora/uprotocol/client/android/fragment/ItemViewHolder;", "clickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "Lorg/monora/uprotocol/client/android/fragment/ItemAdapter$ClickType;", "clickType", "", "(Lkotlin/jvm/functions/Function2;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickType", "Companion", "hotspot-ui_fossReliantDebug"})
public final class ItemAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.database.model.UTransferItem, org.monora.uprotocol.client.android.fragment.ItemViewHolder> {
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.UTransferItem, org.monora.uprotocol.client.android.fragment.ItemAdapter.ClickType, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.ItemAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_TRANSFER_ITEM = 0;
    
    public ItemAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.UTransferItem, ? super org.monora.uprotocol.client.android.fragment.ItemAdapter.ClickType, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.fragment.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.fragment.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemAdapter$ClickType;", "", "(Ljava/lang/String;I)V", "Default", "Recover", "hotspot-ui_fossReliantDebug"})
    public static enum ClickType {
        /*public static final*/ Default /* = new Default() */,
        /*public static final*/ Recover /* = new Recover() */;
        
        ClickType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ItemAdapter$Companion;", "", "()V", "VIEW_TYPE_TRANSFER_ITEM", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}