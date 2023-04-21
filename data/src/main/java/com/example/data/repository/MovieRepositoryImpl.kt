package com.example.data.repository

import com.example.data.model.MovieDto
import com.example.data.service.MovieService
import javax.inject.Inject

class MovieRepositoryImpl
@Inject constructor(
    private val service: MovieService
) {

    suspend fun getMoviesByName(name: String): List<MovieDto> {
        return service.getMovieByName(name).results
    }
}