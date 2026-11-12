// Código original
// Enunciado:
// O banco XXX concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. Fazer um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor do crédito.
// SALDO MÉDIO               PERCENTUAL
// de 0 a 500                nenhum crédito
// de 501 a 1000             30% do valor do saldo médio
// de 1001 a 3000            40% do valor do saldo médio
// acima de 3001             50% do valor do saldo médio
//
// prog se55
// real saldomedio, credito;
// imprima "\ndigite saldo media: ";
// leia saldomedio;
// se( saldomedio < 501. )
// { credito <- 0.; }
// senao
// { se(saldomedio < 1001.)
//   { credito <- saldomedio * 0.3;}
//   senao
//   { se(saldomedio < 3001.)
//     { credito <- saldomedio * 0.4;}
//     senao
//     { credito <- saldomedio * 0.5;}
//   }
// }
// se(credito <> 0.)
// { imprima "\nComo seu saldo era de: ", saldomedio, " seu credito sera de: ", credito; }
// senao
// { imprima "\nComo seu saldo era de: ", saldomedio, ", voce nao tera nenhum credito"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite saldo médio: ")
    val saldomedio = readLine()?.toDoubleOrNull() ?: return

    val credito = when {
        saldomedio <= 500.0 -> 0.0
        saldomedio <= 1000.0 -> saldomedio * 0.3
        saldomedio <= 3000.0 -> saldomedio * 0.4
        else -> saldomedio * 0.5
    }

    if (credito > 0.0) {
        println("\nComo seu saldo era de: ${"%.2f".format(saldomedio)} seu crédito será de: ${"%.2f".format(credito)}")
    } else {
        println("\nComo seu saldo era de: ${"%.2f".format(saldomedio)}, voce não terá nenhum crédito")
    }
}