import kotlin.system.exitProcess

fun main() {
    println("Enter the no. of rows and columns for the 1st matrix:")
    val (row1, col1) = readLine()!!.split(' ').map { it.toInt() }

    println("\nEnter the no. of rows and columns for the 2nd matrix:")
    val (row2, col2) = readLine()!!.split(' ').map { it.toInt() }

    if (col1 != row2) {
        println("\nMatrix multiplication is not possible")
        exitProcess(-1)
    }

    val matrix1 = Array(row1) { IntArray(col1) }
    val matrix2 = Array(row2) { IntArray(col2) }

    println("\nEnter data for 1st matrix:")
    inputArray(matrix1, row1, col1)

    println("\nEnter data for 2nd matrix:")
    inputArray(matrix2, row2, col2)

    val matrix3 = Array(row1) { IntArray(col2) }
    for (i in 0 until row1) {
        for (j in 0 until col2) {
            for (k in 0 until col1) matrix3[i][j] += matrix1[i][k] * matrix2[k][j]
        }
    }

    println("\n1st matrix:")
    printArray(matrix1, row1, col1)

    println("\n2nd matrix:")
    printArray(matrix2, row2, col2)

    println("\nResultant matrix:")
    printArray(matrix3, row1, col2)
}

fun inputArray(matrix: Array<IntArray>, row: Int, col: Int) {
    for (i in 0 until row) {
        for (j in 0 until col) {
            println()
            print("Enter element [$i][$j]: ")
            matrix[i][j] = readLine()!!.toInt()
        }
    }
}

fun printArray(matrix: Array<IntArray>, row: Int, col: Int) {
    for (i in 0 until row) {
        for (j in 0 until col) print("${matrix[i][j]} ")
        println()
    }
}
