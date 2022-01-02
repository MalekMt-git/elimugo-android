package org.monora.uprotocol.client.android.viewmodel.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\t\u0018\u00010\n\u00a2\u0006\u0002\b\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "", "change", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "total", "", "progress", "(Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;II)V", "averageSpeedText", "", "getAverageSpeedText", "()Ljava/lang/String;", "buttonIcon", "getButtonIcon", "()I", "ongoing", "Lorg/jetbrains/annotations/NotNull;", "getOngoing", "percentageText", "getPercentageText", "getProgress", "running", "", "getRunning", "()Z", "state", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "getState", "()Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "getTotal", "Companion", "hotspot-ui_fossReliantDebug"})
public final class TransferStateContentViewModel {
    private final int total = 0;
    private final int progress = 0;
    private final boolean running = false;
    private final int buttonIcon = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String averageSpeedText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ongoing = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.service.backgroundservice.Task.State state = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel.Companion Companion = null;
    
    public TransferStateContentViewModel(@org.jetbrains.annotations.Nullable()
    org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<org.monora.uprotocol.client.android.task.transfer.TransferParams> change, int total, int progress) {
        super();
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int getProgress() {
        return 0;
    }
    
    public final boolean getRunning() {
        return false;
    }
    
    public final int getButtonIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPercentageText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverageSpeedText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOngoing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.service.backgroundservice.Task.State getState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel$Companion;", "", "()V", "from", "Lorg/monora/uprotocol/client/android/viewmodel/content/TransferStateContentViewModel;", "change", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel from(@org.jetbrains.annotations.Nullable()
        org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<org.monora.uprotocol.client.android.task.transfer.TransferParams> change) {
            return null;
        }
    }
}