package com.example.atividade02.data.robos

import com.example.atividade02.data.helpers.toOperacaoNumerica

open class MarcianoAvancado : Marciano() {
    open fun responda(frase: String, a: Double, b: Double): String {
        val operacaoNumerica = frase.toOperacaoNumerica()
        if (operacaoNumerica != null) {
            val valor = operacaoNumerica.calcular(a, b)

            if (valor.isInfinite()) {
                return "Não é possível dividir por zero!"
            }

            return "Essa eu sei, o resultado é $valor"
        } else {
            return super.responda(frase)
        }
    }
}