package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val txtDay: EditText = findViewById(R.id.TxtDay)
        val btnNex: Button = findViewById(R.id.btnNex)
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnPre: Button = findViewById(R.id.btnPre)
        val txtMin: EditText = findViewById(R.id.TxtMin)
        val txtMax: EditText = findViewById(R.id.TxtMax)
        val txtWheather: EditText = findViewById(R.id.TxtWheather)

        val Days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val Min = arrayOf("12","15","13","15","16","10","10")
        val Max = arrayOf("25","29","30","28","27","18","16")
        val Weathercondition= arrayOf("Sunny","Sunny","Sunny","Sunny","Cold","Sunny","Raining","Sunday")
        btnNex.setOnClickListener {
            val day = txtDay.text.toString()
            val Min = txtMin.text.toString()
            val Max = txtMax.text.toString()
            val wheather=txtWheather.text.toString()
        }

        btnNex.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        btnClear.setOnClickListener { txtDay.text.clear()
        }
        btnPre.setOnClickListener { finish()
        }

    }
}