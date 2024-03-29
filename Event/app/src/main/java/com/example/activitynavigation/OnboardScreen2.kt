package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        val button4 : Button = findViewById(R.id.button4)

        button4.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, OnboardScreen3::class.java)
            startActivity(intent)
        }
    }
}