// Código original
// Enunciado:
// Criar um algoritmo que leia um ângulo em graus e apresente:
// • o seno do ângulo, se o ângulo pertencer a um quadrante par;
// • o co-seno do ângulo, se o ângulo pertencer a um quadrante ímpar.
//
// prog se61
// real ang, rang;
// imprima "\ndigite angulo em graus: ";
// leia ang;
// rang <- ang * pi / 180;
// se ((rang > pi/2 && rang <= pi) || (rang > 3*pi/2 && rang <= 2*pi))
// { imprima "\nseno: ", sen(rang); }
// senao
// { imprima "\nco-seno: ", cos(rang); }
// imprima "\n";
// fimprog

// Código em Kotlin

import kotlin.math.cos
import kotlin.math.sin

fun main() {
    print("Digite ângulo em graus: ")
    val ang = readLine()?.toDoubleOrNull() ?: return

    // Normaliza o ângulo para o intervalo de 0 a 360 graus para facilitar a identificação do quadrante
    val angNormalizado = ((ang % 360) + 360) % 360
    val rang = Math.toRadians(ang)

    // Identifica o quadrante com base no ângulo normalizado (0 a 360)
    // 1º quadrante: 0 < ang <= 90 (Ímpar)
    // 2º quadrante: 90 < ang <= 180 (Par)
    // 3º quadrante: 180 < ang <= 270 (Ímpar)
    // 4º quadrante: 270 < ang < 360 (Par)
    // (Caso caia exatamente nos eixos 0, 90, 180, 270, a regra original avalia pela condição em radianos)
    val eQuadrantePar = (angNormalizado > 90.0 && angNormalizado <= 180.0) || (angNormalizado > 270.0 && angNormalizado <= 360.0)

    if (eQuadrantePar) {
        println("\nSeno: ${"%.4f".format(sin(rang))}")
    } else {
        println("\nCo-seno: ${"%.4f".format(cos(rang))}")
    }
}