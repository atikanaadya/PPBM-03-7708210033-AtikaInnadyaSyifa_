package com.example.nad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class waktuu : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    // Use lowercase for variable names
    var hari = arrayOf("5 Jam", "1 Hari", "2 Hari")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waktuu)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.onItemSelectedListener = this

        // Use the correct variable name 'hari' instead of 'waktuu'
        val arrayAdapter: ArrayAdapter<*> =
            ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, hari)

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        val bayar = findViewById<Button>(R.id.Bayar)
        bayar.setOnClickListener {
            val intent = Intent(this@waktuu, metodeBayar::class.java)
            startActivity(intent)
        }
    }

    override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, i: Int, l: Long) {
        // Use the correct variable name 'hari' instead of 'waktuu'
        val selectedValue: String = hari[i]
        // Show a Toast with the selected value
        Toast.makeText(applicationContext, selectedValue, Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(adapterView: AdapterView<*>?) {
        // Handle case when nothing is selected
    }
}
