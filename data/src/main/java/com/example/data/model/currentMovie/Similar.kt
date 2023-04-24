package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Similar(
    @SerializedName("id")
    @Expose
    val id: String, // tt0816692
    @SerializedName("title")
    @Expose
    val title: String, // Interstellar
    @SerializedName("image")
    @Expose
    val image: String, // https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_Ratio0.6763_AL_.jpg
    @SerializedName("imDbRating")
    @Expose
    val imDbRating: String // 8.6
)