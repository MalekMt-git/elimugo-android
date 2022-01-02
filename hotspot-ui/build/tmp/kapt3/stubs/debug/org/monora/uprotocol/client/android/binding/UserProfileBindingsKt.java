package org.monora.uprotocol.client.android.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u000b"}, d2 = {"listenNicknameChanges", "", "editText", "Landroid/widget/EditText;", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/UserProfileViewModel;", "loadPictureOfClient", "imageView", "Landroid/widget/ImageView;", "client", "Lorg/monora/uprotocol/core/protocol/Client;", "hotspot-ui_debug"})
public final class UserProfileBindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"listenNicknameChanges"})
    public static final void listenNicknameChanges(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"pictureOf"})
    public static final void loadPictureOfClient(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    org.monora.uprotocol.core.protocol.Client client) {
    }
}