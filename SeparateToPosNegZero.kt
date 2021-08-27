fun main() {
    println("How many numbers you want to enter?")
    val arrSize = readLine()!!.toInt()
    val array = IntArray(arrSize)

    for (i in array.indices) {
        println("\nEnter element #${i + 1}")
        array[i] = readLine()!!.toInt()
    }

    println("\nThe inputted numbers are as follows:")
    array.forEach { print("$it ") }
    println()

    val positiveList = ArrayList<Int>()
    val negativeList = ArrayList<Int>()
    val zeroesList = ArrayList<Int>()

    for (i in array) {
        if (i > 0) positiveList.add(i) else if (i < 0) negativeList.add(i) else zeroesList.add(i)
    }

    println("Positive numbers:")
    positiveList.forEach { print("$it ") }
    println()

    println("Negative numbers:")
    negativeList.forEach { print("$it ") }
    println()

    println("Zeroes:")
    zeroesList.forEach { print("$it ") }
    println()
}
