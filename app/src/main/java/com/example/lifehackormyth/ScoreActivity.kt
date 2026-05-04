package com.example.lifehackormyth

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// This is the Score screen (last screen after quiz)
class ScoreActivity : AppCompatActivity() {

    // This function runs when the screen is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect this Kotlin file to the XML layout (UI design)
        setContentView(R.layout.activity_score)

        // Get the score passed from the previous screen (QuizActivity)
        val finalScore = intent.getIntExtra("SCORE", 0)

        // Get the total number of questions
        val total = intent.getIntExtra("TOTAL", 0)

        // Find the TextView and display the score like "3 / 5"
        findViewById<TextView>(R.id.txtScoreDisplay).text = "$finalScore / $total"

        // Decide feedback based on score
        // If user got everything correct → show "Master Hacker"
        // Otherwise → encourage them to improve
        val feedback = if (finalScore == total) {
            "Master Hacker! 🧠"
        } else {
            "Keep learning! 📚"
        }

        // Display the feedback message on screen
        findViewById<TextView>(R.id.txtFeedback).text = feedback

        // Find the button and set what happens when user clicks it
        findViewById<Button>(R.id.btnReview).setOnClickListener {

            // finish() closes this screen and goes back to previous screen
            finish()
        }
    }
}
