package com.example.imdbsearch.currentMovie.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.domain.model.ActorModel
import com.example.imdbsearch.R

class CurrentMovieAdapter() : RecyclerView.Adapter<CurrentMovieViewHolder>() {

    private var items = mutableListOf<ActorModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrentMovieViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_base, parent, false)
        return CurrentMovieViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CurrentMovieViewHolder, position: Int) {
        val actor = items[position]
        holder.run {
            name.text = actor.name
            image.load(actor.imageUrl)
        }
    }

    fun setItems(actors: List<ActorModel>) {
        items = actors.toMutableList()
        notifyDataSetChanged()
    }
}