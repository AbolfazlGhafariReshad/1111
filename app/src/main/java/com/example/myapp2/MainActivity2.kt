package com.example.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txt_view2 = findViewById<TextView>(R.id.ac_home_txtview2)
        val a = " "

        val bundle: Bundle? = intent.extras
        txt_view2.text = bundle!!.get("name").toString() + a + bundle!!.get("first").toString()


    }
}