package com.example.lifehackormyth

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private val questions = listOf(
        Hack("A wooden spoon stops water from boiling over.", true, "It pops bubbles!"),
        Hack("Rice fixes wet phones.", false, "Rice can actually trap moisture inside."),
        Hack("Walnuts can hide scratches on wood.", true, "The oils fill the scratch!")
    )

    private var index = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz) // 🔗 Connects to activity_quiz.xml[cite: 1]

        val txtQuestion = findViewById<TextView>(R.id.txtQuestion)
        val btnNext = findViewById<Button>(R.id.btnNext)

        fun updateUI() {
            txtQuestion.text = questions[index].statement
            btnNext.isEnabled = false
        }

        updateUI()

        fun handleAnswer(userPick: Boolean) {
            if (userPick == questions[index].isReal) {
                score++
                Toast.makeText(this, "Correct! ✅", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Myth! ❌", Toast.LENGTH_SHORT).show()
            }
            btnNext.isEnabled = true
        }

        findViewById<Button>(R.id.btnHack).setOnClickListener { handleAnswer(true) }
        findViewById<Button>(R.id.btnMyth).setOnClickListener { handleAnswer(false) }

        btnNext.setOnClickListener {
            if (index < questions.size - 1) {
                index++
                updateUI()
            } else {
                // Pass score to final screen[cite: 1]
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)
                startActivity(intent)
            }
        }
    }
}