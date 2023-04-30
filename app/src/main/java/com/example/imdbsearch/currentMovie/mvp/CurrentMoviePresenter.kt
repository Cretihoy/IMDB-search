package com.example.imdbsearch.currentMovie.mvp

import com.example.data.repository.MovieRepositoryImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class CurrentMoviePresenter
@Inject constructor(
    private val repository: MovieRepositoryImpl
) : MvpPresenter<CurrentMovieView>() {

    private fun loadMovieById(id: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val movie = repository.getMovieById(id)
            viewState.showMovie(movie)
        }
    }
}