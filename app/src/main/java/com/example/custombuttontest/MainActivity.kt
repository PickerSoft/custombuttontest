package com.example.custombuttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onLine(view: View) {
        Toast.makeText(this,"Line~",Toast.LENGTH_LONG).show()
    }

    fun onOval(view: View) {
        Toast.makeText(this,"Oval~",Toast.LENGTH_LONG).show()
    }

    fun onRing(view: View) {
        Toast.makeText(this,"Ring~",Toast.LENGTH_LONG).show()
    }

    fun onRound(view: View) {
        Toast.makeText(this,"Round~",Toast.LENGTH_LONG).show()
    }
}