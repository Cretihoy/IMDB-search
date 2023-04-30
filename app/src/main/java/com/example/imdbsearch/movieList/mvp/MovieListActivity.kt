package com.example.imdbsearch.movieList.mvp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.MovieModel
import com.example.imdbsearch.R
import com.example.imdbsearch.currentMovie.mvp.CurrentMovieActivity
import com.example.imdbsearch.movieList.recycler.MovieListAdapter
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

private const val ID_KEY = "movie_id"

@AndroidEntryPoint
class MovieListActivity : MvpAppCompatActivity(), MovieListView {

    private val recycler: RecyclerView by lazy { findViewById(R.id.movie_list_recycler) }
    private val buttonSearch: Button by lazy { findViewById(R.id.movie_list_button) }
    private val editText: EditText by lazy { findViewById(R.id.movie_list_edit_text) }
    private val adapter = MovieListAdapter()

    @Inject
    lateinit var presenterProvider: Provider<MovieListPresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        recycler.adapter = adapter

        adapter.setOnClickListener { id ->
            presenter.onItemClicked(id)
        }

        buttonSearch.setOnClickListener {
            presenter.onSearchButtonClicked(editText.text.toString())
        }
    }

    override fun showMovies(movies: List<MovieModel>) {
        adapter.setItems(movies)
    }

    override fun openCurrentMovieScreen(id: String) {
        val intent = Intent(this, CurrentMovieActivity::class.java)
        intent.putExtra(ID_KEY, id)
        startActivity(intent)
    }
}