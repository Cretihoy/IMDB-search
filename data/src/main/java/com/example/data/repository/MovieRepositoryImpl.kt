package com.example.data.repository

import com.example.data.mapper.MovieMapper
import com.example.data.service.MovieService
import com.example.domain.model.MovieModel
import com.example.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl
@Inject constructor(
    private val service: MovieService,
    private val mapper: MovieMapper
) : MovieRepository {

    override suspend fun getMovieByName(name: String): List<MovieModel> {
        return mapper.map(service.getMovieByName(name))
    }
}