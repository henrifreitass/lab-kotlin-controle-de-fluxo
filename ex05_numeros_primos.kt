fun main() {
    val alvo = 29
    // começa achando que é primo (menor que 2 já não é primo)
    var ehPrimo = alvo >= 2

    // testa de 2 até alvo - 1
    for (divisor in 2 until alvo) {
        // resto zero = achou um divisor, então não é primo
        if (alvo % divisor == 0) {
            ehPrimo = false
            break // não precisa testar o resto
        }
    }

    if (ehPrimo) {
        println("$alvo é primo")
    } else {
        println("$alvo não é primo")
    }
}
