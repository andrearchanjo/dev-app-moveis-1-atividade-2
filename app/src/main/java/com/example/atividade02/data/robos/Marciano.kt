package com.example.atividade02.data.robos

open class Marciano {
    fun responda(frase: String) {
        if (frase.trim().isEmpty()) {
            println("Não me incomode")
        } else if (frase.uppercase().contains("EU")) {
            println("A responsabilidade é sua")
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
                    println("Relaxa, eu sei o que estou fazendo!")
                } else {
                    println("Certamente")
                }
            } else {
                if (isGrito) {
                    println("Opa! Calma aí!")
                } else {
                    println("Tudo bem, como quiser")
                }
            }
        }
    }
}