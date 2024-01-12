package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        val login = findViewById<Button>(R.id.register)
        login.setOnClickListener {
            val intent = Intent(this@registrasi, pw::class.java)
            startActivity(intent)
        }
    }
}