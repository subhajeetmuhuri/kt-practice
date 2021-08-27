fun main() {
    println("Enter the number you want to get reverse of:")
    val inputNumStr = readLine()!!
    val reversedNum = inputNumStr.reversed().toInt()

    println("\nReverse of $inputNumStr is $reversedNum")
}
