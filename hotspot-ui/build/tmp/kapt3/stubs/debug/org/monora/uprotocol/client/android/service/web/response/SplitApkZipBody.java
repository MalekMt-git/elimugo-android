package org.monora.uprotocol.client.android.service.web.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/response/SplitApkZipBody;", "Lcom/yanzhenjie/andserver/http/ResponseBody;", "contents", "", "", "(Ljava/util/List;)V", "contentLength", "", "contentType", "Lcom/yanzhenjie/andserver/util/MediaType;", "isRepeatable", "", "writeTo", "", "output", "Ljava/io/OutputStream;", "hotspot-ui_debug"})
public final class SplitApkZipBody implements com.yanzhenjie.andserver.http.ResponseBody {
    private final java.util.List<java.lang.String> contents = null;
    
    public SplitApkZipBody(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> contents) {
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