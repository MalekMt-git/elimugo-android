package org.monora.uprotocol.client.android.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u0002\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"load", "", "imageView", "Landroid/widget/ImageView;", "uri", "Landroid/net/Uri;", "circle", "", "fallback", "", "loadAlbumArtOf", "loadIconOf", "mimeType", "", "loadThumbnailOf", "info", "Landroid/content/pm/ApplicationInfo;", "item", "Lorg/monora/uprotocol/client/android/database/model/UTransferItem;", "viewModel", "Lorg/monora/uprotocol/client/android/viewmodel/content/FileContentViewModel;", "Lorg/monora/uprotocol/client/android/viewmodel/content/WebTransferContentViewModel;", "hotspot-ui_fossReliantDebug"})
public final class ContentBindingsKt {
    
    private static final void load(android.widget.ImageView imageView, android.net.Uri uri, boolean circle, @androidx.annotation.DrawableRes()
    int fallback) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thumbnailOf"})
    public static final void loadThumbnailOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.database.model.UTransferItem item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thumbnailOf"})
    public static final void loadThumbnailOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.viewmodel.content.FileContentViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thumbnailOf"})
    public static final void loadThumbnailOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.viewmodel.content.WebTransferContentViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thumbnailOf"})
    public static final void loadThumbnailOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.content.pm.ApplicationInfo info) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thumbnailOf"})
    public static final void loadThumbnailOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"albumArtOf"})
    public static final void loadAlbumArtOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"iconOf"})
    public static final void loadIconOf(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
    }
}