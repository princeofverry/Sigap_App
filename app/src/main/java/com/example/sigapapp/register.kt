package com.example.sigapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class register : AppCompatActivity() {
    private lateinit var backButton : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this@register, login::class.java)
            finish()
            startActivity(intent)
        }


    }
}