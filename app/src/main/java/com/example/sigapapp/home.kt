package com.example.sigapapp

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.transition.Slide
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text


class home : AppCompatActivity() {
    private lateinit var citySearch: EditText
    private lateinit var kota: TextView
    private lateinit var temperatureV: TextView
    private lateinit var rounded_corner: TextView
    private lateinit var bencanaBanjirSatu : TextView
    private lateinit var bencanaBanjirDua : TextView
    private lateinit var bencanaGempaSatu : TextView
    private lateinit var bencanaGempaDua : TextView
    private lateinit var bencanaTsunami : TextView
    private lateinit var buttonProfile : ImageButton


    private fun initComponents(){
        citySearch = findViewById(R.id.citySearch)
        kota = findViewById(R.id.kota)
        temperatureV = findViewById(R.id.tv_temperature)
        rounded_corner = findViewById(R.id.rounded_corner)
        bencanaBanjirSatu = findViewById(R.id.bencanaSatuBanjir)
        bencanaBanjirDua = findViewById(R.id.bencanaDuaBanjir)
        bencanaGempaSatu = findViewById(R.id.bencanaSatuGempa)
        bencanaGempaDua = findViewById(R.id.bencanaDuaGempa)
        bencanaTsunami = findViewById(R.id.bencanaTsunami)
        buttonProfile = findViewById(R.id.buttonProfile)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        initComponents()

        //ubah warna jadi putih
        val gambarBanjir = resources.getDrawable(R.drawable.flood)
        gambarBanjir.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarGempa = resources.getDrawable(R.drawable.earthquake)
        gambarGempa.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        val gambarTsunami = resources.getDrawable(R.drawable.tsunami)
        gambarTsunami.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP)

        citySearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val randomNumber = (26..32).random()
                val randomConvert = randomNumber.toString() + ("°").toString()
                kota.text = s
                temperatureV.text = randomConvert
            }

            override fun afterTextChanged(s: Editable?) {}



        })

        rounded_corner.setOnClickListener{
            val intent = Intent(this@home, Prediciton::class.java)
            finish()
            startActivity(intent)


        }

        bencanaBanjirSatu.setOnClickListener{
            val intent = Intent(this@home, banjir::class.java)
            finish()
            startActivity(intent)
        }

        bencanaBanjirDua.setOnClickListener{
            val intent = Intent(this@home, banjir::class.java)
            finish()
            startActivity(intent)
        }

        bencanaGempaSatu.setOnClickListener {
            val intent = Intent(this@home, gempa::class.java)
            finish()
            startActivity(intent)
        }

        bencanaGempaDua.setOnClickListener {
            val intent = Intent(this@home, gempa::class.java)
            finish()
            startActivity(intent)
        }

        bencanaTsunami.setOnClickListener {
            val intent = Intent(this@home, tsunami::class.java)
            finish()
            startActivity(intent)
        }

        buttonProfile.setOnClickListener{
            val intent = Intent(this@home, login::class.java )
            finish()
            startActivity(intent)
        }


}

    override fun onBackPressed() {
        if (isTaskRoot) {
            finish()
        }
}}