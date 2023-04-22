package com.example.domain.repository

import com.example.domain.model.MovieModel

interface MovieRepository {

    suspend fun getMovieByName(name: String): List<MovieModel>
}