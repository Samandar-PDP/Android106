package uz.digital.first106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mobile_banking)
        supportActionBar?.hide()
        val spinner: Spinner = findViewById(R.id.spinner)
        val list = listOf("UZ","RU","EN","US")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        spinner.adapter = arrayAdapter
    }
}