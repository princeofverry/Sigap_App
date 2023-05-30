package com.example.sigapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.TextView

class register : AppCompatActivity() {
    private lateinit var backButton : TextView
    private lateinit var passwordRegister1 : EditText
    private lateinit var passwordRegister2 : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        val passwordEditTextFirst = findViewById<EditText>(R.id.passwordRegister1)
        passwordEditTextFirst.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        passwordEditTextFirst.transformationMethod = PasswordTransformationMethod.getInstance()

        val passwordEditTextSecond = findViewById<EditText>(R.id.passwordRegister2)
        passwordEditTextSecond.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        passwordEditTextSecond.transformationMethod = PasswordTransformationMethod.getInstance()

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this@register, login::class.java)
            finish()
            startActivity(intent)
        }

    }
}