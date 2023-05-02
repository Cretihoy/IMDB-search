package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class TrailerResponse(
    @SerializedName("imDbId")
    @Expose
    val imDbId: String, // tt10872600
    @SerializedName("title")
    @Expose
    val title: String, // Spider-Man: No Way Home
    @SerializedName("fullTitle")
    @Expose
    val fullTitle: String, // Spider-Man: No Way Home (2021)
    @SerializedName("type")
    @Expose
    val type: String, // Movie
    @SerializedName("year")
    @Expose
    val year: String, // 2021
    @SerializedName("videoId")
    @Expose
    val videoId: String, // vi3348546073
    @SerializedName("videoTitle")
    @Expose
    val videoTitle: String, // Trailer
    @SerializedName("videoDescription")
    @Expose
    val videoDescription: String, // With not one, not two, but THREE Spider-Mans!
    @SerializedName("thumbnailUrl")
    @Expose
    val thumbnailUrl: String, // https://m.media-amazon.com/images/M/MV5BYjU3Mjk2N2ItYjFiMS00MjE1LWFkZDUtZjVjNDc0MjI2N2M4XkEyXkFqcGdeQWRpZWdtb25n._V1_.jpg
    @SerializedName("uploadDate")
    @Expose
    val uploadDate: String, // 04/28/2022 22:58:51
    @SerializedName("link")
    @Expose
    val link: String, // https://www.imdb.com/video/vi3348546073
    @SerializedName("linkEmbed")
    @Expose
    val linkEmbed: String, // https://www.imdb.com/video/imdb/vi3348546073/imdb/embed
    @SerializedName("errorMessage")
    @Expose
    val errorMessage: String
)