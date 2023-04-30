package com.example.imdbsearch.currentMovie.mvp

import com.example.domain.model.CurrentMovieModel
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface CurrentMovieView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showMovie(movie: CurrentMovieModel)
}