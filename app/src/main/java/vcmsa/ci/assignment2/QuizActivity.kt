package vcmsa.ci.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private val questions = arrayOf(
        "Were parts of the bible originally written in Greek.",
        "Did the Dead Sea Scrolls help confirm the accuracy of Old Testament Texts.",
        "Was Paul one of the main writers of the New Testament Letters.",
        "Did early church councils help define Christian beliefs.",
        "Was the Bible translated into English before it was written in Hebrew."
    )

    private val answers = arrayOf(true, true, true, true, false)

    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionText: TextView = findViewById(R.id.question_text)
        val trueButton: Button = findViewById(R.id.true_button)
        val falseButton: Button = findViewById(R.id.false_button)

        // Display the first question
        questionText.text = questions[currentQuestionIndex]

        // Set click listener for True button
        trueButton.setOnClickListener {
            checkAnswer(true, questionText, trueButton, falseButton)
        }

        // Set click listener for False button
        falseButton.setOnClickListener {
            checkAnswer(false, questionText, trueButton, falseButton)
        }
    }

    private fun checkAnswer(
        userAnswer: Boolean,
        questionView: TextView,
        trueBtn: Button,
        falseBtn: Button
    ) {
        // Check if correct
        if (userAnswer == answers[currentQuestionIndex]) {
            score++
        }

        // Move to next question
        currentQuestionIndex++

        // Check if there are more questions
        if (currentQuestionIndex < questions.size) {
            // Show next question
            questionView.text = questions[currentQuestionIndex]
            trueBtn.isEnabled = true
            falseBtn.isEnabled = true
        } else {
            // Go to ScoreActivity
            val intent = Intent(this, ScoreActivity::class.java).apply {
                putExtra("USER_SCORE", score)
            }
            startActivity(intent)
            finish()
        }
    }
}