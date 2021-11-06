package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_name = findViewById<EditText>(R.id.ac_main_edt_name)
        val edt_first = findViewById<EditText>(R.id.ac_main_edt_namekh)
        val btn_sub = findViewById<Button>(R.id.ac_main_btn_submit)

        btn_sub.setOnClickListener {

            var intent: Intent = Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("name", edt_name.text)
            intent.putExtra("first", edt_first.text)
            startActivity(intent)

        }


    }
}