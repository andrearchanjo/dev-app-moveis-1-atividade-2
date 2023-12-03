package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CalculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val editTextOperator1: EditText = findViewById(R.id.editTextOperador1)
        val editTextOperator2: EditText = findViewById(R.id.editTextOperador2)
        val btnCalculo: Button = findViewById(R.id.btnCalculo)

        btnCalculo.setOnClickListener {
            val message = intent.getStringExtra("message")
            val operador1 = editTextOperator1.text.toString().toDoubleOrNull()
            val operador2 = editTextOperator2.text.toString().toDoubleOrNull()

            if (operador1 != null && operador2 != null) {
                val intent = Intent(this, ResponseActivity::class.java)
                intent.putExtra("message", message)
                intent.putExtra("operador1", operador1)
                intent.putExtra("operador2", operador2)
                startActivity(intent)
            }
        }
    }
}