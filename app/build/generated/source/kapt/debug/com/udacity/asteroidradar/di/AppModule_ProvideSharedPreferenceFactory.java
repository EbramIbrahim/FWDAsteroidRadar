// Generated by Dagger (https://dagger.dev).
package com.udacity.asteroidradar.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideSharedPreferenceFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreference(appProvider.get());
  }

  public static AppModule_ProvideSharedPreferenceFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideSharedPreferenceFactory(appProvider);
  }

  public static SharedPreferences provideSharedPreference(Context app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreference(app));
  }
}
