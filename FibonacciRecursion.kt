fun main() {
    println("How many Fibonacci numbers you want to see?")
    val limit = readLine()!!.toInt()

    println("\nDisplaying 1st $limit Fibonacci numbers")
    for (i in 1..limit) print("${fibonacci(i)} ")
    println()
}

fun fibonacci(num: Int): Int =
    when (num) {
        1 -> 0
        2 -> 1
        else -> fibonacci(num - 1) + fibonacci(num - 2)
    }
