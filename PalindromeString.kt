fun main() {
    println("Enter your string:")
    val inputStr = readLine()!!
    val reversedStr = inputStr.reversed()

    if (inputStr.equals(reversedStr)) println("\n$inputStr is a palindrome string")
    else println("\n$inputStr isn't a palindrome string")
}
