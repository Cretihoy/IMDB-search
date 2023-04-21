package com.example.imdbsearch.mvp

import com.example.data.di.HiltModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter
import okhttp3.OkHttpClient
import javax.inject.Inject

@InjectViewState
class MovieListPresenter
@Inject constructor() : MvpPresenter<MovieListView>() {

    fun onSearchButtonClicked(name: String) {
        loadMovieByName(name)
    }

    private fun loadMovieByName(name: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val result =
                HiltModule.provideApiBaseService(httpClient = OkHttpClient()).getMovieByName(name)
            val movies = result.results
            viewState.showMovies(movies)
        }
    }
}