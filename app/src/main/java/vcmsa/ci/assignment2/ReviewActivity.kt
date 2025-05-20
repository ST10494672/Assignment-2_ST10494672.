package vcmsa.ci.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class ReviewActivity : AppCompatActivity() {

    // Array of flashcard questions
    private val questions = arrayOf(
        "Were parts of the bible originally written in Greek.",
        "Did the Dead Sea Scrolls help confirm the accuracy of Old Testament Texts.",
        "Was Paul one of the main writers of the New Testament Letters.",
        "Did early church councils help define Christian beliefs.",
        "Was the Bible translated into English before it was written in Hebrew."
    )

    // Array of corresponding answers (true/false)
    private val answers = arrayOf(true, true, true, true, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewContent = findViewById<TextView>(R.id.review_content)
        val backButton = findViewById<Button>(R.id.back_button)

        // Build the review page with all questions and answers
        val reviewText = StringBuilder("Review Your Answers:\n\n")
        for (i in questions.indices) {
            reviewText.append("${i + 1}. ${questions[i]}\n")
            reviewText.append("Correct answer: ${if (answers[i]) "True" else "False"}\n\n")
        }

        reviewContent.text = reviewText.toString()

        // Set click listener for Back button
        backButton.setOnClickListener {
            // Go back to score screen
            onBackPressed()
        }
    }
}