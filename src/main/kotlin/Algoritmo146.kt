// Código original
// Enunciado:
// Fazer um algoritmo que leia o percurso em quilômetros, o tipo do carro e informe o consumo estimado de combustível, sabendo-se que um carro tipo A faz 12 km com um litro de gasolina, um tipo B faz 9 km e o tipo C, 8 km por litro. (Nota: o enunciado original menciona C duas vezes, mas a lógica usa A=12 ou 8, B=9 e C=8/12 conforme o padrão de rendimentos).
//
// prog se57
// real percurso, consumo;
// string tipo;
// imprima "\ndigite tipo de carro( A / B / C): ";
// leia tipo;
// imprima "\ndigite percurso: ";
// leia percurso;
// se (tipo == "C" || tipo == "c")
// { consumo <- percurso / 12; }
// senao
// { se ( tipo == "B" || tipo == "b")
//   { consumo <- percurso / 10; }
//   senao
//   { se ( tipo == "A" || tipo == "a")
//     { consumo <- percurso / 8; }
//     else { consumo <- 0.; }
//   }
// }
// se ( consumo <> 0.)
// { imprima "\nConsumo estimado em litros: ", formatar(consumo, 2); }
// senao
// { imprima "\nModelo inexistente"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite tipo de carro (A / B / C): ")
    val tipo = readLine()?.trim() ?: return

    print("Digite percurso: ")
    val percurso = readLine()?.toDoubleOrNull() ?: return

    // Definindo os rendimentos por km/l (A = 12, B = 9, C = 8 conforme regra padrão de eficiência decrescente ou proporcional)
    val kmPorLitro = when (tipo.uppercase()) {
        "A" -> 12.0
        "B" -> 9.0
        "C" -> 8.0
        else -> 0.0
    }

    if (kmPorLitro > 0.0) {
        val consumo = percurso / kmPorLitro
        println("\nConsumo estimado em litros: ${"%.2f".format(consumo)}")
    } else {
        println("\nModelo inexistente")
    }
}