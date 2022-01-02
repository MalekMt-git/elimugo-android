package org.monora.uprotocol.client.android.content;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/monora/uprotocol/client/android/content/ImageStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getBuckets", "", "Lorg/monora/uprotocol/client/android/content/ImageBucket;", "getImages", "Lorg/monora/uprotocol/client/android/content/Image;", "bucket", "hotspot-ui_debug"})
public final class ImageStore {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public ImageStore(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.ImageBucket> getBuckets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.monora.uprotocol.client.android.content.Image> getImages(@org.jetbrains.annotations.NotNull()
    org.monora.uprotocol.client.android.content.ImageBucket bucket) {
        return null;
    }
}