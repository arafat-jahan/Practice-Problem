import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val distance = scanner.nextInt()
    val fuel = scanner.nextDouble()
    val averageFuel = distance / fuel
    println("%.3f km/l".format(averageFuel))
}
