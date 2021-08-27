fun main() {
    println("How many numbers you want to enter?")
    val array = IntArray(readLine()!!.toInt())

    for (i in array.indices) {
        println("\nEnter element #${i + 1}")
        array[i] = readLine()!!.toInt()
    }

    println("\nThe inputted array is as follows:")
    array.forEach { print("$it ") }
    println()

    println("\nGreatest number in the array is ${array.maxOrNull()}")
}
