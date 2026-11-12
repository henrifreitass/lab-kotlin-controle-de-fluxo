fun main() {
    var numero = 1

    // o laço roda pra sempre até eu mandar parar com o break
    while (true) {
        // tem que ser divisível por 7 E por 13 ao mesmo tempo
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Primeiro múltiplo comum de 7 e 13: $numero") // dá 91
            break // achou, então para o laço
        }
        numero++ // não achou, tenta o próximo
    }
} 
