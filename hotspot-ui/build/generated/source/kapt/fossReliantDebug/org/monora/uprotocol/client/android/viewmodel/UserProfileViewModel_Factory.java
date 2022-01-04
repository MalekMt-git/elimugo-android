// Generated by Dagger (https://dagger.dev).
package org.monora.uprotocol.client.android.viewmodel;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.monora.uprotocol.client.android.data.UserDataRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserProfileViewModel_Factory implements Factory<UserProfileViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  public UserProfileViewModel_Factory(Provider<Context> contextProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    this.contextProvider = contextProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
  }

  @Override
  public UserProfileViewModel get() {
    return newInstance(contextProvider.get(), userDataRepositoryProvider.get());
  }

  public static UserProfileViewModel_Factory create(Provider<Context> contextProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    return new UserProfileViewModel_Factory(contextProvider, userDataRepositoryProvider);
  }

  public static UserProfileViewModel newInstance(Context context,
      UserDataRepository userDataRepository) {
    return new UserProfileViewModel(context, userDataRepository);
  }
}