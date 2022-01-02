package org.monora.uprotocol.client.android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_BgBroadcastReceiver extends BroadcastReceiver {
  private volatile boolean injected = false;

  private final Object injectedLock = new Object();

  private final boolean onReceiveBytecodeInjectionMarker = false;

  @Override
  @CallSuper
  public void onReceive(Context context, Intent intent) {
    inject(context);
  }

  protected void inject(Context context) {
    if (!injected) {
      synchronized (injectedLock) {
        if (!injected) {
          ((BgBroadcastReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectBgBroadcastReceiver(UnsafeCasts.<BgBroadcastReceiver>unsafeCast(this));
          injected = true;
        }
      }
    }
  }
}
