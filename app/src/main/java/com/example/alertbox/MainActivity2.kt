package com.example.alertbox

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val sharedPreferences = getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE)
        val name=findViewById<TextView>(R.id.name)
        val age=findViewById<TextView>(R.id.age)
        val clear_name=findViewById<TextView>(R.id.clear_name)
        val clear_age=findViewById<TextView>(R.id.clear_age)
        val btn=findViewById<Button>(R.id.button)
        clear_name.text=sharedPreferences.getString("name","")
        clear_age.text=sharedPreferences.getString("age","")
        btn.setOnClickListener {
            val alertDialog= AlertDialog.Builder(this)
//            alertDialog.setTitle("Alert")
//            alertDialog.setMessage("Do you want to delete?")
//            alertDialog.setIcon(R.drawable.baseline_warning_24)
            alertDialog.setView(R.layout.alert)
            alertDialog.setPositiveButton("Yes"){
                    dialog,which->
                Toast.makeText(this,"Delete", Toast.LENGTH_SHORT).show()
            }
            alertDialog.setNegativeButton("No"){
                    dialog,which->
                Toast.makeText(this,"Not Delete", Toast.LENGTH_SHORT).show()
            }
            alertDialog.create()
            alertDialog.show()
            sharedPreferences.edit().clear().apply()
            clear_name.text=sharedPreferences.getString("name","")
            clear_age.text=sharedPreferences.getString("age","")
        }
        name.text=sharedPreferences.getString("name","")
        age.text=sharedPreferences.getString("age","")
    }
}