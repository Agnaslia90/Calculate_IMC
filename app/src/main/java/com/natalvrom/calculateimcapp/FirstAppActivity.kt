package com.natalvrom.calculateimcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstapp)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val name = findViewById<AppCompatEditText>(R.id.Name)
        btnStart.setOnClickListener{
            val name = name.text.toString()
            if (name.isNotEmpty()){
                val intent = Intent (this,ResultSaludarActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}