package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Genre(
    @SerializedName("key")
    @Expose
    val key: String, // Action
    @SerializedName("value")
    @Expose
    val value: String // Action
)