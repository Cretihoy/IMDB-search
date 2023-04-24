package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Company(
    @SerializedName("id")
    @Expose
    val id: String, // co0002663
    @SerializedName("name")
    @Expose
    val name: String // Warner Bros.
)