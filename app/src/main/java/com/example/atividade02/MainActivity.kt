package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMessage: EditText = findViewById(R.id.editTextMessage)
        val btnSendMessage: Button = findViewById(R.id.btnSendMessage)

        btnSendMessage.setOnClickListener {
            val message = editTextMessage.text.toString()

            val intent = Intent(this, ResponseActivity::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }
    }
}