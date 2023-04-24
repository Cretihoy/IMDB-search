package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Actor(
    @SerializedName("id")
    @Expose
    val id: String, // nm0000138
    @SerializedName("image")
    @Expose
    val image: String, // https://m.media-amazon.com/images/M/MV5BMjI0MTg3MzI0M15BMl5BanBnXkFtZTcwMzQyODU2Mw@@._V1_Ratio1.0000_AL_.jpg
    @SerializedName("name")
    @Expose
    val name: String, // Leonardo DiCaprio
    @SerializedName("asCharacter")
    @Expose
    val asCharacter: String // Cobb
)