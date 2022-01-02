package org.monora.uprotocol.client.android.util;

import java.lang.System;

/**
 * created by: veli
 * date: 06.04.2018 17:01
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jx\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001126\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0013\u00a8\u0006\u0017"}, d2 = {"Lorg/monora/uprotocol/client/android/util/Transfers;", "", "()V", "createStructure", "", "context", "Landroid/content/Context;", "list", "", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "progress", "Lorg/monora/uprotocol/client/android/util/Progress;", "groupId", "", "contextFile", "Lcom/genonbeta/android/framework/io/DocumentFile;", "directory", "", "progressCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "file", "hotspot-ui_fossReliantDebug"})
public final class Transfers {
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.util.Transfers INSTANCE = null;
    
    private Transfers() {
        super();
    }
    
    public final void createStructure(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<org.monora.uprotocol.client.android.database.model.UTransferItem> list, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.util.Progress progress, long groupId, @org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile contextFile, @org.jetbrains.annotations.Nullable()
    java.lang.String directory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.monora.uprotocol.client.android.util.Progress, ? super com.genonbeta.android.framework.io.DocumentFile, kotlin.Unit> progressCallback) {
    }
}