package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pw : AppCompatActivity(), View.OnClickListener {

    lateinit var view_01: View
    lateinit var view_02: View
    lateinit var view_03: View
    lateinit var view_04: View
    lateinit var btn_01: Button
    lateinit var btn_02: Button
    lateinit var btn_03: Button
    lateinit var btn_04: Button
    lateinit var btn_05: Button
    lateinit var btn_06: Button
    lateinit var btn_07: Button
    lateinit var btn_08: Button
    lateinit var btn_09: Button
    lateinit var btn_00: Button
    lateinit var btn_clear: Button
    var numbers_list = ArrayList<String>()
    var passCode = ""
    var num_01: String? = null
    var num_02: String? = null
    var num_03: String? = null
    var num_04: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pw)
        initializeComponents()
    }

    private fun initializeComponents() {
        view_01 = findViewById(R.id.view_01)
        view_02 = findViewById(R.id.view_02)
        view_03 = findViewById(R.id.view_03)
        view_04 = findViewById(R.id.view_04)
        btn_01 = findViewById(R.id.btn_01)
        btn_02 = findViewById(R.id.btn_02)
        btn_03 = findViewById(R.id.btn_03)
        btn_04 = findViewById(R.id.btn_04)
        btn_05 = findViewById(R.id.btn_05)
        btn_06 = findViewById(R.id.btn_06)
        btn_07 = findViewById(R.id.btn_07)
        btn_08 = findViewById(R.id.btn_08)
        btn_09 = findViewById(R.id.btn_09)
        btn_00 = findViewById(R.id.btn_00)
        btn_clear = findViewById(R.id.btn_clear)
        btn_01.setOnClickListener(this)
        btn_02.setOnClickListener(this)
        btn_03.setOnClickListener(this)
        btn_04.setOnClickListener(this)
        btn_05.setOnClickListener(this)
        btn_06.setOnClickListener(this)
        btn_07.setOnClickListener(this)
        btn_08.setOnClickListener(this)
        btn_09.setOnClickListener(this)
        btn_00.setOnClickListener(this)
        btn_clear.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_01 -> {
                numbers_list.add("1")
                passNumber(numbers_list)
            }
            R.id.btn_02 -> {
                numbers_list.add("2")
                passNumber(numbers_list)
            }
            R.id.btn_03 -> {
                numbers_list.add("3")
                passNumber(numbers_list)
            }
            R.id.btn_04 -> {
                numbers_list.add("4")
                passNumber(numbers_list)
            }
            R.id.btn_05 -> {
                numbers_list.add("5")
                passNumber(numbers_list)
            }
            R.id.btn_06 -> {
                numbers_list.add("6")
                passNumber(numbers_list)
            }
            R.id.btn_07 -> {
                numbers_list.add("7")
                passNumber(numbers_list)
            }
            R.id.btn_08 -> {
                numbers_list.add("8")
                passNumber(numbers_list)
            }
            R.id.btn_09 -> {
                numbers_list.add("9")
                passNumber(numbers_list)
            }
            R.id.btn_00 -> {
                numbers_list.add("0")
                passNumber(numbers_list)
            }
            R.id.btn_clear -> {
                numbers_list.clear()
                passNumber(numbers_list)
            }
        }
    }

    private fun passNumber(numbers_list: ArrayList<String>) {
        // Clear backgrounds
        view_01.setBackgroundResource(R.drawable.bg_view_grey_oval)
        view_02.setBackgroundResource(R.drawable.bg_view_grey_oval)
        view_03.setBackgroundResource(R.drawable.bg_view_grey_oval)
        view_04.setBackgroundResource(R.drawable.bg_view_grey_oval)

        for (i in 0 until numbers_list.size) {
            when (i) {
                0 -> view_01.setBackgroundResource(R.drawable.bg_view_blue_oval)
                1 -> view_02.setBackgroundResource(R.drawable.bg_view_blue_oval)
                2 -> view_03.setBackgroundResource(R.drawable.bg_view_blue_oval)
                3 -> view_04.setBackgroundResource(R.drawable.bg_view_blue_oval)
            }
        }

        if (numbers_list.size == 4) {
            num_01 = numbers_list[0]
            num_02 = numbers_list[1]
            num_03 = numbers_list[2]
            num_04 = numbers_list[3]

            passCode = num_01 + num_02 + num_03 + num_04

            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}
