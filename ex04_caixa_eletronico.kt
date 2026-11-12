package ex04

fun main() {
    var saldo = 1000.0
    val valorSaque = 150.0

    while (true) {
        // se tem saldo suficiente, tira o dinheiro
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$ %.2f feito. Saldo: R$ %.2f".format(valorSaque, saldo))
        } else {
            // saldo menor que o saque, então avisa e encerra
            println("Saldo Insuficiente")
            break
        }
    }
}
