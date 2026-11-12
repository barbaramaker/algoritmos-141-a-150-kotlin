// Código original
// Enunciado:
// Criar um algoritmo que leia o nome e o total de pontos de três finalistas de um campeonato de pingue-pongue e exibir a colocação da seguinte forma:
// Vencedor: _________________ XXXX pts
// Segundo colocado: __________XXXX pts
// Terceiro colocado: ___________XXXX pts
//
// prog se52
// int p1, p2, p3, aux;
// string n1, n2, n3, auxn;
// imprima "\ndigite 1 nome: ";
// leia n1;
// imprima "\ndigite pontos: ";
// leia p1;
// imprima "\ndigite 2 nome: ";
// leia n2;
// imprima "\ndigite pontos: ";
// leia p2;
// imprima "\ndigite 3 nome: ";
// leia n3;
// imprima "\ndigite pontos: ";
// leia p3;
// se ( p1 < p2 )
// { aux <- p1; p1 <- p2; p2 <- aux; auxn <- n1; n1 <- n2; n2 <- auxn; }
// se ( p1 < p3 )
// { aux <- p1; p1 <- p3; p3 <- aux; auxn <- n1; n1 <- n3; n3 <- auxn; }
// se ( p2 < p3 )
// { aux <- p2; p2 <- p3; p3 <- aux; auxn <- n2; n2 <- n3; n3 <- auxn; }
// imprima "\nVENCEDOR ", n1, "  ", p1, " pontos";
// imprima "\nSEGUNDO COLOCADO : ", n2, "  ", p2, " pontos";
// imprima "\nTERCEIRO COLOCADO: ", n3, "  ", p3, " pontos";
// imprima "\n";
// fimprog

// Código em Kotlin

data class Finalista(val nome: String, val pontos: Int)

fun main() {
    val finalistas = mutableListOf<Finalista>()

    for (i in 1..3) {
        print("Digite $i nome: ")
        val nome = readLine()?.trim() ?: ""

        print("Digite pontos: ")
        val pontos = readLine()?.toIntOrNull() ?: 0

        finalistas.add(Finalista(nome, pontos))
    }

    // Ordena os finalistas por pontuação em ordem decrescente de forma idiomática
    val podium = finalistas.sortedByDescending { it.pontos }

    println("\nVencedor: ${podium[0].nome} ${podium[0].pontos} pts")
    println("Segundo colocado: ${podium[1].nome} ${podium[1].pontos} pts")
    println("Terceiro colocado: ${podium[2].nome} ${podium[2].pontos} pts")
}