package ProbSolv

import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)


    val a =  scanner.nextInt()
    val b =  scanner.nextInt()
    val c = scanner.nextInt()
    val greatestAB = (a + b + abs (a-b)) / 2
    val greatest = (greatestAB +c + abs(greatestAB - c)) / 2
    println("$greatest eh oh maior")
    }
