package com.rizal.utss

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeStart : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_start)

        btnLogin = findViewById(R.id.btnLogIn)
        btnSignUp = findViewById(R.id.btnSigUp)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin.setOnClickListener(){
            val intent = Intent(this@WelcomeStart, PageLogin::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener(){
            val intent = Intent(this@WelcomeStart, SignUp::class.java)
            startActivity(intent)
        }


    }
}