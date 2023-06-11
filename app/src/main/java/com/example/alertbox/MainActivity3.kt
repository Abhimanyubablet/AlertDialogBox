package com.example.alertbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val name= findViewById<TextView>(R.id.name)
        val btn= findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            name.text="Welcome"
        }
    }
}