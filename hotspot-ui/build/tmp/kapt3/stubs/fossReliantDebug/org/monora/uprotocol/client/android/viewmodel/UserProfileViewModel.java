package org.monora.uprotocol.client.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u00030\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001b0\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/monora/uprotocol/client/android/viewmodel/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "userDataRepository", "Lorg/monora/uprotocol/client/android/data/UserDataRepository;", "(Landroid/content/Context;Lorg/monora/uprotocol/client/android/data/UserDataRepository;)V", "client", "Landroidx/lifecycle/MutableLiveData;", "Lorg/monora/uprotocol/client/android/database/model/UClient;", "kotlin.jvm.PlatformType", "getClient", "()Landroidx/lifecycle/MutableLiveData;", "value", "", "clientNickname", "getClientNickname", "()Ljava/lang/String;", "setClientNickname", "(Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "deletePictureListener", "Landroid/view/View$OnClickListener;", "getDeletePictureListener", "()Landroid/view/View$OnClickListener;", "hasPicture", "Landroidx/lifecycle/LiveData;", "", "getHasPicture", "()Landroidx/lifecycle/LiveData;", "saveProfilePicture", "", "uri", "Landroid/net/Uri;", "hotspot-ui_fossReliantDebug"})
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    private final org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient> client = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener deletePictureListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasPicture = null;
    
    @javax.inject.Inject()
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.data.UserDataRepository userDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient> getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientNickname() {
        return null;
    }
    
    public final void setClientNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getDeletePictureListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasPicture() {
        return null;
    }
    
    public final void saveProfilePicture(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
}