package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_plus.setOnClickListener {
            var sum : Double = number1.toString().toDouble() + number2.toString().toDouble()
            result_view.text = sum.toString()
        }

        button_divide.setOnClickListener {
            var division : Double = number1.toString().toDouble() / number2.toString().toDouble()
            result_view.text = division.toString()
        }

        button_minus.setOnClickListener {
            var sub : Double = number1.toString().toDouble() - number2.toString().toDouble()
            result_view.text = sub.toString()
        }

        button_times.setOnClickListener {
            var mult : Double = number1.toString().toDouble() * number2.toString().toDouble()
            result_view.text = mult.toString()
        }

    }
}