package com.example.atividade02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atividade02.data.helpers.toOperacaoNumerica
import com.example.atividade02.utils.NavigationUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMessage: EditText = findViewById(R.id.editTextMessage)
        val btnSendMessage: Button = findViewById(R.id.btnSendMessage)

        btnSendMessage.setOnClickListener {
            val message = editTextMessage.text.toString()
            val operacaoNumerica = message.toOperacaoNumerica()

            if (operacaoNumerica != null) {
                NavigationUtils.navigateToActivity(
                    this,
                    CalculoActivity::class.java,
                    "message" to message
                )
            } else {
                NavigationUtils.navigateToActivity(
                    this,
                    ResponseActivity::class.java,
                    "message" to message
                )
            }
        }
    }
}