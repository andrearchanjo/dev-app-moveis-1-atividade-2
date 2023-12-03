package com.example.atividade02.data.helpers

import com.example.atividade02.data.enums.OperacaoNumerica

fun String.toOperacaoNumerica(): OperacaoNumerica? {
    return when (this.lowercase()) {
        "some" -> OperacaoNumerica.SOMA
        "subtraia" -> OperacaoNumerica.SUBTRACAO
        "multiplique" -> OperacaoNumerica.MULTIPLICACAO
        "divida" -> OperacaoNumerica.DIVISAO
        else -> null
    }
}