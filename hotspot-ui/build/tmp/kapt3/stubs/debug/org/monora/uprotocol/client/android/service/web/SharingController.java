package org.monora.uprotocol.client.android.service.web;

import java.lang.System;

@com.yanzhenjie.andserver.annotation.Controller()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\f\u00a8\u0006\u0013"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/SharingController;", "", "()V", "download", "Lcom/yanzhenjie/andserver/framework/body/StreamBody;", "context", "Landroid/content/Context;", "hashCode", "", "downloadZip", "Lcom/yanzhenjie/andserver/http/ResponseBody;", "index", "", "uploadedContent", "thumbnail", "upload", "content", "Lcom/yanzhenjie/andserver/http/multipart/MultipartFile;", "verify", "hotspot-ui_debug"})
public final class SharingController {
    
    public SharingController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.ResponseBody()
    @com.yanzhenjie.andserver.annotation.GetMapping(value = {"/download/{id}/{dummyName}"}, produces = {"application/force-download"})
    public final com.yanzhenjie.andserver.framework.body.StreamBody download(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @com.yanzhenjie.andserver.annotation.PathVariable(value = "id")
    int hashCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.ResponseBody()
    @com.yanzhenjie.andserver.annotation.GetMapping(value = {"/zip/{id}/{dummyName}"}, produces = {"application/force-download"})
    public final com.yanzhenjie.andserver.http.ResponseBody downloadZip(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @com.yanzhenjie.andserver.annotation.PathVariable(value = "id")
    int hashCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.ResponseBody()
    @com.yanzhenjie.andserver.annotation.GetMapping(value = {"/thumbnail/{id}"}, produces = {"image/png"})
    public final com.yanzhenjie.andserver.framework.body.StreamBody thumbnail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @com.yanzhenjie.andserver.annotation.PathVariable(value = "id")
    int hashCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.PostMapping(value = {"/upload"})
    public final java.lang.String upload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.RequestParam(value = "content")
    com.yanzhenjie.andserver.http.multipart.MultipartFile content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.ResponseBody()
    @com.yanzhenjie.andserver.annotation.GetMapping(value = {"/verify"}, produces = {"text/plain"})
    public final java.lang.String verify() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.GetMapping(value = {"/"})
    public final java.lang.String index() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.ResponseBody()
    @com.yanzhenjie.andserver.annotation.GetMapping(path = {"/index.html"}, produces = {"text/html"})
    public final java.lang.String index(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @com.yanzhenjie.andserver.annotation.RequestParam(value = "uploaded", required = false)
    java.lang.String uploadedContent) {
        return null;
    }
}