package com.example.imdbsearch.mvp

import com.example.data.model.MovieDto
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MovieListView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showMovies(movies: List<MovieDto>)
}