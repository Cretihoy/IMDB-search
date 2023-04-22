package com.example.data.mapper

import com.example.data.model.MovieDto
import com.example.domain.model.MovieModel
import javax.inject.Inject

class MovieMapper
@Inject constructor() {

    fun map(dto: MovieDto): MovieModel {
        return MovieModel(
            id = dto.id,
            posterUrl = dto.image,
            title = dto.title,
            description = dto.description
        )
    }
}