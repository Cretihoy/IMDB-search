package com.example.data.service

import com.example.data.model.currentMovie.CurrentMovieResponse
import com.example.data.model.movieList.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path

private const val API_KEY = "k_d34009sc"

interface MovieService {

    @GET("API/Search/$API_KEY/{movieName}")
    suspend fun getMovieByName(
        @Path("movieName") name: String
    ): MovieResponse

    @GET("API/Title/$API_KEY/{id}")
    suspend fun getMovieById(
        @Path("id") id: String
    ): CurrentMovieResponse
}