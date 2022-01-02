package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \'2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002&\'BQ\u0012\'\u0010\u0004\u001a#\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0005\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0004\u001a#\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "gibSubscriberListener", "Lkotlin/Function1;", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "Lkotlin/ParameterName;", "name", "detail", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "clickListener", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click;", "click", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "detailClick", "Lkotlin/Function2;", "Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;", "textClick", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "webClick", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "Click", "Companion", "hotspot-ui_fossReliantDebug"})
public final class TransferHistoryAdapter extends androidx.recyclerview.widget.ListAdapter<org.monora.uprotocol.client.android.model.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.TransferDetail, androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel>> gibSubscriberListener = null;
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Click, kotlin.Unit> clickListener = null;
    private final kotlin.jvm.functions.Function2<org.monora.uprotocol.client.android.database.model.TransferDetail, org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType, kotlin.Unit> detailClick = null;
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.SharedText, kotlin.Unit> textClick = null;
    private final kotlin.jvm.functions.Function1<org.monora.uprotocol.client.android.database.model.WebTransfer, kotlin.Unit> webClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_SECTION = 0;
    public static final int VIEW_TYPE_LOCAL_TRANSFER = 1;
    public static final int VIEW_TYPE_SHARED_TEXT = 2;
    public static final int VIEW_TYPE_WEB_TRANSFER = 3;
    
    public TransferHistoryAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.database.model.TransferDetail, ? extends androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel>> gibSubscriberListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Click, kotlin.Unit> clickListener) {
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
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click;", "", "()V", "Local", "Text", "Web", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Local;", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Text;", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Web;", "hotspot-ui_fossReliantDebug"})
    public static abstract class Click {
        
        private Click() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Local;", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click;", "detail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "clickType", "Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;", "(Lorg/monora/uprotocol/client/android/database/model/TransferDetail;Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;)V", "getClickType", "()Lorg/monora/uprotocol/client/android/viewholder/TransferDetailViewHolder$ClickType;", "getDetail", "()Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "hotspot-ui_fossReliantDebug"})
        public static final class Local extends org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Click {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.database.model.TransferDetail detail = null;
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType clickType = null;
            
            public Local(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.database.model.TransferDetail detail, @org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType clickType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.database.model.TransferDetail getDetail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.viewholder.TransferDetailViewHolder.ClickType getClickType() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Text;", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click;", "text", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "(Lorg/monora/uprotocol/client/android/database/model/SharedText;)V", "getText", "()Lorg/monora/uprotocol/client/android/database/model/SharedText;", "hotspot-ui_fossReliantDebug"})
        public static final class Text extends org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Click {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.database.model.SharedText text = null;
            
            public Text(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.database.model.SharedText text) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.database.model.SharedText getText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click$Web;", "Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Click;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "(Lorg/monora/uprotocol/client/android/database/model/WebTransfer;)V", "getTransfer", "()Lorg/monora/uprotocol/client/android/database/model/WebTransfer;", "hotspot-ui_fossReliantDebug"})
        public static final class Web extends org.monora.uprotocol.client.android.fragment.TransferHistoryAdapter.Click {
            @org.jetbrains.annotations.NotNull()
            private final org.monora.uprotocol.client.android.database.model.WebTransfer transfer = null;
            
            public Web(@org.jetbrains.annotations.NotNull()
            org.monora.uprotocol.client.android.database.model.WebTransfer transfer) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.monora.uprotocol.client.android.database.model.WebTransfer getTransfer() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/TransferHistoryAdapter$Companion;", "", "()V", "VIEW_TYPE_LOCAL_TRANSFER", "", "VIEW_TYPE_SECTION", "VIEW_TYPE_SHARED_TEXT", "VIEW_TYPE_WEB_TRANSFER", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}