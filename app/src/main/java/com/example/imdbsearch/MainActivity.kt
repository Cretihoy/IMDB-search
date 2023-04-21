package com.example.imdbsearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.data.service.MovieServiceBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var result: Any? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadMovies()
    }

    private fun loadMovies() {
        CoroutineScope(Dispatchers.Main).launch {
            result = MovieServiceBuilder.getClient().getMovieByName("Inception")
        }
    }
}