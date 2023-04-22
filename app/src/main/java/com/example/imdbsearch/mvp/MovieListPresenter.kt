package com.example.imdbsearch.mvp

import com.example.data.repository.MovieRepositoryImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class MovieListPresenter
@Inject constructor(
    private val repository: MovieRepositoryImpl
) : MvpPresenter<MovieListView>() {

    fun onSearchButtonClicked(name: String) {
        loadMovieByName(name)
    }

    private fun loadMovieByName(name: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val movies = repository.getMovieByName(name)
            viewState.showMovies(movies)
        }
    }
}