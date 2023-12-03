package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.atividade02.data.classes.AcaoPersonalizada
import com.example.atividade02.data.robos.MarcianoPremium

class ResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)

        val tvResponse: TextView = findViewById(R.id.textViewResponse)
        val btnBack: Button = findViewById(R.id.btnBack)

        val message = intent.getStringExtra("message")

        val acaoUsuario = AcaoPersonalizada()
        val marciano = MarcianoPremium(acaoUsuario)
        
        tvResponse.text = marciano.responda(message ?: "")

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}