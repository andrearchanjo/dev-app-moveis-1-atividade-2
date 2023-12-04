package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.atividade02.utils.NavigationUtils

class CalculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val editTextOperator1: EditText = findViewById(R.id.editTextOperador1)
        val editTextOperator2: EditText = findViewById(R.id.editTextOperador2)
        val btnCalculo: Button = findViewById(R.id.btnCalculo)

        btnCalculo.setOnClickListener {
            val message = intent.getStringExtra("message").toString()
            val operador1 = editTextOperator1.text.toString().toDoubleOrNull()
            val operador2 = editTextOperator2.text.toString().toDoubleOrNull()

            if (operador1 != null && operador2 != null) {
                NavigationUtils.navigateToActivity(
                    this,
                    ResponseActivity::class.java,
                    "message" to message,
                    "operador1" to operador1,
                    "operador2" to operador2
                )
            } else {
                Toast.makeText(this, "É necessário preencher os dois campos!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}