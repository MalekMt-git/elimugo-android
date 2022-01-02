package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/PreparationState;", "", "()V", "Progress", "Ready", "Lorg/monora/uprotocol/client/android/fragment/PreparationState$Progress;", "Lorg/monora/uprotocol/client/android/fragment/PreparationState$Ready;", "hotspot-ui_debug"})
public abstract class PreparationState {
    
    private PreparationState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/PreparationState$Progress;", "Lorg/monora/uprotocol/client/android/fragment/PreparationState;", "index", "", "total", "title", "", "(IILjava/lang/String;)V", "getIndex", "()I", "getTitle", "()Ljava/lang/String;", "getTotal", "hotspot-ui_debug"})
    public static final class Progress extends org.monora.uprotocol.client.android.fragment.PreparationState {
        private final int index = 0;
        private final int total = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        public Progress(int index, int total, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        public final int getIndex() {
            return 0;
        }
        
        public final int getTotal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/PreparationState$Ready;", "Lorg/monora/uprotocol/client/android/fragment/PreparationState;", "id", "", "list", "", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "(JLjava/util/List;)V", "getId", "()J", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
    public static final class Ready extends org.monora.uprotocol.client.android.fragment.PreparationState {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list = null;
        
        public Ready(long id, @org.jetbrains.annotations.NotNull()
        java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> getList() {
            return null;
        }
    }
}