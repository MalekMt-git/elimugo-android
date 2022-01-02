package org.monora.uprotocol.client.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Permissions;", "", "()V", "checkRunningConditions", "", "context", "Landroid/content/Context;", "getAll", "", "Lorg/monora/uprotocol/client/android/util/Permissions$Permission;", "Permission", "hotspot-ui_debug"})
public final class Permissions {
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.Permissions INSTANCE = null;
    
    private Permissions() {
        super();
    }
    
    public final boolean checkRunningConditions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.util.Permissions.Permission> getAll() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Permissions$Permission;", "", "id", "", "title", "", "description", "isRequired", "", "(Ljava/lang/String;IIZ)V", "getDescription", "()I", "getId", "()Ljava/lang/String;", "()Z", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "hotspot-ui_debug"})
    public static final class Permission {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        private final int title = 0;
        private final int description = 0;
        private final boolean isRequired = false;
        
        @org.jetbrains.annotations.NotNull()
        public final org.monora.uprotocol.client.android.util.Permissions.Permission copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int description, boolean isRequired) {
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
        
        public Permission(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int description, boolean isRequired) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getDescription() {
            return 0;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isRequired() {
            return false;
        }
    }
}