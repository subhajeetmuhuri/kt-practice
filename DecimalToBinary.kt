fun main() {
    println("Enter your decimal number:")
    val decimal = readLine()!!.toInt()

    println("\n$decimal in binary is ${decimal.toUInt().toString(2)}")
}
