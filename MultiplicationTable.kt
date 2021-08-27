fun main() {
    println("Enter a number for which you want to generate the multiplication table:")
    val inputNum = readLine()!!.toInt()

    println("\nUpto which number you want to generate your multiplication table?")
    val limit = readLine()!!.toInt()

    println("\nMultiplication table of $inputNum is as follows:")
    for (i in 1..limit) println("$inputNum * $i = ${inputNum * i}")
}
