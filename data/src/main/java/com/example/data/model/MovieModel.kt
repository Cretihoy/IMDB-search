package com.example.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class MovieModel(
    @SerializedName("id")
    @Expose
    val id: String, // tt1375666
    @SerializedName("resultType")
    @Expose
    val resultType: String, // Title
    @SerializedName("image")
    @Expose
    val image: String, // https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_Ratio0.6757_AL_.jpg
    @SerializedName("title")
    @Expose
    val title: String, // Inception
    @SerializedName("description")
    @Expose
    val description: String // 2010 Leonardo DiCaprio, Joseph Gordon-Levitt
)