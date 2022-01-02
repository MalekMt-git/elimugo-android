package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import java.util.Collections;
import java.util.Set;
import org.monora.uprotocol.client.android.ApplicationGlideModule;

@SuppressWarnings("deprecation")
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
  private final ApplicationGlideModule appGlideModule;

  public GeneratedAppGlideModuleImpl(Context context) {
    appGlideModule = new ApplicationGlideModule();
    if (Log.isLoggable("Glide", Log.DEBUG)) {
      Log.d("Glide", "Discovered AppGlideModule from annotation: org.monora.uprotocol.client.android.ApplicationGlideModule");
      Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
    }
  }

  @Override
  public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
    appGlideModule.applyOptions(context, builder);
  }

  @Override
  public void registerComponents(@NonNull Context context, @NonNull Glide glide,
      @NonNull Registry registry) {
    new OkHttpLibraryGlideModule().registerComponents(context, glide, registry);
    appGlideModule.registerComponents(context, glide, registry);
  }

  @Override
  public boolean isManifestParsingEnabled() {
    return appGlideModule.isManifestParsingEnabled();
  }

  @Override
  @NonNull
  public Set<Class<?>> getExcludedModuleClasses() {
    return Collections.emptySet();
  }

  @Override
  @NonNull
  GeneratedRequestManagerFactory getRequestManagerFactory() {
    return new GeneratedRequestManagerFactory();
  }
}
