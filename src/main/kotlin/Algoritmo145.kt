// Código original
// Enunciado:
// A biblioteca de uma universidade deseja fazer um algoritmo que leia o nome do livro que será emprestado, o tipo de usuário (professor ou aluno) e possa imprimir um recibo conforme mostrado a seguir. Considerar que o professor tem dez dias para devolver o livro e o aluno só três dias.
// Nome do livro
// Tipo de usuário:
// Total de Dias:
//
// prog se56
// string livro, tipo;
// int dia;
// imprima "\ndigite nome do livro: ";
// leia livro;
// imprima "\ndigite: professor / aluno: ";
// leia tipo;
// se( tipo == "professor" || tipo == "Professor" || tipo == "PROFESSOR")
// { dia <- 10 ;}
// senao
// { se( tipo == "aluno" || tipo == "Aluno" || tipo == "ALUNO")
//   { dia <- 3 ;}
//   senao
//   { dia <- 0;}
// }
// se( dia == 0)
// { imprima "\n Tipo de usuario desconhecido";}
// senao
// { imprima " \nnome do livro: ", livro;
//   imprima "\nnome tipo de usuário: ", tipo;
//   imprima "\ntotal de dias: ", dia;
// }
// imprima " \n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite nome do livro: ")
    val livro = readLine()?.trim() ?: return

    print("Digite: professor / aluno: ")
    val tipo = readLine()?.trim() ?: return

    // Utiliza lowercase() para padronizar e aceitar qualquer variação de maiúsculas/minúsculas
    val dias = when (tipo.lowercase()) {
        "professor" -> 10
        "aluno" -> 3
        else -> 0
    }

    if (dias == 0) {
        println("\nTipo de usuário desconhecido")
    } else {
        println("\nNome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dias")
    }
}