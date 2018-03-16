package com.example.filip.warsztatyandroid1

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : Activity() {

    companion object {
        private const val MOVIE_KEY = "movie_key"
        fun newIntent(context: Context, movieIndex: Int): Intent = Intent(context, SecondActivity::class.java)
                .putExtra(MOVIE_KEY, movieIndex)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val movieIndex = intent.extras.getInt(MOVIE_KEY)
        movie_detail_title.text = moviesList().get(movieIndex).title
    }
}
