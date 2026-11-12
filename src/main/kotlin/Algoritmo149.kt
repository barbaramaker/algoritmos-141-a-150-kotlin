// Código original
// Enunciado:
// Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir:
// Valor da compra < R$ 10,00 -> lucro de 70%
// R$ 10,00 <= valor < R$ 30,00 -> lucro de 50%
// R$ 30,00 <= valor < R$ 50,00 -> lucro de 40%
// Valor >= R$ 50,00 -> lucro de 30%
// Criar o algoritmo que possa entrar com nome do produto e valor da compra e imprimir o nome do produto e o valor da venda.
//
// prog se60
// real vcompra, vvenda;
// string nomep;
// imprima "\ndigite nome do produto: ";
// leia nomep;
// imprima "\ndigite valor da compra: ";
// leia vcompra;
// se ( vcompra < 10. )
// { vvenda <- vcompra * 1.7; }
// senao
// { se ( vcompra < 30. )
//   { vvenda <- vcompra * 1.5; }
//   senao
//   { se ( vcompra < 50. )
//     { vvenda <- vcompra * 1.4; }
//     senao
//     { vvenda <- vcompra * 1.3; }
//   }
// }
// imprima "\n", nomep, " sera vendido por R$", formatar(vvenda, 2);
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite nome do produto: ")
    val nomep = readLine()?.trim() ?: return

    print("Digite valor da compra: ")
    val vcompra = readLine()?.toDoubleOrNull() ?: return

    // Calcula o valor da venda utilizando a expressão when com intervalos
    val vvenda = when {
        vcompra < 10.0 -> vcompra * 1.7
        vcompra < 30.0 -> vcompra * 1.5
        vcompra < 50.0 -> vcompra * 1.4
        else -> vcompra * 1.3
    }

    println("\n$nomep será vendido por R$ ${"%.2f".format(vvenda)}")
}