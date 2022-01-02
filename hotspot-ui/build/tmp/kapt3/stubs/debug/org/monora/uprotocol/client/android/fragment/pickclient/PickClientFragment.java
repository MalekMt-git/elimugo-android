package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/PickClientFragment;", "Landroidx/fragment/app/Fragment;", "()V", "clientsViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientsViewModel;", "getClientsViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientsViewModel;", "clientsViewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Adapter", "ClientViewHolder", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PickClientFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy clientsViewModel$delegate = null;
    
    public PickClientFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientsViewModel getClientsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/PickClientFragment$ClientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/monora/uprotocol/client/android/databinding/ListPickClientBinding;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentViewModel$ClickType;", "", "(Lorg/monora/uprotocol/client/android/databinding/ListPickClientBinding;Lkotlin/jvm/functions/Function2;)V", "getBinding", "()Lorg/monora/uprotocol/client/android/databinding/ListPickClientBinding;", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "bind", "client", "hotspot-ui_debug"})
    public static final class ClientViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.databinding.ListPickClientBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.UClient, org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener = null;
        
        public ClientViewHolder(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.databinding.ListPickClientBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.UClient, ? super org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.databinding.ListPickClientBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.UClient, org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.UClient client) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/PickClientFragment$Adapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/PickClientFragment$ClientViewHolder;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentViewModel$ClickType;", "", "(Lkotlin/jvm/functions/Function2;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hotspot-ui_debug"})
    public static final class Adapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.database.model.UClient, org.monora.uprotocol.client.android.fragment.pickclient.PickClientFragment.ClientViewHolder> {
        private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.UClient, org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener = null;
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.database.model.UClient, ? super org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel.ClickType, kotlin.Unit> clickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.monora.uprotocol.client.android.fragment.pickclient.PickClientFragment.ClientViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.fragment.pickclient.PickClientFragment.ClientViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
    }
}