package Kotlin.Interfaces

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    val a = 56
    val b = 98
    println("НОД($a, $b) = ${gcd(a, b)}")
}