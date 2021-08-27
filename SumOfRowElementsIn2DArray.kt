fun main() {
    println("How many rows and columns you want to use?")
    val row = readLine()!!.toInt()
    val column = readLine()!!.toInt()
    val array = Array(row) { IntArray(column) }

    for (i in 0 until row) {
        for (j in 0 until column) {
            println("\nEnter element [$i][$j]")
            array[i][j] = readLine()!!.toInt()
        }
    }

    println("\nThe entered 2D array is as follows:")
    for (i in 0 until row) {
        for (j in 0 until column) print("${array[i][j]} ")
        println()
    }

    for (i in 0 until row) {
        println("\nSum of the elements of row ${i + 1}:")
        var sum = 0
        for (j in 0 until column) sum += array[i][j]
        println(sum)
    }
}
