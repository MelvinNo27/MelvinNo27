fun main() {
    println("Enter First num:")
    val input1 = readLine()
    println("Enter Second num:")
    val input2 = readLine()

    if (input1 != null && input2 != null) {
        val number1 = input1.trim().toInt()
        val number2 = input2.trim().toInt()
        val lower = minOf(number1, number2)
        val higher = maxOf(number1, number2)
        println("Prime numbers between $lower and $higher:")
        printPrimeNumbers(lower, higher)
    } else {
        println("Invalid input. Please enter a numbers.")
    }
}

fun printPrimeNumbers(lower: Int, higher: Int) {
    for (num in lower..higher) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
