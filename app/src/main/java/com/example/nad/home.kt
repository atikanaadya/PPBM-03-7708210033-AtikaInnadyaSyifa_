package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cuci = findViewById<Button>(R.id.cuci)
        cuci.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val setrika = findViewById<Button>(R.id.setrika)
        setrika.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val setrika2 = findViewById<Button>(R.id.setrika2)
        setrika2.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val selimut = findViewById<Button>(R.id.selimut)
        selimut.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val boneka = findViewById<Button>(R.id.boneka)
        boneka.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val sepatu = findViewById<Button>(R.id.sepatu)
        sepatu.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val tas = findViewById<Button>(R.id.Tas)
        tas.setOnClickListener {
            val intent = Intent(this@home, waktuu::class.java)
            startActivity(intent)
        }
        val aboutt = findViewById<TextView>(R.id.about)
        aboutt.setOnClickListener {
            val intent = Intent(this@home, about::class.java)
            startActivity(intent)
        }
        val pro = findViewById<TextView>(R.id.profile)
        pro.setOnClickListener {
            val intent = Intent(this@home, profile::class.java)
            startActivity(intent)
        }
        val berita = findViewById<TextView>(R.id.berita)
        berita.setOnClickListener {
            val intent = Intent(this@home, MainActivity::class.java)
            startActivity(intent)
        }
        val addon = findViewById<TextView>(R.id.Addon)
        addon.setOnClickListener {
            val intent = Intent(this@home, awal::class.java)
            startActivity(intent)
        }
    }
}