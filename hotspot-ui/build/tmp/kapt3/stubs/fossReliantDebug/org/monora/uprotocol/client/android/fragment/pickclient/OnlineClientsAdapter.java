package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/OnlineClientsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "Lorg/monora/uprotocol/client/android/viewholder/ClientGridViewHolder;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentViewModel$ClickType;", "", "(Lkotlin/jvm/functions/Function2;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hotspot-ui_fossReliantDebug"})
public final class OnlineClientsAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.model.ClientRoute, org.monora.uprotocol.client.android.viewholder.ClientGridViewHolder> {
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.model.ClientRoute, org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener = null;
    
    public OnlineClientsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.model.ClientRoute, ? super org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.viewholder.ClientGridViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.viewholder.ClientGridViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
}