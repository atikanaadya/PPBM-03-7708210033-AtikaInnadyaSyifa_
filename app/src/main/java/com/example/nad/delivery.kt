package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class delivery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)

        val kirim = findViewById<ImageButton>(R.id.kirim)
        kirim.setOnClickListener {
            val intent = Intent(this@delivery, home::class.java)
            startActivity(intent)
            finish()
        }
        val login = findViewById<ImageButton>(R.id.pikap)
        login.setOnClickListener {
            val intent = Intent(this@delivery, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}