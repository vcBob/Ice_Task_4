package com.example.icetask4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TriviaQuestionScreen : AppCompatActivity() {
    //==========================================================================================
    //Declaration of parallel arrays.
    val arrMovie = arrayOf("Q1","Q2","Q3","Q4","Q5")
    val arrAns = arrayOf(true,false,true,false,true)
    //==========================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.trivia_question_screen)

        //==========================================================================================
        //components called from the xml folder.
        val txtQuestion = findViewById<TextView>(R.id.txt_Question)
        val txtFeedback = findViewById<TextView>(R.id.txt_Feedback)
        val btnTrue = findViewById<Button>(R.id.btn_True)
        val btnFalse = findViewById<Button>(R.id.btn_False)
        val btnNext = findViewById<Button>(R.id.btn_Next)
        //==========================================================================================

        var count = 0
        txtQuestion.text = arrMovie[count]

        btnNext.setOnClickListener{
            if (count == 4){
                val triviaPage = Intent(this,ScoreSummaryScreen::class.java)
                startActivity(triviaPage)
            }
            else{
                count++
                txtQuestion.text = arrMovie[count]}

        }
    }
}