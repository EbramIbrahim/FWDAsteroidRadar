// Generated by Dagger (https://dagger.dev).
package com.udacity.asteroidradar.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AsteroidWorker_AssistedFactory_Impl implements AsteroidWorker_AssistedFactory {
  private final AsteroidWorker_Factory delegateFactory;

  AsteroidWorker_AssistedFactory_Impl(AsteroidWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AsteroidWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<AsteroidWorker_AssistedFactory> create(
      AsteroidWorker_Factory delegateFactory) {
    return InstanceFactory.create(new AsteroidWorker_AssistedFactory_Impl(delegateFactory));
  }
}
