fun main() {
    println("How many numbers you want to enter?")
    val arrSize = readLine()!!.toInt()
    val array = IntArray(arrSize)

    for (i in array.indices) {
        println("\nEnter element #${i + 1}")
        array[i] = readLine()!!.toInt()
    }

    println("\nThe inputted array is as follows:")
    array.forEach { print("$it ") }
    println()

    for (`_` in 0 until arrSize - 1) {
        for (i in 0 until arrSize - 1) {
            if (array[i] > array[i + 1]) {
                val temp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = temp
            }
        }
    }

    println("\nThe bubble sorted array is as follows:")
    array.forEach { print("$it ") }
    println()
}
