package com.example.domain.repository

import com.example.domain.model.CurrentMovieModel
import com.example.domain.model.MovieModel

interface MovieRepository {

    suspend fun getMoviesByName(name: String): List<MovieModel>

    suspend fun getMovieById(id: String): CurrentMovieModel
}