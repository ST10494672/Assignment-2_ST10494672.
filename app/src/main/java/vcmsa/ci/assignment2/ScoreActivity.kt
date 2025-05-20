package vcmsa.ci.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreText: TextView = findViewById(R.id.score_text)
        val feedbackText: TextView = findViewById(R.id.feedback_text)
        val reviewButton: Button = findViewById(R.id.review_button)
        val exitButton: Button = findViewById(R.id.exit_button)

        val score = intent.getIntExtra("USER_SCORE", 0)
        scoreText.text = "You got $score out of 5 questions correct!"

        if (score >= 3) {
            feedbackText.text = "Great job!"
        } else {
            feedbackText.text = "Keep practicing!"
        }

        reviewButton.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}