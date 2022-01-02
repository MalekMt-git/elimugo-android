package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ArtistBrowserAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/content/Artist;", "Lorg/monora/uprotocol/client/android/fragment/content/ArtistViewHolder;", "clickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "hotspot-ui_debug"})
public final class ArtistBrowserAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.content.Artist, org.monora.uprotocol.client.android.fragment.content.ArtistViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.content.Artist, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.content.ArtistBrowserAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_ARTIST = 0;
    
    public ArtistBrowserAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.content.Artist, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.content.Artist, kotlin.Unit> getClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.fragment.content.ArtistViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.fragment.content.ArtistViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/ArtistBrowserAdapter$Companion;", "", "()V", "VIEW_TYPE_ARTIST", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}