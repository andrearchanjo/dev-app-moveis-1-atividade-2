package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.atividade02.data.classes.AcaoPersonalizada
import com.example.atividade02.data.robos.MarcianoPremium

class ResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)

        val textViewResponse: TextView = findViewById(R.id.textViewResponse)
        val btnBack: Button = findViewById(R.id.btnBack)

        val acaoUsuario = AcaoPersonalizada(this)
        val marciano = MarcianoPremium(acaoUsuario)

        val message = intent.getStringExtra("message").toString()

        val operador1 = intent.getDoubleExtra("operador1", 0.00)
        val operador2 = intent.getDoubleExtra("operador2", 0.00)

        val resposta = marciano.responda(message, operador1, operador2)

        textViewResponse.text = resposta

        if (message == "agir") {
            Toast.makeText(this, "Ação Personalizada!", Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}