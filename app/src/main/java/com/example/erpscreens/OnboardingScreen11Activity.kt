package com.example.erpscreens

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class OnboardingScreen11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen11)

        val skipButton = findViewById<Button>(R.id.skipButton)
        skipButton.setBackgroundColor(Color.parseColor("#D9D9D9"))
        skipButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            startActivity(Intent(this, OnboardingScreen2Activity::class.java))
            finish()
        }


    }
}
