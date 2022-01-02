package org.monora.uprotocol.client.android.service;

import androidx.annotation.CallSuper;
import androidx.lifecycle.LifecycleService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_BackgroundService extends LifecycleService implements GeneratedComponentManagerHolder {
  private volatile ServiceComponentManager componentManager;

  private final Object componentManagerLock = new Object();

  private boolean injected = false;

  Hilt_BackgroundService() {
    super();
  }

  @CallSuper
  @Override
  public void onCreate() {
    inject();
    super.onCreate();
  }

  protected ServiceComponentManager createComponentManager() {
    return new ServiceComponentManager(this);
  }

  @Override
  public final ServiceComponentManager componentManager() {
    if (componentManager == null) {
      synchronized (componentManagerLock) {
        if (componentManager == null) {
          componentManager = createComponentManager();
        }
      }
    }
    return componentManager;
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((BackgroundService_GeneratedInjector) this.generatedComponent()).injectBackgroundService(UnsafeCasts.<BackgroundService>unsafeCast(this));
    }
  }

  @Override
  public final Object generatedComponent() {
    return this.componentManager().generatedComponent();
  }
}
