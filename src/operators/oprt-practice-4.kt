package operators

fun main(){
    val isRaining = true
    val isSunny = false
    val andResult = isRaining && isSunny
    println("AND Result : $andResult")

    val orResult = isRaining && isSunny
    println("OR Result : $orResult")
    val notResult =  !isRaining
    println("NOT Result : notResult")
}