package com.example.filip.warsztatyandroid1

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moviesList: List<MovieModel> = listOf(
                MovieModel("12 Angry Men", 96, 1957, "Crime, Drama", "Sidney Lumet"),
                MovieModel("Forrest Gump", 142, 1994, "Comedy, Drama", "Robert Zemeckis"),
                MovieModel("Alice in Wonderland", 108, 2010, "Adventure, Family, Fantasy", "Tim Burton"),
                MovieModel("American Beauty", 122, 1999, "Drama, Romance", "Sam Mendes"),
                MovieModel("American Gangster", 157, 2007, "Biography, Crime, Drama", "Ridley Scott"),
                MovieModel("Apocalypto", 139, 2006, "Action, Adventure, Drama", "Mel Gibson"),
                MovieModel("Bettlejuice", 92, 1988, "Comedy, Fantasy", "Tim Burton"),
                MovieModel("Black Swan", 108, 2010, "Drama, Thriller", "Darren Aronofsky"),
                MovieModel("Casino Royale", 144, 2006, "Action, Adventure, Thriller", "Martin Campbell"),
                MovieModel("Corpse Bride", 77, 2005, "Animation, Drama, Fantasy", "Tim Burton")
        )

        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = FirstAdapter(moviesList)

    }

}
