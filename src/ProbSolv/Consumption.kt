package ProbSolv

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val distance = scanner.nextInt()  // Read the total distance in Km
    val fuel = scanner.nextDouble()  // Read the spent fuel total in liters
    val averageFuel = distance / fuel  // Calculate average consumption
    println("%.3f km/l".format(averageFuel))  // Print the result formatted to 3 decimal places
}
