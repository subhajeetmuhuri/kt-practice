fun main() {
    println("Enter the number you want to get sum of its digits:")
    val strNum = readLine()!!

    var sum: Int = 0
    for (digits in strNum) sum += digits.digitToInt()

    println("Sum of the digits of $strNum is $sum")
}
