package com.example.domain.model

data class CurrentMovieModel(
    val id: String,
    val posterUrl: String?,
    val fullTitle: String?,
    val description: String?,
    val actors: List<ActorModel>
)