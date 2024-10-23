package com.rizal.utss

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    private lateinit var txtLogin : TextView
    private lateinit var txtBack1 : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        txtLogin = findViewById(R.id.txtlogin)
        txtBack1 = findViewById(R.id.txtBack1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtLogin.setOnClickListener(){
            val intent = Intent(this@SignUp, PageLogin::class.java)
            startActivity(intent)
        }

        txtBack1.setOnClickListener(){
            val intent = Intent(this@SignUp, WelcomeStart::class.java)
            startActivity(intent)
        }

    }
}