fun main()
{
    print("Enter first string: ")
    val string1 = readLine() ?: ""
    print("Enter second string: ")
    val string2 = readLine() ?:""

    val uniqueString1 = getUniqueCharacter(string1)
    val uniqueString2 = getUniqueCharacter(string2)

    println("First string: $uniqueString1")
    val notUnique1 = string1.length - uniqueString1.length
    println("Second string: $uniqueString2")
    val notUnique2 = string2.length - uniqueString2.length
    val notBoth = notUnique1 + notUnique2

    val uniqueChar = uniqueString1 + uniqueString2
    val notUnique = uniqueChar.filter { char -> uniqueChar.count {it == char} == 1}
    println("Unique characters in both string: $notUnique")
    println("number of the unique character in both string: $notBoth ")

}
fun getUniqueCharacter(input: String): String{
    var uniqueChar = ""
    for (char in input)
    {
        if(input.indexOf(char) ==  input.lastIndexOf(char))
        {
            uniqueChar += char
        }
    }
    return uniqueChar
}