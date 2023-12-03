package com.example.atividade02.data.robos

import com.example.atividade02.data.helpers.toOperacaoNumerica

open class MarcianoAvancado : Marciano() {
    open fun responda(frase: String, a: Double, b: Double) {
        val operacaoNumerica = frase.toOperacaoNumerica()
        if (operacaoNumerica != null) {
            val valor = operacaoNumerica.calcular(a, b)

            if (valor.isInfinite()) {
                println("Não é possível dividir por zero!")
            } else {
                println("Essa eu sei, o resultado é $valor")
            }
        } else {
            super.responda(frase)
        }
    }
}