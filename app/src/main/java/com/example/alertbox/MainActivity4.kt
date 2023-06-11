package com.example.alertbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val txt=findViewById<TextView>(R.id.Text)
        val Dialog= AlertDialog.Builder(this)
//        Dialog.setTitle("Remove user")
//        Dialog.setMessage("Are you sure you want to remove user?")
//        Dialog.setIcon(R.drawable.baseline_warning_amber_24)
        Dialog.setView(R.layout.alert)
        Dialog.setPositiveButton("Yes"){
                dialog,which->txt.text="Exit"
        }
        Dialog.setNegativeButton("No"){
                dialog,which->txt.text="Welcome !"
        }
        Dialog.create()
        Dialog.show()
    }
}