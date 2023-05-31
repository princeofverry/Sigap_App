package com.example.sigapapp

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    private lateinit var loginbtn : Button
    private lateinit var edituser : EditText
    private lateinit var editpword : EditText
    private lateinit var passwordBro : EditText
    private lateinit var dbHelper: DBHelper

    //bawaan
    private lateinit var signUp : TextView
    private lateinit var backButton : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        signUp = findViewById(R.id.signUp)
        loginbtn = findViewById(R.id.buttonLogin)
        edituser = findViewById(R.id.username)
        editpword = findViewById(R.id.passwordBro)
        dbHelper = DBHelper(this)


        loginbtn.setOnClickListener {
            val useredtx = edituser.text.toString()
            val passedtx = editpword.text.toString()

            if(TextUtils.isEmpty(useredtx) || TextUtils.isEmpty(passedtx)){
                Toast.makeText(this, "Add Username and Password", Toast.LENGTH_SHORT).show()
            } else {
                val checkuser = dbHelper.checkuserpass(useredtx, passedtx)
                if (checkuser == true) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext, home::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong Username & Passowrd", Toast.LENGTH_SHORT).show()
                }
            }
        }


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