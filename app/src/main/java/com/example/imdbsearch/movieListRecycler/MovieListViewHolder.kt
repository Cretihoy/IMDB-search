package com.example.imdbsearch.movieListRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbsearch.R

class MovieListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val poster: ImageView by lazy { itemView.findViewById(R.id.item_movie_image) }
    val title: TextView by lazy { itemView.findViewById(R.id.item_movie_title) }
    val description: TextView by lazy { itemView.findViewById(R.id.item_movie_description) }
}