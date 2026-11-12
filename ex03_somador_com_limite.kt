fun main() {
    var total = 0

    for (i in 1..100) {
        // múltiplo de 10 não entra na soma, então pula
        if (i % 10 == 0) {
            continue
        }

        total += i

        // se passou de 500 para tudo, nem chega no 100
        if (total > 500) {
            println("Passou do limite no número $i")
            break
        }
    }

    println("Total final: $total")
} 
