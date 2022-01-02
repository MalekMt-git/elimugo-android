package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingState;", "", "()V", "Error", "Running", "Success", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Running;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Success;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Error;", "hotspot-ui_fossReliantDebug"})
public abstract class SharingState {
    
    private SharingState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Running;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState;", "()V", "hotspot-ui_fossReliantDebug"})
    public static final class Running extends org.monora.uprotocol.client.android.viewmodel.SharingState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.viewmodel.SharingState.Running INSTANCE = null;
        
        private Running() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Success;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState;", "transfer", "Lorg/monora/uprotocol/client/android/database/model/Transfer;", "(Lorg/monora/uprotocol/client/android/database/model/Transfer;)V", "getTransfer", "()Lorg/monora/uprotocol/client/android/database/model/Transfer;", "hotspot-ui_fossReliantDebug"})
    public static final class Success extends org.monora.uprotocol.client.android.viewmodel.SharingState {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.client.android.database.model.Transfer transfer = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.client.android.database.model.Transfer transfer) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.database.model.Transfer getTransfer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharingState$Error;", "Lorg/monora/uprotocol/client/android/viewmodel/SharingState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "hotspot-ui_fossReliantDebug"})
    public static final class Error extends org.monora.uprotocol.client.android.viewmodel.SharingState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
    }
}