package com.natalvrom.calculateimcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludar)
        val btnIMC = findViewById<AppCompatButton>(R.id.btnIMC)

        btnSaludar.setOnClickListener { navegatetoFirstAppActivity() }
        btnIMC.setOnClickListener { navegatetoCalcularIMCActivity() }
    }

    private fun navegatetoCalcularIMCActivity() {
        val intent = Intent(this, CalculatorIMCActivity::class.java)
        startActivity(intent)

    }

    private fun navegatetoFirstAppActivity() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}