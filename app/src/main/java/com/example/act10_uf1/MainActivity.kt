package com.example.act10_uf1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear) // Canvia a activity_main_relative o activity_main_constraint segons el layout

        val submitButton: Button = findViewById(R.id.buttonSubmit)
        submitButton.setOnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        }
    }
}
