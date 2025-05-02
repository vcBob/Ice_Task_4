package com.example.icetask4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreSummaryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score_summary_screen)
        //==========================================================================================
        //call components from xml folder
       val customFeedback = findViewById<TextView>(R.id.txt_CustomFeedback)
        val txtScore = findViewById<TextView>(R.id.txt_score)
        val reviewQuiz =findViewById<Button>(R.id.btn_ReviewQuiz)
        val btnExit =findViewById<Button>(R.id.btn_Exit)
        //==========================================================================================

    }
}