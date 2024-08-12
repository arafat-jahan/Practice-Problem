package ProbSolv

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    val sellerName = scanner.nextLine()
    val fixedSalary = scanner.nextDouble()
    val totalSales = scanner.nextDouble()


    val extraIncome = totalSales * 0.15


    val totalSalary = fixedSalary + extraIncome


    println("TOTAL = R$ ${"%.2f".format(totalSalary)}")
}
