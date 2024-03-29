package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val button9: Button = findViewById(R.id.button9)

        button9.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}