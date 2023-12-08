package com.example.atividade02.data.robos

import com.example.atividade02.data.interfaces.AcaoUsuario

class MarcianoPremium(val acaoUsuario: AcaoUsuario) : MarcianoAvancado() {
    override fun responda(frase: String, a: Double, b: Double): String {
        if (frase.contains("agir")) {
            return acaoUsuario.realizarAcao()
        }
        return super.responda(frase, a, b)
    }
}