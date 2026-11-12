fun main() {
    for (numero in 1..50) {
        // % 10 pega o último dígito, se for 7 pula (7, 17, 27, 37, 47)
        if (numero % 10 == 7) {
            continue
        }
        print("$numero ")
    }
    println()
}
