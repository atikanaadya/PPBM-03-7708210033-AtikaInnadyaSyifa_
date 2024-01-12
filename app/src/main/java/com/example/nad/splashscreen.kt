package com.example.nad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler


class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            val mainIntent = Intent(this@splashscreen, login::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }

    companion object {
        private const val SPLASH_DISPLAY_LENGTH = 3500
    }
}