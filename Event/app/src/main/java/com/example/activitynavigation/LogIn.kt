package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val button7: Button = findViewById(R.id.button7)

        button7.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        val button6: Button = findViewById(R.id.button6)

        button6.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, MainInterface::class.java)
            startActivity(intent)
        }
    }
}