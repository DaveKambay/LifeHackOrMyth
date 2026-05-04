package com.example.lifehackormyth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 🔗 Connects to activity_main.xml

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            // Move to Quiz screen[cite: 1]
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}

