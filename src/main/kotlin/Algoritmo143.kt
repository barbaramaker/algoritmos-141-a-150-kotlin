// Código original
// Enunciado:
// Criar um algoritmo que verifique a(s) letra(s) central(is) de uma palavra. Se o número de caracteres for ímpar, ele verifica se a letra central é uma vogal; caso contrário, verifica se é um dos dígrafos rr ou ss (só precisa testar letras minúsculas).
//
// prog se54
// string pal, p1, p2, p3;
// int n1, n2;
// imprima "\ndigite uma palavra: ";
// leia pal;
// se(strtam(pal) % 2 == 0)
// { n1 <- strtam(pal) div 2;
//   n2 <- n1 - 1;
//   p1 <- strelem(pal, n1);
//   p2 <- strelem(pal, n2);
//   p3 <- strconcat(p2, p1);
//   se( p3 == "rr" || p3 == "ss" )
//   { imprima "\nE rr OU ss"; }
//   senao
//   { imprima "\nNAO E rr OU ss"; }
// }
// senao
// { n1 <- strtam(pal) div 2;
//   p1 <- strelem(pal, n1);
//   se( p1 == "a" || p1 == "e" || p1 == "i" || p1 == "o" || p1 == "u")
//   { imprima "\nE VOGAL"; }
//   senao
//   { imprima "\nNAO E VOGAL"; }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite uma palavra: ")
    val pal = readLine()?.trim() ?: return

    val tamanho = pal.length
    if (tamanho == 0) {
        println("Palavra vazia.")
        return
    }

    if (tamanho % 2 == 0) {
        // Comprimento par: verifica os dois caracteres centrais
        val meio = tamanho / 2
        val p2 = pal[meio - 1]
        val p1 = pal[meio]
        val digrafo = "$p2$p1"

        if (digrafo == "rr" || digrafo == "ss") {
            println("\nE rr OU ss")
        } else {
            println("\nNAO E rr OU ss")
        }
    } else {
        // Comprimento ímpar: verifica o caractere central
        val meio = tamanho / 2
        val letraCentral = pal[meio]

        if (letraCentral in listOf('a', 'e', 'i', 'o', 'u')) {
            println("\nÉ VOGAL")
        } else {
            println("\nNÃO É VOGAL")
        }
    }
}