package com.example.lifehackormyth

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

// This screen controls the quiz logic
class QuizActivity : AppCompatActivity() {

    // List of questions (each question is a Hack object)
    private val questions = listOf(
        Hack("A wooden spoon stops water from boiling over.", true, "It pops bubbles!"),
        Hack("Rice fixes wet phones.", false, "Rice can actually trap moisture inside."),
        Hack("Walnuts can hide scratches on wood.", true, "The oils fill the scratch!")
    )

    // Keeps track of which question we are on
    private var index = 0

    // Keeps track of the user's score
    private var score = 0

    // This runs when the screen is opened
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect this Kotlin file to the XML layout
        setContentView(R.layout.activity_quiz)

        // Get UI elements from the layout
        val txtQuestion = findViewById<TextView>(R.id.txtQuestion)
        val btnNext = findViewById<Button>(R.id.btnNext)

        // Function to update the question on screen
        fun updateUI() {
            // Display the current question
            txtQuestion.text = questions[index].statement

            // Disable "Next" button until user answers
            btnNext.isEnabled = false
        }

        // Show first question when app starts
        updateUI()

        // Function to handle user's answer (true = Hack, false = Myth)
        fun handleAnswer(userPick: Boolean) {

            // Check if user answer matches correct answer
            if (userPick == questions[index].isReal) {
                score++ // increase score if correct

                // Show correct message
                Toast.makeText(this, "Correct! ✅", Toast.LENGTH_SHORT).show()
            } else {
                // Show wrong message
                Toast.makeText(this, "Myth! ❌", Toast.LENGTH_SHORT).show()
            }

            // Enable Next button after answering
            btnNext.isEnabled = true
        }

        // When "Hack" button is clicked → pass true
        findViewById<Button>(R.id.btnHack).setOnClickListener {
            handleAnswer(true)
        }

        // When "Myth" button is clicked → pass false
        findViewById<Button>(R.id.btnMyth).setOnClickListener {
            handleAnswer(false)
        }

        // When Next button is clicked
        btnNext.setOnClickListener {

            // If there are more questions → go to next one
            if (index < questions.size - 1) {
                index++       // move to next question
                updateUI()    // update screen
            } else {
                // If no more questions → go to Score screen

                val intent = Intent(this, ScoreActivity::class.java)

                // Send score data to next screen
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)

                // Open ScoreActivity
                startActivity(intent)
            }
        }
    }
}
