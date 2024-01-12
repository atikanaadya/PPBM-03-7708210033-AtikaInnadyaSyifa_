package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            val intent = Intent(this@login, pw::class.java)
            startActivity(intent)
        }

        val regist = findViewById<Button>(R.id.regis)
        regist.setOnClickListener {
            val intent = Intent(this@login, registrasi::class.java)
            startActivity(intent)
        }
    }
}