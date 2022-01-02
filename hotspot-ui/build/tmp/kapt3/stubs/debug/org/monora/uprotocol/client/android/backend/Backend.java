package org.monora.uprotocol.client.android.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u001f\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u00102\u001a\u000203J\u001e\u00104\u001a\u00020\r2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r06j\u0002`7J\b\u00108\u001a\u000203H\u0002J\u0006\u00109\u001a\u000203J\b\u0010:\u001a\u000203H\u0002J\b\u0010;\u001a\u0004\u0018\u00010<J\u001e\u0010=\u001a\u00020\r2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r06j\u0002`7J\u0006\u0010>\u001a\u00020\rJ\u0016\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\rJ\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020\rH\u0002J\u000e\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rJ\u0082\u0001\u0010F\u001a\u00020\u000b\"\b\b\u0000\u0010G*\u00020\u00012\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002HG2[\u0010K\u001aW\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\bM\u0012\b\bH\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011HG\u00a2\u0006\f\bM\u0012\b\bH\u0012\u0004\b\b(J\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020N0\t\u00a2\u0006\f\bM\u0012\b\bH\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020P0Lj\b\u0012\u0004\u0012\u0002HG`Q\u00a2\u0006\u0002\u0010RJ&\u0010S\u001a\u0002032\u0006\u0010T\u001a\u00020\u000b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\t2\u0006\u0010U\u001a\u00020\rH\u0002J:\u0010V\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002HG\u0018\u00010W0*\"\u0004\b\u0000\u0010G2\u001e\u0010X\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001HG06j\b\u0012\u0004\u0012\u0002HG`YJ>\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0W0\n0*\"\u0004\b\u0000\u0010G2\u001e\u0010X\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001HG06j\b\u0012\u0004\u0012\u0002HG`YJ\u0018\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00020\r2\b\b\u0002\u0010]\u001a\u00020\rJ\u0006\u0010^\u001a\u000203J\u0006\u0010_\u001a\u000203J\u0006\u0010`\u001a\u000203R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u000e*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010.\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u00101\u00a8\u0006b"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Backend;", "", "context", "Landroid/content/Context;", "services", "Ldagger/Lazy;", "Lorg/monora/uprotocol/client/android/backend/Services;", "(Landroid/content/Context;Ldagger/Lazy;)V", "_tasks", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "_tileState", "", "kotlin.jvm.PlatformType", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "bgIntent", "Landroid/content/Intent;", "bgNotification", "Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "getBgNotification", "()Lorg/monora/uprotocol/client/android/util/DynamicNotification;", "bgStopIntent", "getContext", "()Landroid/content/Context;", "foregroundActivitiesCount", "", "foregroundActivity", "Lorg/monora/uprotocol/client/android/app/Activity;", "getServices", "()Lorg/monora/uprotocol/client/android/backend/Services;", "services$delegate", "Lkotlin/Lazy;", "taskNotification", "taskNotificationTime", "", "taskSet", "", "tasks", "Landroidx/lifecycle/LiveData;", "getTasks", "()Landroidx/lifecycle/LiveData;", "tileEnabled", "tileState", "getTileState", "setTileState", "(Landroidx/lifecycle/LiveData;)V", "cancelAllTasks", "", "cancelMatchingTasks", "filter", "Lkotlin/Function1;", "Lorg/monora/uprotocol/client/android/backend/TaskFilter;", "ensureStarted", "ensureStartedAfterWelcoming", "ensureStopped", "getHotspotConfig", "Landroid/net/wifi/WifiConfiguration;", "hasTask", "hasTasks", "notifyActivityInForeground", "activity", "inForeground", "notifyTileState", "newState", "publishTaskNotifications", "force", "register", "T", "name", "", "params", "registry", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "state", "Lkotlinx/coroutines/Job;", "Lorg/monora/uprotocol/client/android/backend/TaskRegistry;", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "registerInternal", "task", "addition", "subscribeToTask", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "condition", "Lorg/monora/uprotocol/client/android/backend/TaskSubscriber;", "subscribeToTasks", "takeBgServiceFgIfNeeded", "newlySwitchedGrounds", "forceStop", "takeBgServiceFgThroughTogglingTile", "toggleHotspot", "toggleWiFiDirect", "Companion", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class Backend {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    private final android.content.Intent bgIntent = null;
    private final android.content.Intent bgStopIntent = null;
    private int foregroundActivitiesCount = 0;
    private org.monora.uprotocol.client.android.app.Activity foregroundActivity;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy services$delegate = null;
    private final java.util.Set<org.monora.uprotocol.client.android.service.backgroundservice.Task> taskSet = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.monora.uprotocol.client.android.service.backgroundservice.Task>> _tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.service.backgroundservice.Task>> tasks = null;
    private org.monora.uprotocol.client.android.util.DynamicNotification taskNotification;
    private long taskNotificationTime = 0L;
    private boolean tileEnabled = false;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _tileState;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> tileState;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.backend.Backend.Companion Companion = null;
    private static final java.lang.String TAG = "Backend";
    
    @javax.inject.Inject()
    public Backend(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<org.monora.uprotocol.client.android.backend.Services> services) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.util.DynamicNotification getBgNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.backend.Services getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.service.backgroundservice.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getTileState() {
        return null;
    }
    
    public final void setTileState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    public final void cancelAllTasks() {
    }
    
    public final boolean cancelMatchingTasks(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, java.lang.Boolean> filter) {
        return false;
    }
    
    private final void ensureStarted() {
    }
    
    public final void ensureStartedAfterWelcoming() {
    }
    
    private final void ensureStopped() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.wifi.WifiConfiguration getHotspotConfig() {
        return null;
    }
    
    public final boolean hasTasks() {
        return false;
    }
    
    public final boolean hasTask(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, java.lang.Boolean> filter) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void notifyActivityInForeground(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.app.Activity activity, boolean inForeground) {
    }
    
    private final void notifyTileState(boolean newState) {
    }
    
    public final boolean publishTaskNotifications(boolean force) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>org.monora.uprotocol.client.android.service.backgroundservice.Task register(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    T params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State>, ? extends kotlinx.coroutines.Job> registry) {
        return null;
    }
    
    private final void registerInternal(org.monora.uprotocol.client.android.service.backgroundservice.Task task, androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> state, boolean addition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<T>> subscribeToTask(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, ? extends T> condition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<T>>> subscribeToTasks(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, ? extends T> condition) {
        return null;
    }
    
    public final void takeBgServiceFgIfNeeded(boolean newlySwitchedGrounds, boolean forceStop) {
    }
    
    public final void takeBgServiceFgThroughTogglingTile() {
    }
    
    public final void toggleHotspot() {
    }
    
    public final void toggleWiFiDirect() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/backend/Backend$Companion;", "", "()V", "TAG", "", "hotspot-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}