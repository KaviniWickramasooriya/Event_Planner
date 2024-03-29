package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen3)

        val button5: Button = findViewById(R.id.button5)

        button5.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}