fun main() {
    // opções que eu simulei, em vez de digitar de verdade
    val entradas = listOf(1, 3, 2, 3, 0, 1)
    val iterador = entradas.iterator()

    while (true) {
        // se as opções acabarem sai do laço pra não dar erro
        if (!iterador.hasNext()) break

        val opcao = iterador.next()
        println("Opção escolhida: $opcao")

        when (opcao) {
            1, 2 -> println("Processando...")
            3 -> {
                println("Módulo em manutenção")
                continue // volta pro começo do laço
            }
            0 -> {
                println("Encerrando o programa")
                break
            }
            else -> println("Opção inválida")
        }
    }
}
