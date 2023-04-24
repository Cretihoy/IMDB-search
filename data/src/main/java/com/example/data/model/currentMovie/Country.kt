package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Country(
    @SerializedName("key")
    @Expose
    val key: String, // USA
    @SerializedName("value")
    @Expose
    val value: String // USA
)