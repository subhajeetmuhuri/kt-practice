fun main() {
    println("Enter any two numbers for GCD calculation:")
    val (num1, num2) = readLine()!!.split(' ').map { it.toInt() }

    println("\nGCD of $num1 and $num2 is ${gcd(num1, num2)}")
}

tailrec fun gcd(num1: Int, num2: Int): Int {
    return if (num1 % num2 == 0) num2 else gcd(num2, num1 % num2)
}
