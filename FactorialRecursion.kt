fun main() {
    println("Enter the number you want to get factorial of:")
    val inputNum = readLine()!!.toInt()

    println("\nFactorial of $inputNum is ${factorial(inputNum)}")
}

fun factorial(num: Int): Long {
    return if (num <= 1) 1L else num * factorial(num - 1)
}
