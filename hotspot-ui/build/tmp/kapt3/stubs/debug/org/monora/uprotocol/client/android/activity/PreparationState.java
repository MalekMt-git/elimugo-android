package org.monora.uprotocol.client.android.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PreparationState;", "", "isInProgress", "", "(Z)V", "()Z", "Error", "Finished", "Loading", "Progress", "Lorg/monora/uprotocol/client/android/activity/PreparationState$Loading;", "Lorg/monora/uprotocol/client/android/activity/PreparationState$Progress;", "Lorg/monora/uprotocol/client/android/activity/PreparationState$Error;", "Lorg/monora/uprotocol/client/android/activity/PreparationState$Finished;", "hotspot-ui_debug"})
public abstract class PreparationState {
    private final boolean isInProgress = false;
    
    private PreparationState(boolean isInProgress) {
        super();
    }
    
    public final boolean isInProgress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PreparationState$Loading;", "Lorg/monora/uprotocol/client/android/activity/PreparationState;", "()V", "hotspot-ui_debug"})
    public static final class Loading extends org.monora.uprotocol.client.android.activity.PreparationState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.activity.PreparationState.Loading INSTANCE = null;
        
        private Loading() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PreparationState$Progress;", "Lorg/monora/uprotocol/client/android/activity/PreparationState;", "progress", "", "(F)V", "getProgress", "()F", "hotspot-ui_debug"})
    public static final class Progress extends org.monora.uprotocol.client.android.activity.PreparationState {
        private final float progress = 0.0F;
        
        public Progress(float progress) {
            super(false);
        }
        
        public final float getProgress() {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PreparationState$Error;", "Lorg/monora/uprotocol/client/android/activity/PreparationState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "hotspot-ui_debug"})
    public static final class Error extends org.monora.uprotocol.client.android.activity.PreparationState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/monora/uprotocol/client/android/activity/PreparationState$Finished;", "Lorg/monora/uprotocol/client/android/activity/PreparationState;", "isSuccessful", "", "(Z)V", "()Z", "hotspot-ui_debug"})
    public static final class Finished extends org.monora.uprotocol.client.android.activity.PreparationState {
        private final boolean isSuccessful = false;
        
        public Finished(boolean isSuccessful) {
            super(false);
        }
        
        public final boolean isSuccessful() {
            return false;
        }
    }
}