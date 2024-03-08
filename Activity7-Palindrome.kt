fun main() {
    while (true) {
        println("Enter a string:")
        val inputString = readLine() ?: ""

        if (isPalindrome(inputString.replace(" ", ""))) {
            println("$inputString is Palindrome")
        } else {
            println("$inputString is Not Palindrome")
        }
        print("do you want to continue? [Yes/No]: ")
        val ans = readLine()?.toLowerCase()
        if(ans == "yes")
        {
            continue
        }else{
            println("Thanks have a good day!")
            break
        }
    }
}

fun isPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}
