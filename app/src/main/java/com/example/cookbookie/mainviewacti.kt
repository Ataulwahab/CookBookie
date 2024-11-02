package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainviewacti : AppCompatActivity() {
    private lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainviewacti)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        back = findViewById(R.id.backbutton)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val chickencard: CardView = findViewById(R.id.chickbircard)
        chickencard.setOnClickListener {
            val intent = Intent(applicationContext, chickenbiryaniactivity::class.java)
            startActivity(intent)
        }

        val paneercard: CardView = findViewById(R.id.shahiicard)
        paneercard.setOnClickListener {
            val intent = Intent(applicationContext, shahipaneeractivity::class.java)
            startActivity(intent)
        }

        val fishcard: CardView = findViewById(R.id.kajcard)
        fishcard.setOnClickListener {
            val intent = Intent(applicationContext, kajukatliacti::class.java)
            startActivity(intent)
        }

        val samosacard: CardView = findViewById(R.id.samsacard)
        samosacard.setOnClickListener {
            val intent = Intent(applicationContext, samosaactivity::class.java)
            startActivity(intent)
        }

        val rajmacard: CardView = findViewById(R.id.lasecard)
        rajmacard.setOnClickListener {
            val intent = Intent(applicationContext, lassiactivity::class.java)
            startActivity(intent)
        }

        val butterchickencard: CardView = findViewById(R.id.butterlcard)
        butterchickencard.setOnClickListener {
            val intent = Intent(applicationContext, butterchickactivity::class.java)
            startActivity(intent)
        }

        val dalcard: CardView = findViewById(R.id.gulcard)
        dalcard.setOnClickListener {
            val intent = Intent(applicationContext, gulabacti::class.java)
            startActivity(intent)
        }

        val sandeshcard: CardView = findViewById(R.id.csaladcard)
        sandeshcard.setOnClickListener {
            val intent = Intent(applicationContext, choppedsalad::class.java)
            startActivity(intent)
        }

        val halwacard: CardView = findViewById(R.id.badamcard)
        halwacard.setOnClickListener {
            val intent = Intent(applicationContext, halwaactivity::class.java)
            startActivity(intent)
        }

        val mmushcard: CardView = findViewById(R.id.thandaicard)
        mmushcard.setOnClickListener {
            val intent = Intent(applicationContext, thandaiactiv::class.java)
            startActivity(intent)
        }

    }
}