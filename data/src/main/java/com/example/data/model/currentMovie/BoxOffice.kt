package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class BoxOffice(
    @SerializedName("budget")
    @Expose
    val budget: String, // $160,000,000 (estimated)
    @SerializedName("openingWeekendUSA")
    @Expose
    val openingWeekendUSA: String, // $62,785,337
    @SerializedName("grossUSA")
    @Expose
    val grossUSA: String, // $292,587,330
    @SerializedName("cumulativeWorldwideGross")
    @Expose
    val cumulativeWorldwideGross: String // $836,504,484
)