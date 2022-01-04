// Generated by Dagger (https://dagger.dev).
package org.monora.uprotocol.client.android.activity;

import android.content.Context;
import android.net.Uri;
import dagger.internal.DaggerGenerated;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PackageInstallerViewModel_Factory {
  private final Provider<Context> contextProvider;

  public PackageInstallerViewModel_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public PackageInstallerViewModel get(Uri uri) {
    return newInstance(contextProvider.get(), uri);
  }

  public static PackageInstallerViewModel_Factory create(Provider<Context> contextProvider) {
    return new PackageInstallerViewModel_Factory(contextProvider);
  }

  public static PackageInstallerViewModel newInstance(Context context, Uri uri) {
    return new PackageInstallerViewModel(context, uri);
  }
}