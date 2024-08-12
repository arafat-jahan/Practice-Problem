package ProbSolv

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextDouble()
    val B = scanner.nextDouble()
    val C = scanner.nextDouble()

    val weightA = 2.0
    val weightB = 3.0
    val weightC = 5.0

    val totalWeight = 2.0+3.0+5.0


    val MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / totalWeight


    println("MEDIA = %.1f".format(MEDIA))

}
