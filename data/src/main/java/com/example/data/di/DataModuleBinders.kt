package com.example.data.di

import com.example.data.repository.MovieRepositoryImpl
import com.example.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModuleBinders {

    @Binds
    fun bindHotelRepository(
        repository: MovieRepositoryImpl
    ): MovieRepository
}