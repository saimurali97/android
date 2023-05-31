package com.newproject.user.di

import android.content.Context
import com.newproject.user.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    internal fun provideNoInternetErrorString(@ApplicationContext context: Context): String{
        return context.getString(R.string.no_internet_error)
    }
}