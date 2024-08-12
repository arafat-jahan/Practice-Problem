package ProbSolv

import java.util.Scanner
import kotlin.math.sqrt
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextDouble()
    val y1 = scanner.nextDouble()


    val x2 = scanner.nextDouble()
    val y2 = scanner.nextDouble()

    val distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("%.4f".format(distance))
}
