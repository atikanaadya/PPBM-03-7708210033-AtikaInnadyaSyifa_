package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class metodeBayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metode_bayar)

        val dana = findViewById<ImageButton>(R.id.dana)
        dana.setOnClickListener {
            val intent = Intent(this@metodeBayar, delivery::class.java)
            startActivity(intent)
        }
        val ovo = findViewById<ImageButton>(R.id.ovo)
        ovo.setOnClickListener {
            val intent = Intent(this@metodeBayar, delivery::class.java)
            startActivity(intent)
        }
        val vacc = findViewById<ImageButton>(R.id.tf)
        vacc.setOnClickListener {
            val intent = Intent(this@metodeBayar, delivery::class.java)
            startActivity(intent)
        }
        val l = findViewById<ImageButton>(R.id.L)
        l.setOnClickListener {
            val intent = Intent(this@metodeBayar, delivery::class.java)
            startActivity(intent)
        }
    }
}