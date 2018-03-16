package com.example.filip.warsztatyandroid1

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = FirstAdapter(moviesList(), this)

    }

}
