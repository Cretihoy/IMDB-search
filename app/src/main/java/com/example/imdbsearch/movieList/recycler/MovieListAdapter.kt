package com.example.imdbsearch.movieList.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.domain.model.MovieModel
import com.example.imdbsearch.R

class MovieListAdapter() : RecyclerView.Adapter<MovieListViewHolder>() {

    private var action: ((String) -> Unit)? = null
    private var items = mutableListOf<MovieModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        val movie = items[position]
        holder.run {
            itemView.setOnClickListener { action?.invoke(movie.id) }
            title.text = movie.title
            description.text = movie.description
            poster.load(movie.posterUrl)
        }
    }

    fun setItems(movies: List<MovieModel>) {
        items = movies.toMutableList()
        notifyDataSetChanged()
    }

    fun setOnClickListener(clickAction: (String) -> Unit) {
        action = clickAction
    }
}