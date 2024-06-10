
package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

 class MainActivity : AppCompatActivity() {
     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         enableEdgeToEdge()
         setContentView(R.layout.activity_main)
         //Find the button ID
         val btnNext: Button = findViewById(R.id.btnNext)
         val btnExit: Button = findViewById(R.id.btnExit)

         //Set an OnClickListener for the Next button to navigate to MainScreen
         btnNext.setOnClickListener {
             val intent = Intent(this, MainActivity2::class.java)
             startActivity(intent)
         }

         //Set OnClickListener for the exit button to close the activity
         btnExit.setOnClickListener {
             finish()
         }


     }
 }