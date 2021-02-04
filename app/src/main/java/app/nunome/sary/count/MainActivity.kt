package app.nunome.sary.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0

        numberTextView.text = "0"

        plusButton.setOnClickListener {
            number = number + 1
            numberTextView.text = number.toString()

            if (number % 3 == 0) {
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }

        minusButton.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()

            if (number % 3 == 0) {
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }

        clearButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()

            if (number % 3 == 0) {
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }
    }
}