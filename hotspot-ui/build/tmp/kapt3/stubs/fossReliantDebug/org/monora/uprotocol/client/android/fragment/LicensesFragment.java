package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

/**
 * created by: veli
 * date: 7/20/18 8:56 PM
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/LicensesFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "licensesViewModel", "Lorg/monora/uprotocol/client/android/viewmodel/LicensesViewModel;", "getLicensesViewModel", "()Lorg/monora/uprotocol/client/android/viewmodel/LicensesViewModel;", "licensesViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "LicensesAdapter", "hotspot-ui_fossReliantDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LicensesFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.Lazy licensesViewModel$delegate = null;
    
    public LicensesFragment() {
        super();
    }
    
    private final org.monora.uprotocol.client.android.viewmodel.LicensesViewModel getLicensesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/LicensesFragment$LicensesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/model/LibraryLicense;", "Lorg/monora/uprotocol/client/android/viewholder/LibraryLicenseViewHolder;", "()V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hotspot-ui_fossReliantDebug"})
    public static final class LicensesAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.model.LibraryLicense, org.monora.uprotocol.client.android.viewholder.LibraryLicenseViewHolder> {
        
        public LicensesAdapter() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.monora.uprotocol.client.android.viewholder.LibraryLicenseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.viewholder.LibraryLicenseViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
    }
}