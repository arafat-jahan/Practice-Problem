package `when`

fun main() {
    val month = 8
    val monthName = when (month){
        1 -> "january"
        2 -> "feb"
        3 -> "march"
        4 -> "April"
        5 -> "May"
        6 -> "june"
        7 -> "july"
        8 -> "August"
        else -> "invalid minth"


    }
    println("Month : $monthName")

}