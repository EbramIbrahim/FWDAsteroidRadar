// Generated by Dagger (https://dagger.dev).
package com.udacity.asteroidradar.presentation.asteroids_list;

import androidx.work.WorkManager;
import com.udacity.asteroidradar.repository.MainRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainRepository> repositoryProvider;

  private final Provider<WorkManager> workManagerProvider;

  public MainViewModel_Factory(Provider<MainRepository> repositoryProvider,
      Provider<WorkManager> workManagerProvider) {
    this.repositoryProvider = repositoryProvider;
    this.workManagerProvider = workManagerProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), workManagerProvider.get());
  }

  public static MainViewModel_Factory create(Provider<MainRepository> repositoryProvider,
      Provider<WorkManager> workManagerProvider) {
    return new MainViewModel_Factory(repositoryProvider, workManagerProvider);
  }

  public static MainViewModel newInstance(MainRepository repository, WorkManager workManager) {
    return new MainViewModel(repository, workManager);
  }
}
