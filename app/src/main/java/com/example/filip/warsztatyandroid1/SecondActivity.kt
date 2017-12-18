package com.example.filip.warsztatyandroid1

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val stringExtra = intent.getStringExtra("extraString")

        val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In vulputate erat in velit sodales, vel efficitur augue consectetur. Nulla pharetra erat eu auctor lobortis."

        val list: List<String> = loremIpsum.toUpperCase().split(" ").sorted()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list )

        list_view.adapter = adapter
    }
}
