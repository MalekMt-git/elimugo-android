package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/ChangelogViewModel;", "Landroidx/lifecycle/ViewModel;", "extrasRepository", "Lorg/monora/uprotocol/client/android/data/ExtrasRepository;", "(Lorg/monora/uprotocol/client/android/data/ExtrasRepository;)V", "changelog", "Landroidx/lifecycle/LiveData;", "Landroid/text/Spanned;", "getChangelog", "()Landroidx/lifecycle/LiveData;", "hotspot-ui_debug"})
public final class ChangelogViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.ExtrasRepository extrasRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.text.Spanned> changelog = null;
    
    @javax.inject.Inject()
    public ChangelogViewModel(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.ExtrasRepository extrasRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spanned> getChangelog() {
        return null;
    }
}