// Código original
// Enunciado:
// Criar um algoritmo que informe a quantidade total de calorias de uma refeição a partir da escolha do usuário que deverá informar o prato, a sobremesa e bebida (veja a tabela a seguir).
// PRATO: Vegetariano 180cal, Peixe 230cal, Frango 250cal, Carne 350cal
// SOBREMESA: Abacaxi 75cal, Sorvete diet 110cal, Mousse diet 170cal, Mousse chocolate 200cal
// BEBIDA: Chá 20cal, Suco de laranja 70cal, Suco de melão 100cal, Refrigerante diet 65cal
//
// prog se58
// int op, os, ob, calorias;
// calorias <- 0;
// imprima "\nDigite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: ";
// leia op;
// se(op == 1) { calorias <- calorias + 180; }
// senao { se(op == 2) { calorias <- calorias + 230; } senao { se(op == 3) { calorias <- calorias + 250; } senao { se(op == 4) { calorias <- calorias + 350; } } } }
// imprima "\nDigite 1 - Abacaxi 2 - Sorvete diet 3 - Mousse diet 4 - Mousse chocolate: ";
// leia op;
// se(op == 1) { calorias <- calorias + 75; }
// senao { se(op == 2) { calorias <- calorias + 110; } senao { se(op == 3) { calorias <- calorias + 170; } senao { se(op == 4) { calorias <- calorias + 200; } } } }
// imprima "\nDigite 1 - Chá 2 - Suco de laranja 3 - Suco de melão 4 - Refrigerante diet: ";
// leia op;
// se(op == 1) { calorias <- calorias + 20; }
// senao { se(op == 2) { calorias <- calorias + 70; } senao { se(op == 3) { calorias <- calorias + 100; } senao { se(op == 4) { calorias <- calorias + 65; } } } }
// imprima "\n Total de calorias: ", calorias;
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    var calorias = 0

    // Escolha do Prato
    print("Digite 1 - Vegetariano 2 - Peixe 3 - Frango 4 - Carne: ")
    val prato = readLine()?.toIntOrNull() ?: 0
    calorias += when (prato) {
        1 -> 180
        2 -> 230
        3 -> 250
        4 -> 350
        else -> 0
    }

    // Escolha da Sobremesa
    print("Digite 1 - Abacaxi 2 - Sorvete diet 3 - Mousse diet 4 - Mousse chocolate: ")
    val sobremesa = readLine()?.toIntOrNull() ?: 0
    calorias += when (sobremesa) {
        1 -> 75
        2 -> 110
        3 -> 170
        4 -> 200
        else -> 0
    }

    // Escolha da Bebida
    print("Digite 1 - Chá 2 - Suco de laranja 3 - Suco de melão 4 - Refrigerante diet: ")
    val bebida = readLine()?.toIntOrNull() ?: 0
    calorias += when (bebida) {
        1 -> 20
        2 -> 70
        3 -> 100
        4 -> 65
        else -> 0
    }

    println("\nTotal de calorias: $calorias cal")
}