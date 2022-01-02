package org.monora.uprotocol.client.android.viewmodel.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0011\u0010%\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013\u00a8\u0006*"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/TransferDetailContentViewModel;", "", "detail", "Lorg/monora/uprotocol/client/android/database/model/TransferDetail;", "(Lorg/monora/uprotocol/client/android/database/model/TransferDetail;)V", "clientNickname", "", "getClientNickname", "()Ljava/lang/String;", "count", "", "getCount", "()I", "finishedIcon", "getFinishedIcon", "icon", "getIcon", "isFinished", "", "()Z", "isReceiving", "needsApproval", "getNeedsApproval", "onRemove", "Lkotlin/Function0;", "", "getOnRemove", "()Lkotlin/jvm/functions/Function0;", "setOnRemove", "(Lkotlin/jvm/functions/Function0;)V", "percentage", "percentageText", "getPercentageText", "progress", "getProgress", "sizeText", "getSizeText", "waitingApproval", "getWaitingApproval", "showPopupMenu", "view", "Landroid/view/View;", "hotspot-ui_debug"})
public final class TransferDetailContentViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientNickname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sizeText = null;
    private final boolean isFinished = false;
    private final boolean isReceiving = false;
    private final int count = 0;
    private final int icon = 0;
    private final int finishedIcon = 0;
    private final boolean needsApproval = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onRemove;
    private final int percentage = 0;
    private final int progress = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String percentageText = null;
    private final boolean waitingApproval = false;
    
    public TransferDetailContentViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.TransferDetail detail) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSizeText() {
        return null;
    }
    
    public final boolean isFinished() {
        return false;
    }
    
    public final boolean isReceiving() {
        return false;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final int getFinishedIcon() {
        return 0;
    }
    
    public final boolean getNeedsApproval() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRemove() {
        return null;
    }
    
    public final void setOnRemove(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final int getProgress() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPercentageText() {
        return null;
    }
    
    public final boolean getWaitingApproval() {
        return false;
    }
    
    public final void showPopupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}