package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class drinksactivity : AppCompatActivity() {
    private lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_drinksactivity)
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
        val chickencard: CardView = findViewById(R.id.lassicard)
        chickencard.setOnClickListener {
            val intent = Intent(applicationContext, lassiactivity::class.java)
            startActivity(intent)
        }
        val chicencard: CardView = findViewById(R.id.chaascard)
        chicencard.setOnClickListener {
            val intent = Intent(applicationContext, chaasactivity::class.java)
            startActivity(intent)
        }
        val chickencar: CardView = findViewById(R.id.espcard)
        chickencar.setOnClickListener {
            val intent = Intent(applicationContext, espressoacti::class.java)
            startActivity(intent)
        }
        val hickencard: CardView = findViewById(R.id.lemonadecard)
        hickencard.setOnClickListener {
            val intent = Intent(applicationContext,lemoactivity::class.java)
            startActivity(intent)
        }
        val chckencard: CardView = findViewById(R.id.cocktailcard)
        chckencard.setOnClickListener {
            val intent = Intent(applicationContext, cocktailacti::class.java)
            startActivity(intent)
        }
        val chickenca: CardView = findViewById(R.id.jalapenocard)
        chickenca.setOnClickListener {
            val intent = Intent(applicationContext, jalapenoact::class.java)
            startActivity(intent)
        }
        val chickncard: CardView = findViewById(R.id.thandaicard)
        chickncard.setOnClickListener {
            val intent = Intent(applicationContext, thandaiactiv::class.java)
            startActivity(intent)
        }
        val chicncard: CardView = findViewById(R.id.tomatillocard)
        chicncard.setOnClickListener {
            val intent = Intent(applicationContext, tomatilloactivity::class.java)
            startActivity(intent)
        }
        val chiccard: CardView = findViewById(R.id.colcofcard)
        chiccard.setOnClickListener {
            val intent = Intent(applicationContext, coldcoffeeactivity::class.java)
            startActivity(intent)
        }
        val rd: CardView = findViewById(R.id.smoothcard)
        rd.setOnClickListener {
            val intent = Intent(applicationContext, smoothieacti::class.java)
            startActivity(intent)
        }
    }
}