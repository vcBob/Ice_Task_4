package com.example.icetask4

import android.content.Intent
import android.os.Bundle
import android.view.View
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
        val txtReview = findViewById<TextView>(R.id.txt_Review)
        val reviewQuiz =findViewById<Button>(R.id.btn_ReviewQuiz)
        val btnExit =findViewById<Button>(R.id.btn_Exit)
        val btnHideReview = findViewById<Button>(R.id.btn_HideReview)
        //==========================================================================================


        btnExit.setOnClickListener{finishAffinity()}
        reviewQuiz.setOnClickListener{
            txtReview.visibility = View.VISIBLE
            reviewQuiz.visibility= View.INVISIBLE
            btnHideReview.visibility= View.VISIBLE

            txtReview.text = "(1).Harry Potter has less than 1 million fans world wide. false (2).Pirates of the Caribbean's main protaganist is Jack Sparrow. true (3).IT was first releast in cinimas in 2024. false (4).The Minecraft movie is not about the video game mine craft. false (5). Stan Lee is the man behind the creation of the super-hero Spider-Man. true"
        }
        btnHideReview.setOnClickListener{
            txtReview.visibility = View.INVISIBLE
            reviewQuiz.visibility= View.VISIBLE
            btnHideReview.visibility= View.INVISIBLE}
    }
}