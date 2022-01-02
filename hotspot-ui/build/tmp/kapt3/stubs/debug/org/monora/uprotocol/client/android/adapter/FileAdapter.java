package org.monora.uprotocol.client.android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/monora/uprotocol/client/android/adapter/FileAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/model/FileModel;", "Lorg/monora/uprotocol/client/android/adapter/FileAdapter$ClickType;", "", "(Lkotlin/jvm/functions/Function2;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickType", "Companion", "hotspot-ui_debug"})
public final class FileAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.model.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.model.FileModel, org.monora.uprotocol.client.android.adapter.FileAdapter.ClickType, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.adapter.FileAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_SECTION = 0;
    public static final int VIEW_TYPE_FILE = 1;
    
    public FileAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.model.FileModel, ? super org.monora.uprotocol.client.android.adapter.FileAdapter.ClickType, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/adapter/FileAdapter$ClickType;", "", "(Ljava/lang/String;I)V", "Default", "ToggleSelect", "hotspot-ui_debug"})
    public static enum ClickType {
        /*public static final*/ Default /* = new Default() */,
        /*public static final*/ ToggleSelect /* = new ToggleSelect() */;
        
        ClickType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/adapter/FileAdapter$Companion;", "", "()V", "VIEW_TYPE_FILE", "", "VIEW_TYPE_SECTION", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}