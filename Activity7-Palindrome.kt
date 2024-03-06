fun main()
{
    print("Enter a string: ")
    val enter = readln() ?:""

    if (isPalindrome(enter.replace("","")))
    {
        print("$enter is Palindrome")
    }else{
        print("$enter is not Palindrome")
    }
}
fun isPalindrome(str: String): Boolean{
    val length = str.length
    for (i in 0 until length / 2)
    {
        if(str[i] != str[length - i - 1])
        {
            return false
        }
    }
    return true
}