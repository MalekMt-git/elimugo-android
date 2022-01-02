package org.monora.uprotocol.client.android.viewmodel.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00070\u0012\u00a2\u0006\u0002\b\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00070\u0012\u00a2\u0006\u0002\b\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u0016\u0010 \u001a\u00070\u0012\u00a2\u0006\u0002\b\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u00a8\u0006,"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentViewModel;", "Landroidx/databinding/BaseObservable;", "clientImpl", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "(Lorg/monora/uprotocol/client/android/database/model/UClient;)V", "accessLevelIcon", "", "getAccessLevelIcon", "()I", "blocked", "Landroidx/databinding/ObservableBoolean;", "getBlocked", "()Landroidx/databinding/ObservableBoolean;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "getClient", "()Lorg/monora/uprotocol/core/protocol/Client;", "clientType", "", "getClientType", "()Ljava/lang/String;", "nickname", "Lorg/jetbrains/annotations/NotNull;", "getNickname", "product", "getProduct", "supported", "", "getSupported", "()Z", "trusted", "getTrusted", "version", "getVersion", "onBlockedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onRemove", "view", "Landroid/view/View;", "onTrustChanged", "ClickType", "hotspot-ui_fossReliantDebug"})
public final class ClientContentViewModel extends androidx.databinding.BaseObservable {
    private final org.monora.uprotocol.client.android.database.model.UClient clientImpl = null;
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.core.protocol.Client client = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nickname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String product = null;
    private final boolean supported = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.databinding.ObservableBoolean blocked = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.databinding.ObservableBoolean trusted = null;
    private final int accessLevelIcon = 0;
    
    public ClientContentViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient clientImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.core.protocol.Client getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct() {
        return null;
    }
    
    public final boolean getSupported() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getBlocked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getTrusted() {
        return null;
    }
    
    public final int getAccessLevelIcon() {
        return 0;
    }
    
    public final void onBlockedChanged(@org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    public final void onTrustChanged(@org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    public final void onRemove(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/content/ClientContentViewModel$ClickType;", "", "(Ljava/lang/String;I)V", "Default", "Details", "hotspot-ui_fossReliantDebug"})
    public static enum ClickType {
        /*public static final*/ Default /* = new Default() */,
        /*public static final*/ Details /* = new Details() */;
        
        ClickType() {
        }
    }
}