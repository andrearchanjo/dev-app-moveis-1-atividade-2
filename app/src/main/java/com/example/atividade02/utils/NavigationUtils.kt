package com.example.atividade02.utils

import android.content.Context
import android.content.Intent

object NavigationUtils {
    fun navigateToActivity(context: Context, targetActivity: Class<*>, vararg keyValuePairs: Pair<String, Any>) {
        val intent = Intent(context, targetActivity)

        for ((key, value) in keyValuePairs) {
            when (value) {
                is String -> intent.putExtra(key, value)
                is Int -> intent.putExtra(key, value)
                is Double -> intent.putExtra(key, value)
                else -> throw IllegalArgumentException("Tipo de dado não suportado: ${value.javaClass.simpleName}")
            }
        }

        context.startActivity(intent)
    }
}