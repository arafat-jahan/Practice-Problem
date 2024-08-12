package ProbSolv

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val employeeNumber = scanner.nextInt()
    val workedHours = scanner.nextInt()
    val perhourRate = scanner.nextDouble()


    val salary = workedHours * perhourRate


    println("NUMBER = $employeeNumber")

    println("SALARY = U$ ${"%.2f".format(salary)}")
}
