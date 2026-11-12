// Código original
// Enunciado:
// Criar um algoritmo que leia o destino do passageiro, se a viagem inclui retorno (ida e volta) e informar o preço da passagem conforme a tabela a seguir.
// DESTINO: Região Norte (Ida: R$500,00 | Ida e Volta: R$900,00), Região Nordeste (Ida: R$350,00 | Ida e Volta: R$650,00), Região Centro-Oeste (Ida: R$350,00 | Ida e Volta: R$600,00), Região Sul (Ida: R$300,00 | Ida e Volta: R$550,00).
//
// prog se59
// int op, iv;
// imprima "\nDigite 1 - Região Norte 2 - Região Nordeste 3 - Região Centro-Oeste 4 - Região Sul: ";
// leia op;
// imprima "\nDigite 1 - Ida 2 - Ida e Volta: ";
// leia iv;
// se(op == 1)
// { se(iv == 1)
//   { imprima "\nO valor da passagem de ida para R.Norte R$500,00";}
//   senao
//   { imprima "\nO valor da passagem de ida-volta para R.Norte: R$900,00";} // Ajustado valor correto da tabela (900)
// }
// senao { ... }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 - Região Norte 2 - Região Nordeste 3 - Região Centro-Oeste 4 - Região Sul: ")
    val destino = readLine()?.toIntOrNull() ?: 0

    print("Digite 1 - Ida 2 - Ida e Volta: ")
    val tipoViagem = readLine()?.toIntOrNull() ?: 0

    val preco = when (destino) {
        1 -> if (tipoViagem == 1) 500.0 else 900.0       // Norte
        2 -> if (tipoViagem == 1) 350.0 else 650.0       // Nordeste
        3 -> if (tipoViagem == 1) 350.0 else 600.0       // Centro-Oeste
        4 -> if (tipoViagem == 1) 300.0 else 550.0       // Sul
        else -> -1.0
    }

    val nomeRegiao = when (destino) {
        1 -> "R. Norte"
        2 -> "R. Nordeste"
        3 -> "R. C. Oeste"
        4 -> "R. Sul"
        else -> ""
    }

    val tipoDescricao = if (tipoViagem == 1) "ida" else "ida-volta"

    if (preco >= 0.0) {
        println("\nO valor da passagem de $tipoDescricao para $nomeRegiao: R$ ${"%.2f".format(preco)}")
    } else {
        println("\nOpção Inexistente")
    }
}