package com.example.sigapapp

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class banjir : AppCompatActivity() {

    private lateinit var  back : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banjir)
        supportActionBar?.hide()

        back = findViewById(R.id.backButton)

        back.setOnClickListener{
            val intent = Intent(this@banjir, home::class.java)
            finish()
            startActivity(intent)
        }




        //ubah warna jadi putih
        val gambarBanjir = resources.getDrawable(R.drawable.flood)
        gambarBanjir.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarGempa = resources.getDrawable(R.drawable.earthquake)
        gambarGempa.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarTsunami = resources.getDrawable(R.drawable.tsunami)
        gambarTsunami.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarKembali = resources.getDrawable(R.drawable.kembali)
        gambarKembali.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)





//        gambarKembaliClick.setOnClickListener {
//            val intent = Intent(this@banjir, home::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
//            startActivity(intent)
//            finish()
//        }
// Untuk Kotlin





    }

}