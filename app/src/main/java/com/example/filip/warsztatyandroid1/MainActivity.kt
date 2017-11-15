package com.example.filip.warsztatyandroid1

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    //jako pole klasy zarówno 'val' jak i 'var' muszą być zdefiniowane od razu
    val notInitializedVal: String
    var notInitalizedVar: String

    val initializedVal: String = "First Initialize"
    var initializedVar: String = "First Initialize"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //do zmiennej typu 'var' możemy przypisać coś ponownie
        initializedVar = "Second Initialize"

        //do zmiennej typu 'val' już nie
        initializedVal = "Second Initialize"

        text_hello.text = "Warsztaty 1"


    }
}
