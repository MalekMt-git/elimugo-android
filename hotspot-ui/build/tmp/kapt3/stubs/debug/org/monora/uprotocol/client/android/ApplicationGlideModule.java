package org.monora.uprotocol.client.android;

import java.lang.System;

/**
 * created by: Veli
 * date: 28.03.2018 17:29
 */
@com.bumptech.glide.annotation.GlideModule()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "registerComponents", "", "context", "Landroid/content/Context;", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "AlbumArtDataFetcher", "AlbumArtModelLoader", "AlbumArtModelLoaderFactory", "AppIconDataFetcher", "AppIconModelLoader", "AppIconModelLoaderFactory", "hotspot-ui_debug"})
public final class ApplicationGlideModule extends com.bumptech.glide.module.AppGlideModule {
    
    public ApplicationGlideModule() {
        super();
    }
    
    @java.lang.Override()
    public void registerComponents(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Glide glide, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Registry registry) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AlbumArtDataFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "model", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", "getContext", "()Landroid/content/Context;", "getModel", "()Landroid/net/Uri;", "cancel", "", "cleanup", "getDataClass", "Ljava/lang/Class;", "getDataSource", "Lcom/bumptech/glide/load/DataSource;", "loadData", "priority", "Lcom/bumptech/glide/Priority;", "callback", "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;", "hotspot-ui_debug"})
    public static final class AlbumArtDataFetcher implements com.bumptech.glide.load.data.DataFetcher<android.graphics.Bitmap> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final android.net.Uri model = null;
        
        public AlbumArtDataFetcher(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri model) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getModel() {
            return null;
        }
        
        @java.lang.Override()
        public void loadData(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.Priority priority, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.data.DataFetcher.DataCallback<? super android.graphics.Bitmap> callback) {
        }
        
        @java.lang.Override()
        public void cleanup() {
        }
        
        @java.lang.Override()
        public void cancel() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Class<android.graphics.Bitmap> getDataClass() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.DataSource getDataSource() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AlbumArtModelLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "uri", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "hotspot-ui_debug"})
    public static final class AlbumArtModelLoader implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.graphics.Bitmap> {
        private final android.content.Context context = null;
        
        public AlbumArtModelLoader(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.model.ModelLoader.LoadData<android.graphics.Bitmap> buildLoadData(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, int width, int height, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.Options options) {
            return null;
        }
        
        @java.lang.Override()
        public boolean handles(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AlbumArtModelLoaderFactory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "hotspot-ui_debug"})
    public static final class AlbumArtModelLoaderFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.graphics.Bitmap> {
        private final android.content.Context context = null;
        
        public AlbumArtModelLoaderFactory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.graphics.Bitmap> build(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.MultiModelLoaderFactory multiFactory) {
            return null;
        }
        
        @java.lang.Override()
        public void teardown() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AppIconDataFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "model", "Landroid/content/pm/ApplicationInfo;", "(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)V", "getContext", "()Landroid/content/Context;", "getModel", "()Landroid/content/pm/ApplicationInfo;", "cancel", "", "cleanup", "getDataClass", "Ljava/lang/Class;", "getDataSource", "Lcom/bumptech/glide/load/DataSource;", "loadData", "priority", "Lcom/bumptech/glide/Priority;", "callback", "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;", "hotspot-ui_debug"})
    public static final class AppIconDataFetcher implements com.bumptech.glide.load.data.DataFetcher<android.graphics.drawable.Drawable> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.pm.ApplicationInfo model = null;
        
        public AppIconDataFetcher(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.pm.ApplicationInfo model) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.pm.ApplicationInfo getModel() {
            return null;
        }
        
        @java.lang.Override()
        public void loadData(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.Priority priority, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.data.DataFetcher.DataCallback<? super android.graphics.drawable.Drawable> callback) {
        }
        
        @java.lang.Override()
        public void cleanup() {
        }
        
        @java.lang.Override()
        public void cancel() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Class<android.graphics.drawable.Drawable> getDataClass() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.DataSource getDataSource() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AppIconModelLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Landroid/content/pm/ApplicationInfo;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "applicationInfo", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "hotspot-ui_debug"})
    public static final class AppIconModelLoader implements com.bumptech.glide.load.model.ModelLoader<android.content.pm.ApplicationInfo, android.graphics.drawable.Drawable> {
        private final android.content.Context context = null;
        
        public AppIconModelLoader(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.model.ModelLoader.LoadData<android.graphics.drawable.Drawable> buildLoadData(@org.jetbrains.annotations.NotNull()
        android.content.pm.ApplicationInfo applicationInfo, int width, int height, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.Options options) {
            return null;
        }
        
        @java.lang.Override()
        public boolean handles(@org.jetbrains.annotations.NotNull()
        android.content.pm.ApplicationInfo applicationInfo) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/monora/uprotocol/client/android/ApplicationGlideModule$AppIconModelLoaderFactory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Landroid/content/pm/ApplicationInfo;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "hotspot-ui_debug"})
    public static final class AppIconModelLoaderFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.content.pm.ApplicationInfo, android.graphics.drawable.Drawable> {
        private final android.content.Context context = null;
        
        public AppIconModelLoaderFactory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.model.ModelLoader<android.content.pm.ApplicationInfo, android.graphics.drawable.Drawable> build(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.MultiModelLoaderFactory multiFactory) {
            return null;
        }
        
        @java.lang.Override()
        public void teardown() {
        }
    }
}