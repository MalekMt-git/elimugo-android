package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/ClientRouteItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/monora/uprotocol/client/android/model/ClientRoute;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "hotspot-ui_fossReliantDebug"})
public final class ClientRouteItemCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.monora.uprotocol.client.android.model.ClientRoute> {
    
    public ClientRouteItemCallback() {
        super();
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ClientRoute oldItem, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ClientRoute newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ClientRoute oldItem, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.model.ClientRoute newItem) {
        return false;
    }
}