package vcmsa.ci.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {

    // Array of flashcard questions
     val questions = arrayOf(
        "Were parts of the bible originally written in Greek.",
        "Did the Dead Sea Scrolls help confirm the accuracy of Old Testament Texts.",
        "Was Paul one of the main writers of the New Testament Letters.",
        "Did early church councils help define Christian beliefs.",
        "Was the Bible translated into English before it was written in Hebrew."
    )

    // Array of corresponding answers (true/false)
    val answers = arrayOf(true, true, true, true, true)

    // Current question index
     var currentQuestionIndex = 0

    // User score
     var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start with the welcome screen
        setContentView(R.layout.activity_welcome)

        // Set up start button click listener
        val startButton = findViewById<Button>(R.id.btn_start)
        startButton.setOnClickListener {

            // Launch the quiz activity when start is clicked
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
