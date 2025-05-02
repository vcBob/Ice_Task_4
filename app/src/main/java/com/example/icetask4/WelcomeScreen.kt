package com.example.icetask4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.welcome_screen)

        // calls the components from the xml folder.
        //==========================================================================================
        val start = findViewById<Button>(R.id.btnStart)
        val info = findViewById<TextView>(R.id.txtInfo)
        //==========================================================================================

        start.setOnClickListener{
            val triviaPage = Intent(this,TriviaQuestionScreen::class.java)
            startActivity(triviaPage)
        }

    }
}