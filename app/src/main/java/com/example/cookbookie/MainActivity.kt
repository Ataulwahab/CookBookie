
package com.example.cookbookie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val search = findViewById<EditText>(R.id.search)

        // Set an OnClickListener for the EditText
        search.setOnClickListener {
            // Create an Intent to launch NewActivity
            val intent = Intent(this,searchActivity::class.java)
            startActivity(intent)
            }



        val chickenImageView: ImageView = findViewById(R.id.chickennn)
        chickenImageView.setOnClickListener {
            val intent = Intent(this, specialactivity::class.java)
            startActivity(intent)
        }




        val saladImageView: ImageView = findViewById(R.id.salad)
        saladImageView.setOnClickListener {
            val intent = Intent(this, saladactivity::class.java)
            startActivity(intent)
        }

        val drinkImageView: ImageView = findViewById(R.id.drink)
        drinkImageView.setOnClickListener {
            val intent = Intent(this, drinksactivity::class.java)
            startActivity(intent)
        }
        val dessertImageView: ImageView = findViewById(R.id.dess)
        dessertImageView.setOnClickListener {
            val intent = Intent(this, dessertactivity::class.java)
            startActivity(intent)
        }

        val mainImageView: ImageView = findViewById(R.id.course)
        mainImageView.setOnClickListener {
            val intent = Intent(this,mainviewacti::class.java)
            startActivity(intent)
        }




    }
}
