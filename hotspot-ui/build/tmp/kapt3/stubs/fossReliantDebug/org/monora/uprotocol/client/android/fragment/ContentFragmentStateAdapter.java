package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ContentFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "getContext", "()Landroid/content/Context;", "fragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "fragments", "", "Lorg/monora/uprotocol/client/android/fragment/ContentFragmentStateAdapter$PageItem;", "add", "", "fragment", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItem", "getItemCount", "getItemId", "", "PageItem", "hotspot-ui_fossReliantDebug"})
public final class ContentFragmentStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.util.List<org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem> fragments = null;
    private final androidx.fragment.app.FragmentFactory fragmentFactory = null;
    
    public ContentFragmentStateAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifecycle) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem fragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem getItem(int position) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t\u00a8\u0006$"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/ContentFragmentStateAdapter$PageItem;", "Landroid/os/Parcelable;", "title", "", "clazz", "(Ljava/lang/String;Ljava/lang/String;)V", "getClazz", "()Ljava/lang/String;", "setClazz", "(Ljava/lang/String;)V", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment$annotations", "()V", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "getTitle", "setTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "hotspot-ui_fossReliantDebug"})
    public static final class PageItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String title;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String clazz;
        @org.jetbrains.annotations.Nullable()
        private androidx.fragment.app.Fragment fragment;
        public static final android.os.Parcelable.Creator<org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String clazz) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PageItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String clazz) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClazz() {
            return null;
        }
        
        public final void setClazz(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void getFragment$annotations() {
        }
        
        public final void setFragment(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment p0) {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem[] newArray(int size) {
                return null;
            }
        }
    }
}