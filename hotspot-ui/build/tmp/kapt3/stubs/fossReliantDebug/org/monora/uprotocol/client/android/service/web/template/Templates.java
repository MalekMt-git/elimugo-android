package org.monora.uprotocol.client.android.service.web.template;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J$\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0012H\u0002JB\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00172\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u0002H\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00120\u0019J\"\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0012R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/template/Templates;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_context", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "templates", "", "", "loadTemplate", "assetPath", "parseTemplate", "templateIndex", "values", "", "render", "T", "templatePath", "list", "", "mapper", "Lkotlin/Function1;", "Companion", "hotspot-ui_fossReliantDebug"})
public final class Templates {
    private final java.lang.ref.WeakReference<android.content.Context> _context = null;
    private final java.util.Map<java.lang.String, java.lang.String> templates = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.monora.uprotocol.client.android.service.web.template.Templates.Companion Companion = null;
    private static final java.util.regex.Pattern TEMPLATE_PATTERN = null;
    
    public Templates(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    private final java.lang.String loadTemplate(java.lang.String assetPath) {
        return null;
    }
    
    private final java.lang.String parseTemplate(java.lang.String templateIndex, java.util.Map<java.lang.String, ? extends java.lang.Object> values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String render(@org.jetbrains.annotations.NotNull()
    java.lang.String templatePath, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.lang.String render(@org.jetbrains.annotations.NotNull()
    java.lang.String templatePath, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> mapper) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/monora/uprotocol/client/android/service/web/template/Templates$Companion;", "", "()V", "TEMPLATE_PATTERN", "Ljava/util/regex/Pattern;", "hotspot-ui_fossReliantDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}