💡 LifeHackOrMyth – Native Android App

LifeHackOrMyth is a simple and fun Android app built with Kotlin that helps users tell the difference between real-life productivity hacks and common internet myths. Instead of just scrolling through tips online, users get to interact with them through a quiz-style experience that challenges their thinking.

✨ Features

Flashcard Quiz Experience
The app presents different life tips one by one, allowing users to decide whether each one is a real “hack” or just a myth.
Interactive Interface
Users can tap on “Hack” (True) or “Myth” (False) and immediately see if they got it right.
Score Tracking
The app keeps track of correct answers and calculates a final score at the end.
Personalized Feedback
Based on the user’s score, the app gives a custom message to reflect how well they did.
Review & Retry Option
Users can go back, review correct answers, or restart the quiz to improve their score.

🛠️ Tech Stack

Language: Kotlin
Platform: Android Studio
Architecture: XML Layouts with Activities (Empty Views Activity template)
CI/CD: GitHub Actions for automatic builds

📱 App Structure

The app follows a simple and clean flow across three screens:

MainActivity – Welcome screen where the user starts the quiz
QuizActivity – Displays the flashcard questions and handles user input
ScoreActivity – Shows results, feedback, and review options

🚀 How to Run the App

Clone the repository to your computer
Open it in Android Studio
Make sure JDK 17 (or higher) is installed
Run the app on an emulator or Android device (API 24 or higher)

🤖 Automated Builds

This project uses GitHub Actions to automatically build the app whenever new code is pushed. This helps ensure everything runs smoothly and is always ready for deployment.


