package com.example.group6miniproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signInButton: Button = findViewById(R.id.signInButton)
        val registerButton: Button = findViewById(R.id.registerButton)

        signInButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}