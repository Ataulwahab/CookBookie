package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class searchActivity : AppCompatActivity() {

    private lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
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

        val chickencard: CardView = findViewById(R.id.chickencard)
        chickencard.setOnClickListener {
            val intent = Intent(applicationContext, chickenbiryaniactivity::class.java)
            startActivity(intent)
        }

        val paneercard: CardView = findViewById(R.id.paneercard)
        paneercard.setOnClickListener {
            val intent = Intent(applicationContext, shahipaneeractivity::class.java)
            startActivity(intent)
        }

        val fishcard: CardView = findViewById(R.id.fishcard)
       fishcard.setOnClickListener {
            val intent = Intent(applicationContext, fishmasalaactivity::class.java)
            startActivity(intent)
        }

        val samosacard: CardView = findViewById(R.id.samosacard)
        samosacard.setOnClickListener {
            val intent = Intent(applicationContext, samosaactivity::class.java)
            startActivity(intent)
    }

        val rajmacard: CardView = findViewById(R.id.rajmacard)
        rajmacard.setOnClickListener {
            val intent = Intent(applicationContext, rajmaactivity::class.java)
            startActivity(intent)
        }

        val butterchickencard: CardView = findViewById(R.id.butterchickencard)
        butterchickencard.setOnClickListener {
            val intent = Intent(applicationContext, butterchickactivity::class.java)
            startActivity(intent)
        }

        val dalcard: CardView = findViewById(R.id.dalcard)
        dalcard.setOnClickListener {
            val intent = Intent(applicationContext, dalmakactivity::class.java)
            startActivity(intent)
        }

        val sandeshcard: CardView = findViewById(R.id.sandeshcard)
        sandeshcard.setOnClickListener {
            val intent = Intent(applicationContext, sandeshactivity::class.java)
            startActivity(intent)
        }

        val halwacard: CardView = findViewById(R.id.badamhalwacard)
        halwacard.setOnClickListener {
            val intent = Intent(applicationContext, halwaactivity::class.java)
            startActivity(intent)
        }

        val mmushcard: CardView = findViewById(R.id.malaimushcard)
        mmushcard.setOnClickListener {
            val intent = Intent(applicationContext, mushroommactivity::class.java)
            startActivity(intent)
        }
}}