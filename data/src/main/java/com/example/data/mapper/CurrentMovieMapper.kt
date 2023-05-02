package com.example.data.mapper

import com.example.data.model.currentMovie.Actor
import com.example.data.model.currentMovie.CurrentMovieResponse
import com.example.domain.model.ActorModel
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
            actors = dto.actorList.map { mapActor(it) }
        )
    }

    private fun mapActor(dto: Actor): ActorModel {
        return ActorModel(
            id = dto.id,
            imageUrl = dto.image,
            name = dto.name,
            asCharacter = dto.asCharacter
        )
    }
}