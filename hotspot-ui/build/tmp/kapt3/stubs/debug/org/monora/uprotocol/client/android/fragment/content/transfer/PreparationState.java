package org.monora.uprotocol.client.android.fragment.content.transfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState;", "", "()V", "Preparing", "Ready", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState$Preparing;", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState$Ready;", "hotspot-ui_debug"})
public abstract class PreparationState {
    
    private PreparationState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState$Preparing;", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState;", "()V", "hotspot-ui_debug"})
    public static final class Preparing extends org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState.Preparing INSTANCE = null;
        
        private Preparing() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState$Ready;", "Lorg/monora/uprotocol/client/android/fragment/content/transfer/PreparationState;", "groupId", "", "list", "", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "(JLjava/util/List;)V", "getGroupId", "()J", "getList", "()Ljava/util/List;", "hotspot-ui_debug"})
    public static final class Ready extends org.monora.uprotocol.client.android.fragment.content.transfer.PreparationState {
        private final long groupId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list = null;
        
        public Ready(long groupId, @org.jetbrains.annotations.NotNull()
        java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list) {
            super();
        }
        
        public final long getGroupId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> getList() {
            return null;
        }
    }
}