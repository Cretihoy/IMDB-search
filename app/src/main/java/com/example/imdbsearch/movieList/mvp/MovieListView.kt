package com.example.imdbsearch.movieList.mvp

import com.example.domain.model.MovieModel
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MovieListView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showMovies(movies: List<MovieModel>)

    @StateStrategyType(SkipStrategy::class)
    fun openCurrentMovieScreen(id: String)
}