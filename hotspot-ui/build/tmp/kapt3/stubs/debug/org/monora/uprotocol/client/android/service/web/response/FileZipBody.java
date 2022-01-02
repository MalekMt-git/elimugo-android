package org.monora.uprotocol.client.android.service.web.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/response/FileZipBody;", "Lcom/yanzhenjie/andserver/http/ResponseBody;", "context", "Landroid/content/Context;", "file", "Lcom/genonbeta/android/framework/io/DocumentFile;", "(Landroid/content/Context;Lcom/genonbeta/android/framework/io/DocumentFile;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contentLength", "", "contentType", "Lcom/yanzhenjie/andserver/util/MediaType;", "isRepeatable", "", "writeTo", "", "output", "Ljava/io/OutputStream;", "hotspot-ui_debug"})
public final class FileZipBody implements com.yanzhenjie.andserver.http.ResponseBody {
    private final com.genonbeta.android.framework.io.DocumentFile file = null;
    private final java.lang.ref.WeakReference<android.content.Context> context = null;
    
    public FileZipBody(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.genonbeta.android.framework.io.DocumentFile file) {
        super();
    }
    
    @java.lang.Override()
    public boolean isRepeatable() {
        return false;
    }
    
    @java.lang.Override()
    public long contentLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yanzhenjie.andserver.util.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    java.io.OutputStream output) {
    }
}