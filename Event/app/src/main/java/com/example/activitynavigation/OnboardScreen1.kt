package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen1)

        val button3: Button = findViewById(R.id.button3)

        button3.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, OnboardScreen2::class.java)
            startActivity(intent)
        }
    }
}
