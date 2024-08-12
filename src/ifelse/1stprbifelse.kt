package ifelse

fun main() {
  val marks = 85
    val grade: String
    if (marks >= 90){
        grade = "A"

    }else if (marks >= 80){
        grade = "B"
    }else if(marks >= 70) {
        grade = "C"

    }else if(marks >= 60){
       grade = "D"
    }else if(marks >= 50){
        grade = "E"
    }else{
        grade = "F"
    }

println("Grade : $grade")
}

