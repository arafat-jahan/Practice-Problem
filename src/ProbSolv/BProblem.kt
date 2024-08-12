package ProbSolv

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read four integer values A, B, C, and D
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()
    val D = scanner.nextInt()


    val DIFERENCA = A * B - C * D


    println("DIFERENCA = $DIFERENCA")
}
