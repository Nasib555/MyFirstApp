package com.luqman.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyThirdActivity : AppCompatActivity() {

    var prop1 = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_third)

        val myButton1:TextView  = findViewById(R.id.my_button)

        myButton1.setOnClickListener {


        }




    }
}