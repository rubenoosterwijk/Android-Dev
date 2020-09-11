package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers() {
        var answer1 = binding.et1.text.toString()
        var answer2 = binding.et2.text.toString()
        var answer3 = binding.et3.text.toString()
        var answer4 = binding.et4.text.toString()
        var submittedAnswers = listOf(answer1,answer2,answer3,answer4)

        var correctAnswers = 0
        val answers = listOf("T","F","F","F")
        var i: Int = 0

        for(answer in submittedAnswers){
            if (answer == answers[i]){
                correctAnswers++
            }
            i++
        }
        Toast.makeText(this, "Correct Answers: "+correctAnswers, Toast.LENGTH_SHORT).show()
    }
}