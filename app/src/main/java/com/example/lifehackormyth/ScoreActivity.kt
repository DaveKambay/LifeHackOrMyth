package com.example.lifehackormyth

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score) // 🔗 Connects to activity_score.xml[cite: 1]

        val finalScore = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL", 0)

        findViewById<TextView>(R.id.txtScoreDisplay).text = "$finalScore / $total"

        val feedback = if (finalScore == total) "Master Hacker! 🧠" else "Keep learning! 📚"
        findViewById<TextView>(R.id.txtFeedback).text = feedback

        findViewById<Button>(R.id.btnReview).setOnClickListener {
            finish() // Close and return to start[cite: 1]
        }
    }
}