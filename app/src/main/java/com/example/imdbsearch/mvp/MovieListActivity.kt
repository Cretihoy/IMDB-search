package com.example.imdbsearch.mvp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.MovieModel
import com.example.data.service.MovieServiceBuilder
import com.example.imdbsearch.R
import com.example.imdbsearch.movieListRecycler.MovieListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class MovieListActivity : MvpAppCompatActivity(), MovieListView {

    var result: Any? = null
    val recycler: RecyclerView by lazy { findViewById(R.id.movie_list_recycler) }
    val buttonSearch: Button by lazy { findViewById(R.id.movie_list_button) }
    val editText: EditText by lazy { findViewById(R.id.movie_list_edit_text) }
    val adapter = MovieListAdapter()

    @Inject
    lateinit var presenterProvider: Provider<MovieListPresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        loadMovies()
    }

    private fun loadMovies() {
        CoroutineScope(Dispatchers.Main).launch {
            result = MovieServiceBuilder.getClient().getMovieByName("Inception")
        }
    }

    override fun showMovies(movies: List<MovieModel>) {
        adapter.setItems(movies)
    }
}