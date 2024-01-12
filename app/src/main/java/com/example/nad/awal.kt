package com.example.nad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class awal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)

        val slide = findViewById<SlideToActView>(R.id.slide)
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val _intent = Intent(this@awal, MainActivityTabLayout::class.java)
                startActivity(_intent)
            }
        }
            val _sl2 = findViewById<SlideToActView>(R.id.slide)
            _sl2.animDuration=1000
    }
}