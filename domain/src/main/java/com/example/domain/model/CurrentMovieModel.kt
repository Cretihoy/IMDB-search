package com.example.domain.model

data class CurrentMovieModel(
    val id: String,
    val posterUrl: String?,
    val fullTitle: String?,
    val description: String?,
    val actors: List<ActorModel>,
    val runtime: String?,
    val rating: String?,
    val genres: String?
)