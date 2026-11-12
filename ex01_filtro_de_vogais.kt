fun main() {
    val palavra = "Universidade"
    val vogais = "aeiou"

    for (letra in palavra) {
        // lowercase() colocar todas letras em minúsculas incluindo "U",
        // pois logicamente é diferente de "u"
        if (letra.lowercaseChar() in vogais) {
            continue // se for vogal pula pra próxima letra sem imprimir
        }
        print(letra)
    }
    println()
} 
