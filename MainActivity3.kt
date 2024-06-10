package com.example.weatherapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val Days =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val Min = arrayOf("12", "15", "13", "15", "16", "10", "10")
        val Max = arrayOf("25", "29", "30", "28", "27", "18", "16")
        val Weathercondition =
            arrayOf("Sunny", "Sunny", "Sunny", "Sunny", "Cold", "Sunny", "Raining", "Sunday")

        val TxtDetails: TextView = findViewById(R.id.TxtDetails)
        val txtAvrage: TextView = findViewById(BIND_ABOVE_CLIENT)
        val btnback: TextView = findViewById(taskId)
        intent.getStringArrayExtra("day")
        intent.getStringArrayExtra("Min")
        intent.getStringArrayExtra("Max")
        intent.getStringArrayExtra("Weathercondition")

        btnback.setOnClickListener{
            finish()
        }

    }
}


