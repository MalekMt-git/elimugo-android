package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ManageClientsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/ClientsViewModel;", "getViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/ClientsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Adapter", "ClientViewHolder", "hotspot-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ManageClientsFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ManageClientsFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.ClientsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ManageClientsFragment$ClientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/monora/uprotocol/client/android/databinding/ListManageClientBinding;", "clickListener", "Lkotlin/Function1;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "", "(Lorg/monora/uprotocol/client/android/databinding/ListManageClientBinding;Lkotlin/jvm/functions/Function1;)V", "getBinding", "()Lorg/monora/uprotocol/client/android/databinding/ListManageClientBinding;", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "bind", "client", "hotspot-ui_debug"})
    public static final class ClientViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.databinding.ListManageClientBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.UClient, kotlin.Unit> clickListener = null;
        
        public ClientViewHolder(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.databinding.ListManageClientBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.database.model.UClient, kotlin.Unit> clickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.databinding.ListManageClientBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.UClient, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.UClient client) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ManageClientsFragment$Adapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "Lorg/monora/uprotocol/client/android/fragment/ManageClientsFragment$ClientViewHolder;", "clickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hotspot-ui_debug"})
    public static final class Adapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.database.model.UClient, org.monora.uprotocol.client.android.fragment.ManageClientsFragment.ClientViewHolder> {
        private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.UClient, kotlin.Unit> clickListener = null;
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.database.model.UClient, kotlin.Unit> clickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.monora.uprotocol.client.android.fragment.ManageClientsFragment.ClientViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.fragment.ManageClientsFragment.ClientViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
    }
}