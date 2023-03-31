package com.example.sigapapp

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tsunami : AppCompatActivity() {
    private lateinit var  back : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tsunami)


        supportActionBar?.hide()

        back = findViewById(R.id.backButton)

        back.setOnClickListener{
            val intent = Intent(this@tsunami, home::class.java)
            finish()
            startActivity(intent)
        }


        val gambarBanjir = resources.getDrawable(R.drawable.flood)
        gambarBanjir.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarGempa = resources.getDrawable(R.drawable.earthquake)
        gambarGempa.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarTsunami = resources.getDrawable(R.drawable.tsunami)
        gambarTsunami.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarKembali = resources.getDrawable(R.drawable.kembali)
        gambarKembali.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

    }
}