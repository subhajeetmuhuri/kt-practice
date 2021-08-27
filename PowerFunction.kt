fun main() {
    println("Enter the value of the base")
    val base = readLine()!!.toInt()

    println("\nEnter the value of the index")
    val index = readLine()!!.toInt()

    println("\n$base ^ $index = ${power(base, index)}")
}

fun power(base: Int, index: Int): Long {
    var result = 1L

    for (`_` in 1..index) result *= base
    return result
}
