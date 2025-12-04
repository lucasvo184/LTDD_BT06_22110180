package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Nút điều hướng đến ViewFlipper Demo
        findViewById<com.google.android.material.button.MaterialButton>(R.id.btnViewFlipper).setOnClickListener {
            startActivity(Intent(this, ViewFlipperActivity::class.java))
        }

        // Nút điều hướng đến ViewPager2 Demo
        findViewById<com.google.android.material.button.MaterialButton>(R.id.btnViewPager).setOnClickListener {
            startActivity(Intent(this, ViewPagerActivity::class.java))
        }
    }
}