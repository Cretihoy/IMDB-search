package com.example.imdbsearch.currentMovie.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbsearch.R

class CurrentMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image: ImageView by lazy { itemView.findViewById(R.id.item_base_image) }
    val name: TextView by lazy { itemView.findViewById(R.id.item_base_name) }
}