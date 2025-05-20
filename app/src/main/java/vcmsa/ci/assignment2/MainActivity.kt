package vcmsa.ci.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {

    // Array of flashcard questions
    private val questions = arrayOf(
        "Nelson Mandela became South Africa's first black president in 1994.",
        "The Berlin Wall fell in 1989.",
        "World War II lasted from 1939 to 1945.",
        "The United States landed on the moon in 1969.",
        "The French Revolution began in 1789."
    )

    // Array of corresponding answers (true/false)
    private val answers = arrayOf(true, true, true, true, true)

    // Current question index
    private var currentQuestionIndex = 0

    // User score
    private var score = 0

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
