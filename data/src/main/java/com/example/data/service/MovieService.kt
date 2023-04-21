package com.example.data.service

import com.example.data.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path

private const val API_KEY = "k_d34009sc"

interface MovieService {

    @GET("API/Search/$API_KEY/{movieName}")
    suspend fun getMovieByName(
        @Path("movieName") name: String
    ): MovieResponse
}