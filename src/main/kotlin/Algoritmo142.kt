// Código original
// Enunciado:
// Em um campeonato nacional de arco-e-flecha, tem-se equipes de três jogadores para cada estado. Sabendo-se que os arqueiros de uma equipe não obtiveram o mesmo número de pontos, criar um algoritmo que informe se uma equipe foi classificada, de acordo com a seguinte especificação:
// - ler os pontos obtidos por cada jogador da equipe;
// • mostrar esses valores em ordem decrescente;
// • se a soma dos pontos for maior do que 100, imprimir a média aritmética entre eles; senão, imprimir a mensagem "Equipe desclassificada".
//
// prog se53
// int p1, p2, p3, aux, soma;
// imprima "\n Digite os pontos do primeiro jogador: ";
// leia p1;
// imprima "\n Digite os pontos do segundo jogador: ";
// leia p2;
// imprima "\n Digite os pontos do terceiro jogador: ";
// leia p3;
// se(p1 > p2)
// { aux <- p1 ; p1 <- p2; p2 <- aux; }
// se(p1 > p3)
// { aux <- p1 ; p1 <- p3; p3 <- aux; }
// se(p2 > p3)
// { aux <- p2 ; p2 <- p3; p3 <- aux; }
// imprima "\n p1=", p1, "\n p2=",p2, "\n p3=", p3;
// soma <- p1 + p2 + p3;
// se(soma > 100)
// { imprima "\nMedia=", formatar(soma/3,2);}
// senao
// { imprima "\nEquipe desclassificada!";}
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite os pontos do primeiro jogador: ")
    val p1 = readLine()?.toIntOrNull() ?: return

    print("Digite os pontos do segundo jogador: ")
    val p2 = readLine()?.toIntOrNull() ?: return

    print("Digite os pontos do terceiro jogador: ")
    val p3 = readLine()?.toIntOrNull() ?: return

    // Ordena os pontos em ordem decrescente de forma idiomática
    val pontosOrdenados = listOf(p1, p2, p3).sortedDescending()

    println("\nOrdem decrescente:")
    println("p1 = ${pontosOrdenados[0]}")
    println("p2 = ${pontosOrdenados[1]}")
    println("p3 = ${pontosOrdenados[2]}")

    val soma = pontosOrdenados.sum()

    if (soma > 100) {
        val media = soma / 3.0
        println("\nMedia = ${"%.2f".format(media)}")
    } else {
        println("\nEquipe desclassificada!")
    }
}