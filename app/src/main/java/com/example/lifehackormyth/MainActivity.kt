package com.example.lifehackormyth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// This is the first screen of your app (home/start screen)
class MainActivity : AppCompatActivity() {

    // This function runs when the app starts
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect this Kotlin file to the XML layout (activity_main.xml)
        setContentView(R.layout.activity_main)

        // Find the Start button from the UI
        val btnStart = findViewById<Button>(R.id.btnStart)

        // Set what happens when the Start button is clicked
        btnStart.setOnClickListener {

            // Create an "Intent" to move from MainActivity → QuizActivity
            val intent = Intent(this, QuizActivity::class.java)

            // Start (open) the QuizActivity screen
            startActivity(intent)
        }
    }
}
