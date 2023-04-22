package com.example.data.mapper

import com.example.data.model.MovieDto
import com.example.data.model.MovieResponse
import com.example.domain.model.MovieModel
import javax.inject.Inject

class MovieMapper
@Inject constructor() {

    fun map(response: MovieResponse): List<MovieModel> {
        return response.results.map { map(it) }
    }

    private fun map(dto: MovieDto): MovieModel {
        return MovieModel(
            id = dto.id,
            posterUrl = dto.image,
            title = dto.title,
            description = dto.description
        )
    }
}