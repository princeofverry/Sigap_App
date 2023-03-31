package com.example.sigapapp

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BlurMaskFilter.Blur
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.renderscript.Allocation
import androidx.renderscript.Element
import androidx.renderscript.RenderScript
import androidx.renderscript.ScriptIntrinsicBlur
import com.hoko.blur.HokoBlur
import com.hoko.blur.util.BitmapUtil

class Prediciton : AppCompatActivity() {

    private lateinit var  back : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prediciton)

        supportActionBar?.hide()

        back = findViewById(R.id.backButton)

        back.setOnClickListener{
            val intent = Intent(this@Prediciton, home::class.java)
            finish()
            startActivity(intent)
        }

    }
}