package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/SongBrowserAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/content/Song;", "Lorg/monora/uprotocol/client/android/fragment/content/SongViewHolder;", "clickListener", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/fragment/content/SongBrowserAdapter$ClickType;", "", "(Lkotlin/jvm/functions/Function2;)V", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickType", "Companion", "hotspot-ui_fossReliantDebug"})
public final class SongBrowserAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.content.Song, org.monora.uprotocol.client.android.fragment.content.SongViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.content.Song, org.monora.uprotocol.client.android.fragment.content.SongBrowserAdapter.ClickType, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.content.SongBrowserAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_SONG = 0;
    
    public SongBrowserAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.content.Song, ? super org.monora.uprotocol.client.android.fragment.content.SongBrowserAdapter.ClickType, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.content.Song, org.monora.uprotocol.client.android.fragment.content.SongBrowserAdapter.ClickType, kotlin.Unit> getClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.fragment.content.SongViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.fragment.content.SongViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/SongBrowserAdapter$ClickType;", "", "(Ljava/lang/String;I)V", "Default", "ToggleSelect", "hotspot-ui_fossReliantDebug"})
    public static enum ClickType {
        /*public static final*/ Default /* = new Default() */,
        /*public static final*/ ToggleSelect /* = new ToggleSelect() */;
        
        ClickType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/SongBrowserAdapter$Companion;", "", "()V", "VIEW_TYPE_SONG", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}