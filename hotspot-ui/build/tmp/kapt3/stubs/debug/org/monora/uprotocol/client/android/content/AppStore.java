package org.monora.uprotocol.client.android.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/monora/uprotocol/client/android/content/AppStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lorg/monora/uprotocol/client/android/content/App;", "hotspot-ui_debug"})
public final class AppStore {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public AppStore(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    public final androidx.lifecycle.LiveData<java.util.List<org.monora.uprotocol.client.android.content.App>> getAll() {
        return null;
    }
}