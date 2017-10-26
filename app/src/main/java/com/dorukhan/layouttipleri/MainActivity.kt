package com.dorukhan.layouttipleri

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            button.setVisibility(View.GONE)
            button2.setVisibility(View.VISIBLE)

        }
        button2.setOnClickListener{
            button2.setVisibility(View.GONE)
            button.setVisibility(View.VISIBLE)

        }
    }
}
