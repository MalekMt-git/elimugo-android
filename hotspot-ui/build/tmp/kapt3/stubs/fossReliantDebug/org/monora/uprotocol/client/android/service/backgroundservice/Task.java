package org.monora.uprotocol.client.android.service.backgroundservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "", "name", "", "params", "job", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/LiveData;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "(Ljava/lang/String;Ljava/lang/Object;Lkotlinx/coroutines/Job;Landroidx/lifecycle/LiveData;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getName", "()Ljava/lang/String;", "getParams", "()Ljava/lang/Object;", "getState", "()Landroidx/lifecycle/LiveData;", "Change", "State", "hotspot-ui_fossReliantDebug"})
public final class Task {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object params = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job job = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> state = null;
    
    public Task(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object params, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.service.backgroundservice.Task.State> getState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "", "running", "", "(Z)V", "getRunning", "()Z", "Error", "Finished", "Pending", "Progress", "Running", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Pending;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Running;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Progress;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Error;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Finished;", "hotspot-ui_fossReliantDebug"})
    public static abstract class State {
        private final boolean running = false;
        
        private State(boolean running) {
            super();
        }
        
        public final boolean getRunning() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Pending;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "()V", "hotspot-ui_fossReliantDebug"})
        public static final class Pending extends org.monora.uprotocol.client.android.service.backgroundservice.Task.State {
            @org.jetbrains.annotations.NotNull()
            public static final org.monora.uprotocol.client.android.service.backgroundservice.Task.State.Pending INSTANCE = null;
            
            private Pending() {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Running;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "hotspot-ui_fossReliantDebug"})
        public static final class Running extends org.monora.uprotocol.client.android.service.backgroundservice.Task.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            public Running(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Progress;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "message", "", "total", "", "progress", "(Ljava/lang/String;II)V", "getMessage", "()Ljava/lang/String;", "getProgress", "()I", "getTotal", "hotspot-ui_fossReliantDebug"})
        public static final class Progress extends org.monora.uprotocol.client.android.service.backgroundservice.Task.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            private final int total = 0;
            private final int progress = 0;
            
            public Progress(@org.jetbrains.annotations.NotNull()
            java.lang.String message, int total, int progress) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            public final int getTotal() {
                return 0;
            }
            
            public final int getProgress() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Error;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "hotspot-ui_fossReliantDebug"})
        public static final class Error extends org.monora.uprotocol.client.android.service.backgroundservice.Task.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Exception error = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Exception error) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Exception getError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State$Finished;", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "()V", "hotspot-ui_fossReliantDebug"})
        public static final class Finished extends org.monora.uprotocol.client.android.service.backgroundservice.Task.State {
            @org.jetbrains.annotations.NotNull()
            public static final org.monora.uprotocol.client.android.service.backgroundservice.Task.State.Finished INSTANCE = null;
            
            private Finished() {
                super(false);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000e\u0010\u0011\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "T", "", "task", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "exported", "state", "Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "(Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;Ljava/lang/Object;Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;)V", "getExported", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getState", "()Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;", "getTask", "()Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;", "component1", "component2", "component3", "copy", "(Lorg/monora/uprotocol/client/android/service/backgroundservice/Task;Ljava/lang/Object;Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$State;)Lorg/monora/uprotocol/client/android/service/backgroundservice/Task$Change;", "equals", "", "other", "hashCode", "", "toString", "", "hotspot-ui_fossReliantDebug"})
    public static final class Change<T extends java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.service.backgroundservice.Task task = null;
        private final T exported = null;
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.service.backgroundservice.Task.State state = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.backgroundservice.Task.Change<T> copy(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.service.backgroundservice.Task task, T exported, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.service.backgroundservice.Task.State state) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Change(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.service.backgroundservice.Task task, T exported, @org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.service.backgroundservice.Task.State state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.backgroundservice.Task component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.backgroundservice.Task getTask() {
            return null;
        }
        
        public final T component2() {
            return null;
        }
        
        public final T getExported() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.backgroundservice.Task.State component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.service.backgroundservice.Task.State getState() {
            return null;
        }
    }
}