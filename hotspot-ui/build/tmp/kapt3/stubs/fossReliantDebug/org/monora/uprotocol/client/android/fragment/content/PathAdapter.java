package org.monora.uprotocol.client.android.fragment.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/PathAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/model/FileModel;", "Lorg/monora/uprotocol/client/android/fragment/content/FilePathViewHolder;", "clickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "hotspot-ui_fossReliantDebug"})
public final class PathAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.model.FileModel, org.monora.uprotocol.client.android.fragment.content.FilePathViewHolder> {
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.model.FileModel, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.content.PathAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_PATH = 0;
    
    public PathAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.model.FileModel, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.monora.uprotocol.client.android.fragment.content.FilePathViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.fragment.content.FilePathViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/PathAdapter$Companion;", "", "()V", "VIEW_TYPE_PATH", "", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}