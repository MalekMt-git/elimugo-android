package org.monora.uprotocol.client.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/SendTextState;", "", "()V", "Error", "Sending", "Success", "Lorg/monora/uprotocol/client/android/fragment/SendTextState$Sending;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState$Success;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState$Error;", "hotspot-ui_debug"})
public abstract class SendTextState {
    
    private SendTextState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/SendTextState$Sending;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState;", "()V", "hotspot-ui_debug"})
    public static final class Sending extends org.monora.uprotocol.client.android.fragment.SendTextState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.fragment.SendTextState.Sending INSTANCE = null;
        
        private Sending() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/SendTextState$Success;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState;", "()V", "hotspot-ui_debug"})
    public static final class Success extends org.monora.uprotocol.client.android.fragment.SendTextState {
        @org.jetbrains.annotations.NotNull()
        public static final org.monora.uprotocol.client.android.fragment.SendTextState.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/SendTextState$Error;", "Lorg/monora/uprotocol/client/android/fragment/SendTextState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "hotspot-ui_debug"})
    public static final class Error extends org.monora.uprotocol.client.android.fragment.SendTextState {
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