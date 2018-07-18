package cn.jonham.app.geoquiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class QuizActivity : AppCompatActivity() {

//    Button mTrueButton
//    Button mFalseButton
//    val mFalseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val mButtonTrue = findViewById(R.id.btn_true) as Button
        val mButtonFalse = findViewById(R.id.btn_false) as Button

        mButtonTrue.setOnClickListener {
            Toast.makeText(
                    this,
                    R.string.toast_text_correct,
                    Toast.LENGTH_SHORT).show()
        }
        mButtonFalse.setOnClickListener {
            Toast.makeText(
                    this,
                    R.string.toast_text_wrong,
                    Toast.LENGTH_SHORT).show()
        }

    }
}
