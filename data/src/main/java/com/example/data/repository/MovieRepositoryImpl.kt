package com.example.data.repository

import com.example.data.mapper.CurrentMovieMapper
import com.example.data.mapper.MovieMapper
import com.example.data.service.MovieService
import com.example.domain.model.CurrentMovieModel
import com.example.domain.model.MovieModel
import com.example.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl
@Inject constructor(
    private val service: MovieService,
    private val movieMapper: MovieMapper,
    private val currentMovieMapper: CurrentMovieMapper
) : MovieRepository {

    override suspend fun getMoviesByName(name: String): List<MovieModel> {
        return movieMapper.map(service.getMoviesByName(name))
    }

    override suspend fun getMovieById(id: String): CurrentMovieModel {
        return currentMovieMapper.map(service.getMovieById(id))
    }
}