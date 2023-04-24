package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Writer(
    @SerializedName("id")
    @Expose
    val id: String, // nm0634240
    @SerializedName("name")
    @Expose
    val name: String // Christopher Nolan
)