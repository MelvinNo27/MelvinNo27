fun main() {
    while(true){
        print("Enter Your Age: ")
        val Age = readLine()?.toInt() ?: 0
        if (Age % 2 == 0) {
            print("$Age is even!\n")
            for (i in Age downTo 2 step 2) {
                print("$i ")
            }
        } else {
            print("$Age is Odd\n")
            for (i in Age downTo 1 step 2) {
                print("$i ")
            }
        }
        print("\nDo you want to continue? [Yes/No]: ")
        val ans = readLine()?.toLowerCase()
        if (ans == "Yes")
        {
            continue
        }else{
            print("Thanks!")
            break

        }
    }
}