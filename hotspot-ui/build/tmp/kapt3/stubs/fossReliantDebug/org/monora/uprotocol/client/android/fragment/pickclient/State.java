package org.monora.uprotocol.client.android.fragment.pickclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "", "running", "", "(Z)V", "getRunning", "()Z", "Error", "Result", "Running", "Scan", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Scan;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Running;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Error;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Result;", "hotspot-ui_fossReliantDebug"})
public abstract class State {
    private final boolean running = false;
    
    private State(boolean running) {
        super();
    }
    
    public final boolean getRunning() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Scan;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "()V", "hotspot-ui_fossReliantDebug"})
    public static final class Scan extends org.monora.uprotocol.client.android.fragment.pickclient.State {
        
        public Scan() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Running;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "()V", "hotspot-ui_fossReliantDebug"})
    public static final class Running extends org.monora.uprotocol.client.android.fragment.pickclient.State {
        
        public Running() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Error;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "hotspot-ui_fossReliantDebug"})
    public static final class Error extends org.monora.uprotocol.client.android.fragment.pickclient.State {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception e = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/monora/uprotocol/client/android/fragment/pickclient/State$Result;", "Lorg/monora/uprotocol/client/android/fragment/pickclient/State;", "bridge", "Lorg/monora/uprotocol/core/CommunicationBridge;", "(Lorg/monora/uprotocol/core/CommunicationBridge;)V", "getBridge", "()Lorg/monora/uprotocol/core/CommunicationBridge;", "hotspot-ui_fossReliantDebug"})
    public static final class Result extends org.monora.uprotocol.client.android.fragment.pickclient.State {
        @org.jetbrains.annotations.NotNull()
        private final org.monora.uprotocol.core.CommunicationBridge bridge = null;
        
        public Result(@org.jetbrains.annotations.NotNull()
        org.monora.uprotocol.core.CommunicationBridge bridge) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.core.CommunicationBridge getBridge() {
            return null;
        }
    }
}