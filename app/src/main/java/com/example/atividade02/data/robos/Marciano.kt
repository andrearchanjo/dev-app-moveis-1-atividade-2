package com.example.atividade02.data.robos

open class Marciano {
    val pergunta = "Certamente"
    val grito = "Opa! Calma aí!"
    val pergunta_grito = "Relaxa, eu sei o que estou fazendo!"
    val eu = "A responsabilidade é sua"
    val vazio = "Não me incomode"
    val outro = "Tudo bem, como quiser"
    fun responda(frase: String): String {
        if (frase.trim().isEmpty()) {
            return vazio
        } else if (frase.uppercase().contains("EU")) {
            return eu
        } else {
            val palavras: List<String> = frase.trim().replace(Regex("\\s+"), " ").split(" ")
            var isGrito: Boolean = false

            for (palavra in palavras) {
                if (palavra == palavra.uppercase()) {
                    isGrito = true
                    break
                }
            }

            if (frase.endsWith("?")) {
                if (isGrito) {
                    return pergunta_grito
                } else {
                    return pergunta
                }
            } else {
                if (isGrito) {
                    return grito
                } else {
                    return outro
                }
            }
        }
    }
}