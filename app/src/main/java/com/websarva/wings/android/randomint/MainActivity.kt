package com.websarva.wings.android.randomint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_start)
        button.setOnClickListener {
            val min  = findViewById<TextView>(R.id.ed_min)
            val max = findViewById<TextView>(R.id.ed_max)
            val result = findViewById<TextView>(R.id.text_result)
        }

    }

}