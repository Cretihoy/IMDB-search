package com.example.data.mapper

import com.example.data.model.currentMovie.CurrentMovieResponse
import com.example.domain.model.CurrentMovieModel
import javax.inject.Inject

class CurrentMovieMapper
@Inject constructor() {

    fun map(dto: CurrentMovieResponse): CurrentMovieModel {
        return CurrentMovieModel(
            id = dto.id,
            posterUrl = dto.image,
            title = dto.title,
            description = dto.plot,
        )
    }
}