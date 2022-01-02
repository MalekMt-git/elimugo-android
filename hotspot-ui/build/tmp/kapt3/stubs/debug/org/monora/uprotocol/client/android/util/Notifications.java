package org.monora.uprotocol.client.android.util;

import java.lang.System;

/**
 * created by: Veli
 * date: 26.01.2018 18:29
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\b\u0010)\u001a\u0004\u0018\u00010\fJ\u0006\u0010*\u001a\u00020\u0019J$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Notifications;", "", "backend", "Lorg/monora/uprotocol/client/android/util/NotificationBackend;", "(Lorg/monora/uprotocol/client/android/util/NotificationBackend;)V", "getBackend", "()Lorg/monora/uprotocol/client/android/util/NotificationBackend;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "foregroundNotification", "Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "getForegroundNotification", "()Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "foregroundNotification$delegate", "Lkotlin/Lazy;", "percentFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "createAddingWifiNetworkNotification", "ssid", "", "password", "notifyClientCredentialsChanged", "", "client", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "notifyClipboardRequest", "item", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "notifyFileReceived", "transferParams", "Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "notifyReceivingOnWeb", "file", "Lcom/genonbeta/android/framework/io/DocumentFile;", "notifyTasksNotification", "taskList", "", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "notification", "notifyTransferError", "notifyTransferRequest", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "items", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "Companion", "hotspot-ui_debug"})
public final class Notifications {
    @org.jetbrains.annotations.NotNull()
    private final org.monora.uprotocol.client.android.util.NotificationBackend backend = null;
    private final java.text.NumberFormat percentFormat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy foregroundNotification$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.Notifications.Companion Companion = null;
    public static final int ID_BG_SERVICE = 1;
    public static final int ID_ADDING_WIFI_NETWORK = 2;
    public static final int REQUEST_CODE_ACCEPT = 1;
    public static final int REQUEST_CODE_REJECT = 2;
    public static final int REQUEST_CODE_NEUTRAL = 3;
    
    public Notifications(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.NotificationBackend backend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.NotificationBackend getBackend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification getForegroundNotification() {
        return null;
    }
    
    public final void notifyClientCredentialsChanged(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client) {
    }
    
    public final void notifyTransferError() {
    }
    
    public final void notifyTransferRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.Transfer transfer, @org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> items) {
    }
    
    public final void notifyClipboardRequest(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UClient client, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText item) {
    }
    
    public final void notifyFileReceived(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.task.transfer.TransferParams transferParams) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification notifyTasksNotification(@org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.service.backgroundservice.Task> taskList, @org.jetbrains.annotations.Nullable()
    org.monora.uprotocol.client.android.util.DynamicNotification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification notifyReceivingOnWeb(@org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification createAddingWifiNetworkNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String ssid, @org.jetbrains.annotations.Nullable()
    java.lang.String password) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Notifications$Companion;", "", "()V", "ID_ADDING_WIFI_NETWORK", "", "ID_BG_SERVICE", "REQUEST_CODE_ACCEPT", "REQUEST_CODE_NEUTRAL", "REQUEST_CODE_REJECT", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}