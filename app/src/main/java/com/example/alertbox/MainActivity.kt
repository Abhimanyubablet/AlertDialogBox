package com.example.alertbox

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name= findViewById<EditText>(R.id.name)
        val age= findViewById<EditText>(R.id.age)
        val btn= findViewById<Button>(R.id.button)
        val sharedPreferences=getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE)
        val sharePref=sharedPreferences.edit()

        btn.setOnClickListener {
            sharePref.putString("name",name.text.toString()).commit()
            sharePref.putString("age",age.text.toString()).commit()
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}