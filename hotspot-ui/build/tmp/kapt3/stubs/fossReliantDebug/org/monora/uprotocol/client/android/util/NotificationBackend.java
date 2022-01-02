package org.monora.uprotocol.client.android.util;

import java.lang.System;

/**
 * Created by: veli
 * Date: 4/28/17 2:00 AM
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NotificationBackend;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "manager", "Landroidx/core/app/NotificationManagerCompat;", "getManager", "()Landroidx/core/app/NotificationManagerCompat;", "notificationSettings", "", "getNotificationSettings", "()I", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "buildDynamicNotification", "Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "notificationId", "channelId", "", "cancel", "", "Companion", "hotspot-ui_fossReliantDebug"})
public final class NotificationBackend {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.core.app.NotificationManagerCompat manager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.NotificationBackend.Companion Companion = null;
    private static final java.lang.String TAG = "NotificationBackend";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_HIGH = "tsHighPriority";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_LOW = "tsLowPriority";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_INSTRUCTIVE = "instructiveNotifications";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "notificationId";
    
    public NotificationBackend(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationManagerCompat getManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    public final int getNotificationSettings() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification buildDynamicNotification(int notificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId) {
        return null;
    }
    
    public final void cancel(int notificationId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/util/NotificationBackend$Companion;", "", "()V", "CHANNEL_INSTRUCTIVE", "", "EXTRA_NOTIFICATION_ID", "NOTIFICATION_CHANNEL_HIGH", "NOTIFICATION_CHANNEL_LOW", "TAG", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}