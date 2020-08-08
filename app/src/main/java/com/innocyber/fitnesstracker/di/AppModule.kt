package com.innocyber.fitnesstracker.di

import android.content.Context
import androidx.room.Room
import com.innocyber.fitnesstracker.db.RunDatabase
import com.innocyber.fitnesstracker.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,RunDatabase::class.java,DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunDatabase) = db.getRunDao()
}