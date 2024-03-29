package com.example.activitynavigation
/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation

import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    //variables
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //animation
        topAnim = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.top_annimation)
        bottomAnim = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

    }
}*/


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val SPLASH_SCREEN: Long = 5000 // 5 seconds

    // Variables for animations
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_annimation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // Find views
        val imageView = findViewById<ImageView>(R.id.imageView2)
        val textView = findViewById<TextView>(R.id.textView2)

        // Apply animations to views
        imageView.startAnimation(topAnim)
        textView.startAnimation(bottomAnim)

        // Navigate to another activity after 5 seconds
        Handler().postDelayed({
            val intent = Intent(this, OnboardScreen1::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)
    }
}
