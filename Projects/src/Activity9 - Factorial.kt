fun main() {
    print("Enter an number:")
    val num = readLine()?.toIntOrNull()

    if (num != null) {
        if (num >= 0) {
            var factorial = 1
            var expression = ""
            for (i in num downTo 1) {
                factorial *= i
                expression +=  "$i x "
            }
            println("$num -> $expression = $factorial")
        } else {
            println("Factorial is not defined for negative numbers.")
        }
    } else {
        println("Invalid input. Please enter a valid integer.")
    }
}
