package com.example.atividade02.data.robos

import com.example.atividade02.data.interfaces.AcaoUsuario

class MarcianoPremium(val acaoUsuario: AcaoUsuario) : MarcianoAvancado() {
    override fun responda(frase: String, a: Double, b: Double) {
        if (frase.contains("agir")) {
            println("É pra já!")

            acaoUsuario.realizarAcao()
        } else {
            super.responda(frase, a, b)
        }
    }
}