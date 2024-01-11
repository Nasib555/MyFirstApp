package com.luqman.testapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_third)

        val myBtn: TextView = findViewById(R.id.my_button)

        myBtn.setOnClickListener {

            val myToast = Toast.makeText(this, "You clicked a btn", Toast.LENGTH_SHORT)
            myToast.show()

        }





    }
}