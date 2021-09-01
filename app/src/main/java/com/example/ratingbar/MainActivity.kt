package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton_id)

        val rating_bar = findViewById<RatingBar>(R.id.rating_bar_id)

        boton.setOnClickListener {
            val ratingBarValue = rating_bar.rating
            Toast.makeText(this@MainActivity, "poder " + ratingBarValue, Toast.LENGTH_LONG).show()

        }
    }
}