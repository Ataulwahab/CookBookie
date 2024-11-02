package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class saladactivity : AppCompatActivity() {
    private lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saladactivity)
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

        val paneercard: CardView = findViewById(R.id.crispapplecard)
        paneercard.setOnClickListener {
            val intent = Intent(applicationContext, crispsaladcativity::class.java)
            startActivity(intent)
        }
        val paneecard: CardView = findViewById(R.id.choppedsaladcard)
        paneecard.setOnClickListener {
            val intent = Intent(applicationContext, choppedsalad::class.java)
            startActivity(intent)
        }
        val panecard: CardView = findViewById(R.id.beetcard)
        panecard.setOnClickListener {
            val intent = Intent(applicationContext, beetsaladactivity::class.java)
            startActivity(intent)
        }

        val paneard: CardView = findViewById(R.id.greeksaladcard)
        paneard.setOnClickListener {
            val intent = Intent(applicationContext, greeksaladactivity::class.java)
            startActivity(intent)
        }
        val panerd: CardView = findViewById(R.id.tacosaladcard)
        panerd.setOnClickListener {
            val intent = Intent(applicationContext, tacosaladacti::class.java)
            startActivity(intent)
        }

        val panrd: CardView = findViewById(R.id.honeycard)
        panrd.setOnClickListener {
            val intent = Intent(applicationContext,honeysaladacti::class.java)
            startActivity(intent)
        }
        val panr: CardView = findViewById(R.id.colesawcard)
        panr.setOnClickListener {
            val intent = Intent(applicationContext, colesawsaladacti::class.java)
            startActivity(intent)
        }

        val pan: CardView = findViewById(R.id.capresecard)
        pan.setOnClickListener {
            val intent = Intent(applicationContext,capreseacti::class.java)
            startActivity(intent)
        }
        val panrq: CardView = findViewById(R.id.tomatocard)
        panrq.setOnClickListener {
            val intent = Intent(applicationContext, tomatosalacti::class.java)
            startActivity(intent)
        }
        val panrf: CardView = findViewById(R.id.greenchickencard)
        panrf.setOnClickListener {
            val intent = Intent(applicationContext, greenchickacticity::class.java)
            startActivity(intent)
        }

    }
}