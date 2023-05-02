package com.example.imdbsearch.currentMovie.mvp

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.domain.model.CurrentMovieModel
import com.example.imdbsearch.R
import com.example.imdbsearch.currentMovie.recycler.CurrentMovieAdapter
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

private const val ID_KEY = "movie_id"

@AndroidEntryPoint
class CurrentMovieActivity : MvpAppCompatActivity(), CurrentMovieView {

    private val poster: ImageView by lazy { findViewById(R.id.current_movie_poster) }
    private val title: TextView by lazy { findViewById(R.id.current_movie_title) }
    private val description: TextView by lazy { findViewById(R.id.current_movie_description) }
    private val runtime: TextView by lazy { findViewById(R.id.current_movie_runtime) }
    private val rating: TextView by lazy { findViewById(R.id.current_movie_rating) }
    private val genres: TextView by lazy { findViewById(R.id.current_movie_genres) }
    val recycler: RecyclerView by lazy { findViewById(R.id.current_movie_recycler_actor) }
    val adapter = CurrentMovieAdapter()

    @Inject
    lateinit var presenterProvider: Provider<CurrentMoviePresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_movie)

        val id = intent.getStringExtra(ID_KEY)
        if (id == null) {
            finish()
        } else {
            presenter.loadMovieById(id)
        }

        recycler.adapter = adapter
    }

    override fun showMovie(movie: CurrentMovieModel) {
        poster.load(movie.posterUrl)
        title.text = movie.fullTitle
        description.text = movie.description
        runtime.text = movie.runtime
        rating.text = movie.rating
        genres.text = movie.genres
        adapter.setItems(movie.actors)
    }
}