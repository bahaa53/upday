package com.task.updayTask.domain.di

import com.task.updayTask.data.repositories.GettingImagesRepositoryImpl
import com.task.updayTask.domain.repositories.GettingImagesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindImagesRepository(
        imagesRepository: GettingImagesRepositoryImpl
    ): GettingImagesRepository
}