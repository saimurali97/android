// Generated by Dagger (https://dagger.dev).
package com.newproject.user.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideRetrofit$app_debugFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public RetrofitModule_ProvideRetrofit$app_debugFactory(
      Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit$app_debug(okHttpClientProvider.get());
  }

  public static RetrofitModule_ProvideRetrofit$app_debugFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new RetrofitModule_ProvideRetrofit$app_debugFactory(okHttpClientProvider);
  }

  public static Retrofit provideRetrofit$app_debug(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideRetrofit$app_debug(okHttpClient));
  }
}