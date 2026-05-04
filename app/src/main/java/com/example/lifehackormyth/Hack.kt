package com.example.lifehackormyth

// This is a data class (used to store data neatly)
data class Hack(

    // The actual statement/question shown to the user
    val statement: String,

    // The correct answer (true = real hack, false = myth)
    val isReal: Boolean,

    // Explanation shown after answering (why it's true or false)
    val explanation: String
)
