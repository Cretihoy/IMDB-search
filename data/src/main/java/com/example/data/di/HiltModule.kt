package com.example.data.di

import com.example.data.BuildConfig
import com.example.data.service.MovieService
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val BASE_URL = "https://imdb-api.com/"
private const val TIMEOUT = 10L

object HiltModule {

    @Singleton
    @Provides
    private fun getOkHttpClient(): OkHttpClient {
        return with(OkHttpClient.Builder()) {
            connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            readTimeout(TIMEOUT, TimeUnit.SECONDS)

            if (BuildConfig.DEBUG) {
                addNetworkInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            }

            build()
        }
    }

    @Singleton
    @Provides
    fun provideApiBaseService(
        httpClient: OkHttpClient
    ): MovieService {
        return Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieService::class.java)
    }
}