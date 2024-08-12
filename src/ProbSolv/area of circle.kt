package ProbSolv

import java.util.Scanner

fun main(args: Array<String>) {
    // Step 1: Create a Scanner object to read input from the user
    val scanner = Scanner(System.`in`)
    val R =  scanner.nextDouble()
    val pi = 3.1416

    val area  = pi * R * R
    println("A=%.4f".format(area))

}