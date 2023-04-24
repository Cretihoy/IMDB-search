package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Star(
    @SerializedName("id")
    @Expose
    val id: String, // nm0000138
    @SerializedName("name")
    @Expose
    val name: String // Leonardo DiCaprio
)