package Kotlin.FunctionTypes

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }

    return n * factorial(n - 1)
}

fun main() {
    val number = 9
    println("Факториал числа $number: ${factorial(number)}")
}