package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \r*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/SharedTextsViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "userDataRepository", "Lorg/monora/uprotocol/client/android/data/UserDataRepository;", "sharedTextRepository", "Lorg/monora/uprotocol/client/android/data/SharedTextRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/UserDataRepository;Lorg/monora/uprotocol/client/android/data/SharedTextRepository;)V", "sharedTexts", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lorg/monora/uprotocol/client/android/model/ListItem;", "kotlin.jvm.PlatformType", "getSharedTexts", "()Landroidx/lifecycle/LiveData;", "remove", "", "sharedText", "Lorg/monora/uprotocol/client/android/database/model/SharedText;", "save", "update", "", "hotspot-ui_fossReliantDebug"})
public final class SharedTextsViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository = null;
    private final org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<org.monora.uprotocol.client.android.model.ListItem>> sharedTexts = null;
    
    @javax.inject.Inject()
    public SharedTextsViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.SharedTextRepository sharedTextRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<org.monora.uprotocol.client.android.model.ListItem>> getSharedTexts() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText, boolean update) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.SharedText sharedText) {
    }
}