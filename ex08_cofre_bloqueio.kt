package ex08

fun main() {
    val senhaCorreta = "1234"
    // senhas que eu simulei, dá pra trocar pra testar outros casos
    val tentativas = listOf("0000", "1111", "2222", "1234", "1234")

    for (i in 1..5) {
        val senha = tentativas[i - 1]
        println("Tentativa $i: $senha")

        // acertou, libera e sai do laço
        if (senha == senhaCorreta) {
            println("Acesso concedido!")
            break
        }

        println("Senha incorreta")

        // errou a terceira vez: trava e não deixa tentar a 4ª e a 5ª
        if (i == 3) {
            println("Cofre travado administrativamente")
            break
        }
    }
}
