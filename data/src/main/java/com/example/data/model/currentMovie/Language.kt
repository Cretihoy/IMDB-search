package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Language(
    @SerializedName("key")
    @Expose
    val key: String, // English
    @SerializedName("value")
    @Expose
    val value: String // English
)