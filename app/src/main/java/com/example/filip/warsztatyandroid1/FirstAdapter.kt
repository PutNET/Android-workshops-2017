package com.example.filip.warsztatyandroid1

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.movie_item.view.*

class FirstAdapter(private val movieList: List<MovieModel>,
                   private val context: Context) : RecyclerView.Adapter<FirstAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movieList[position], position)
    }

    override fun getItemCount() = movieList.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: MovieModel, position: Int) {

            itemView.movie_title.text = movie.title
            itemView.movie_genre.text = movie.genre
            itemView.movie_year.text = movie.year.toString()

            itemView.movie_item_layout.setOnClickListener {
                context.startActivity(SecondActivity.newIntent(context, movie.index))
                
//          We can either use index from model as above, or pass position on list to .bind() method in onBindViewHolder()
//                context.startActivity(SecondActivity.newIntent(context, position))
            }
        }
    }
}