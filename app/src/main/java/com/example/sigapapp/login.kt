package com.example.sigapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class login : AppCompatActivity() {
    private lateinit var passwordBro : EditText
    private lateinit var signUp : TextView
    private lateinit var backButton : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        val passwordEditText = findViewById<EditText>(R.id.passwordBro)
        passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()

        signUp = findViewById(R.id.signUp)

        signUp.setOnClickListener {
            val intent = Intent(this@login, register::class.java)
            finish()
            startActivity(intent)
        }

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this@login, home::class.java)
            finish()
            startActivity(intent)
        }
    }


}