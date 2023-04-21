package com.example.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class MovieResponse(
    @SerializedName("searchType")
    @Expose
    val searchType: String, // Title
    @SerializedName("expression")
    @Expose
    val expression: String, // Inception
    @SerializedName("results")
    @Expose
    val results: List<MovieDto>,
    @SerializedName("errorMessage")
    @Expose
    val errorMessage: String
)