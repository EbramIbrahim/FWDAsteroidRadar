// Generated by Dagger (https://dagger.dev).
package com.udacity.asteroidradar.di;

import com.udacity.asteroidradar.data.api.ApiService;
import com.udacity.asteroidradar.data.room.AsteroidDatabase;
import com.udacity.asteroidradar.repository.MainRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetMainRepositoryFactory implements Factory<MainRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<AsteroidDatabase> asteroidDatabaseProvider;

  public AppModule_GetMainRepositoryFactory(Provider<ApiService> apiServiceProvider,
      Provider<AsteroidDatabase> asteroidDatabaseProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.asteroidDatabaseProvider = asteroidDatabaseProvider;
  }

  @Override
  public MainRepository get() {
    return getMainRepository(apiServiceProvider.get(), asteroidDatabaseProvider.get());
  }

  public static AppModule_GetMainRepositoryFactory create(Provider<ApiService> apiServiceProvider,
      Provider<AsteroidDatabase> asteroidDatabaseProvider) {
    return new AppModule_GetMainRepositoryFactory(apiServiceProvider, asteroidDatabaseProvider);
  }

  public static MainRepository getMainRepository(ApiService apiService,
      AsteroidDatabase asteroidDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getMainRepository(apiService, asteroidDatabase));
  }
}
