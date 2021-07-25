package com.websarva.wings.android.randomint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_start)
        button.setOnClickListener(SetResult())

    }

    private inner class SetResult : View.OnClickListener{
        override fun onClick(v: View?) {
            val min = findViewById<EditText>(R.id.ed_min)
            val max = findViewById<EditText>(R.id.ed_max)
            val result = findViewById<TextView>(R.id.text_result)
            val tx_error = findViewById<TextView>(R.id.text_error)

            tx_error.text = ""

            try {
                val min_int: Int = if (min.text.toString() != "") {
                    Integer.parseInt(min.text.toString())
                } else {
                    1
                }
                val max_int: Int = if (max.text.toString() != "") {
                    Integer.parseInt(max.text.toString())
                } else {
                    6
                }

                if (min_int <= max_int) {
                    result.text = "%,d".format((min_int..max_int).random())
                } else {
                    tx_error.text = "最小値と最大値が間違っています。"
                }
            }catch(e:NumberFormatException){
                tx_error.text = "入力された数値が大きすぎます。"
            }
        }
    }

}