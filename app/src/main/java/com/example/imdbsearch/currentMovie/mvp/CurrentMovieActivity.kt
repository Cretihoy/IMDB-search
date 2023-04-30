package com.example.imdbsearch.currentMovie.mvp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load
import com.example.domain.model.CurrentMovieModel
import com.example.imdbsearch.R
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class CurrentMovieActivity : MvpAppCompatActivity(), CurrentMovieView {

    private val poster: ImageView by lazy { findViewById(R.id.current_movie_poster) }
    private val title: TextView by lazy { findViewById(R.id.current_movie_title) }
    private val description: TextView by lazy { findViewById(R.id.current_movie_description) }

    @Inject
    lateinit var presenterProvider: Provider<CurrentMoviePresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_movie)
    }

    override fun showMovie(movie: CurrentMovieModel) {
        poster.load(movie.posterUrl)
        title.text = movie.title
        description.text = movie.description
    }
}