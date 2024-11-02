package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dessertactivity : AppCompatActivity() {
    private lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dessertactivity)
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

        val chickencard: CardView = findViewById(R.id.gulabcard)
        chickencard.setOnClickListener {
            val intent = Intent(applicationContext, gulabacti::class.java)
            startActivity(intent)
        }
        val chickencar: CardView = findViewById(R.id.moticard)
        chickencar.setOnClickListener {
            val intent = Intent(applicationContext, motiacti::class.java)
            startActivity(intent)
        }
        val hickencar: CardView = findViewById(R.id.kulficard)
        hickencar.setOnClickListener {
            val intent = Intent(applicationContext, kulfiacti::class.java)
            startActivity(intent)
        }
        val ickencar: CardView = findViewById(R.id.kalakandcard)
        ickencar.setOnClickListener {
            val intent = Intent(applicationContext, kalakandacti::class.java)
            startActivity(intent)
        }
        val hickencr: CardView = findViewById(R.id.kheercard)
        hickencr.setOnClickListener {
            val intent = Intent(applicationContext, kheeracti::class.java)
            startActivity(intent)
        }
        val hickncar: CardView = findViewById(R.id.rajbhogcard)
        hickncar.setOnClickListener {
            val intent = Intent(applicationContext, rajbhogacti::class.java)
            startActivity(intent)
        }
        val hicncar: CardView = findViewById(R.id.rasgullacard)
        hicncar.setOnClickListener {
            val intent = Intent(applicationContext, rasgullaacti::class.java)
            startActivity(intent)
        }
        val hickenar: CardView = findViewById(R.id.misticard)
        hickenar.setOnClickListener {
            val intent = Intent(applicationContext, mistidoiacti::class.java)
            startActivity(intent)
        }
        val ncar: CardView = findViewById(R.id.kajucard)
       ncar.setOnClickListener {
            val intent = Intent(applicationContext, kajukatliacti::class.java)
            startActivity(intent)
        }
        val hickear: CardView = findViewById(R.id.mysurucard)
        hickear.setOnClickListener {
            val intent = Intent(applicationContext, mysuractivity::class.java)
            startActivity(intent)
        }

    }
}