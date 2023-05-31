package com.example.sigapapp

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {
    private lateinit var backButton : TextView
    private lateinit var username : TextView
    private lateinit var pword : EditText
    private lateinit var cpword : EditText
    private lateinit var signupbtn : Button
    private lateinit var dbHelper: DBHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        username = findViewById(R.id.username)
        pword = findViewById(R.id.passwordRegister1)
        cpword = findViewById(R.id.passwordRegister2)
        signupbtn = findViewById(R.id.buttonRegister)
        dbHelper= DBHelper(this)

        signupbtn.setOnClickListener{
            val unametext = username.text.toString()
            val pwordtext = pword.text.toString()
            val cpwordtext = cpword.text.toString()
            val savedata = dbHelper.insertData(unametext, pwordtext)

            if(TextUtils.isEmpty(unametext)||TextUtils.isEmpty(pwordtext)||TextUtils.isEmpty(cpwordtext)){
                Toast.makeText(this, "Add Username, Password & Confirm Password", Toast.LENGTH_SHORT).show()
            }
            else {
                if (pwordtext.equals(cpwordtext)){
                    if(savedata==true){
                        Toast.makeText(this,"Signup Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, login::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "User Exist", Toast.LENGTH_SHORT).show()
                    }
                }
                else {
                    Toast.makeText(this, "Password Not Match", Toast.LENGTH_SHORT).show()
                }
            }
        }


        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this@register, login::class.java)
            finish()
            startActivity(intent)
        }

    }
}