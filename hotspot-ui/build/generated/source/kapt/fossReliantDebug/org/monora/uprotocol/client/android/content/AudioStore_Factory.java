// Generated by Dagger (https://dagger.dev).
package org.monora.uprotocol.client.android.content;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AudioStore_Factory implements Factory<AudioStore> {
  private final Provider<Context> contextProvider;

  public AudioStore_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AudioStore get() {
    return newInstance(contextProvider.get());
  }

  public static AudioStore_Factory create(Provider<Context> contextProvider) {
    return new AudioStore_Factory(contextProvider);
  }

  public static AudioStore newInstance(Context context) {
    return new AudioStore(context);
  }
}