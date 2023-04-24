package com.example.data.model.currentMovie


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CurrentMovieResponse(
    @SerializedName("id")
    @Expose
    val id: String, // tt1375666
    @SerializedName("title")
    @Expose
    val title: String, // Inception
    @SerializedName("originalTitle")
    @Expose
    val originalTitle: String,
    @SerializedName("fullTitle")
    @Expose
    val fullTitle: String, // Inception (2010)
    @SerializedName("type")
    @Expose
    val type: String, // Movie
    @SerializedName("year")
    @Expose
    val year: String, // 2010
    @SerializedName("image")
    @Expose
    val image: String, // https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_Ratio0.6762_AL_.jpg
    @SerializedName("releaseDate")
    @Expose
    val releaseDate: String, // 2010-07-16
    @SerializedName("runtimeMins")
    @Expose
    val runtimeMins: String, // 148
    @SerializedName("runtimeStr")
    @Expose
    val runtimeStr: String, // 2h 28min
    @SerializedName("plot")
    @Expose
    val plot: String, // A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.
    @SerializedName("plotLocal")
    @Expose
    val plotLocal: String,
    @SerializedName("plotLocalIsRtl")
    @Expose
    val plotLocalIsRtl: Boolean, // false
    @SerializedName("awards")
    @Expose
    val awards: String, // Top rated movie #14 | Won 4 Oscars, 159 wins & 220 nominations total
    @SerializedName("directors")
    @Expose
    val directors: String, // Christopher Nolan
    @SerializedName("directorList")
    @Expose
    val directorList: List<Director>,
    @SerializedName("writers")
    @Expose
    val writers: String, // Christopher Nolan
    @SerializedName("writerList")
    @Expose
    val writerList: List<Writer>,
    @SerializedName("stars")
    @Expose
    val stars: String, // Leonardo DiCaprio, Joseph Gordon-Levitt, Elliot Page
    @SerializedName("starList")
    @Expose
    val starList: List<Star>,
    @SerializedName("actorList")
    @Expose
    val actorList: List<Actor>,
    @SerializedName("fullCast")
    @Expose
    val fullCast: Any?, // null
    @SerializedName("genres")
    @Expose
    val genres: String, // Action, Adventure, Sci-Fi
    @SerializedName("genreList")
    @Expose
    val genreList: List<Genre>,
    @SerializedName("companies")
    @Expose
    val companies: String, // Warner Bros., Legendary Entertainment, Syncopy
    @SerializedName("companyList")
    @Expose
    val companyList: List<Company>,
    @SerializedName("countries")
    @Expose
    val countries: String, // USA, UK
    @SerializedName("countryList")
    @Expose
    val countryList: List<Country>,
    @SerializedName("languages")
    @Expose
    val languages: String, // English, Japanese, French
    @SerializedName("languageList")
    @Expose
    val languageList: List<Language>,
    @SerializedName("contentRating")
    @Expose
    val contentRating: String, // PG-13
    @SerializedName("imDbRating")
    @Expose
    val imDbRating: String, // 8.8
    @SerializedName("imDbRatingVotes")
    @Expose
    val imDbRatingVotes: String, // 2397633
    @SerializedName("metacriticRating")
    @Expose
    val metacriticRating: String, // 74
    @SerializedName("ratings")
    @Expose
    val ratings: Any?, // null
    @SerializedName("wikipedia")
    @Expose
    val wikipedia: Any?, // null
    @SerializedName("posters")
    @Expose
    val posters: Any?, // null
    @SerializedName("images")
    @Expose
    val images: Any?, // null
    @SerializedName("trailer")
    @Expose
    val trailer: Any?, // null
    @SerializedName("boxOffice")
    @Expose
    val boxOffice: BoxOffice,
    @SerializedName("tagline")
    @Expose
    val tagline: Any?, // null
    @SerializedName("keywords")
    @Expose
    val keywords: String, // dream,ambiguous ending,subconscious,mindbender,surprise ending
    @SerializedName("keywordList")
    @Expose
    val keywordList: List<String>,
    @SerializedName("similars")
    @Expose
    val similars: List<Similar>,
    @SerializedName("tvSeriesInfo")
    @Expose
    val tvSeriesInfo: Any?, // null
    @SerializedName("tvEpisodeInfo")
    @Expose
    val tvEpisodeInfo: Any?, // null
    @SerializedName("errorMessage")
    @Expose
    val errorMessage: String
)