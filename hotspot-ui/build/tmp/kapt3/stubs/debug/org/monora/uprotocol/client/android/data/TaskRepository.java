package org.monora.uprotocol.client.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fj\u0002`\u000eJ\u001e\u0010\u000f\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fj\u0002`\u000eJ\u0006\u0010\u0010\u001a\u00020\nJ\u0082\u0001\u0010\u0011\u001a\u00020\r\"\b\b\u0000\u0010\u0012*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002H\u00122[\u0010\u0016\u001aW\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0012\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0017j\b\u0012\u0004\u0012\u0002H\u0012`\u001f\u00a2\u0006\u0002\u0010 Jk\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020!2[\u0010\"\u001aW\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\f\b\u0019\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0017j\b\u0012\u0004\u0012\u00020!`\u001fJ>\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010%0$\"\b\b\u0000\u0010\u0012*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u0001H\u00120\fj\b\u0012\u0004\u0012\u0002H\u0012`\'JB\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120%0)0$\"\b\b\u0000\u0010\u0012*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u0001H\u00120\fj\b\u0012\u0004\u0012\u0002H\u0012`\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006*"}, d2 = {"Lorg/monora/uprotocol/client/android/data/TaskRepository;", "", "context", "Landroid/content/Context;", "backend", "Lorg/monora/uprotocol/client/android/backend/Backend;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/backend/Backend;)V", "getContext", "()Landroid/content/Context;", "cancelMatching", "", "filter", "Lkotlin/Function1;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "Lorg/monora/uprotocol/client/android/backend/TaskFilter;", "contains", "containsAny", "register", "T", "name", "", "params", "registry", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "applicationScope", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "state", "Lkotlinx/coroutines/Job;", "Lorg/monora/uprotocol/client/android/backend/TaskRegistry;", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "Lorg/monora/uprotocol/client/android/task/transfer/TransferParams;", "taskRegistry", "subscribeToTask", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "condition", "Lorg/monora/uprotocol/client/android/backend/TaskSubscriber;", "subscribeToTasks", "", "hotspot-ui_debug"})
@javax.inject.Singleton()
public final class TaskRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final org.monora.uprotocol.client.android.backend.Backend backend = null;
    
    @javax.inject.Inject()
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.backend.Backend backend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final boolean cancelMatching(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, java.lang.Boolean> filter) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.monora.uprotocol.client.android.service.backgroundservice.Task, java.lang.Boolean> filter) {
        return false;
    }
    
    public final boolean containsAny() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>org.monora.uprotocol.client.android.service.backgroundservice.Task register(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    T params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State>, ? extends kotlinx.coroutines.Job> registry) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.monora.uprotocol.client.android.service.backgroundservice.Task register(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.task.transfer.TransferParams params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super org.monora.uprotocol.client.android.task.transfer.TransferParams, ? super androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State>, ? extends kotlinx.coroutines.Job> taskRegistry) {
        return null;
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
}