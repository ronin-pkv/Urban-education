package Kotlin.Delegation

fun decimalToBinary(decimal: Int): String {
    return decimal.toString(2)
}

fun main() {
    val number = 42
    val binary = decimalToBinary(number)
    println("Десятичное число $number в двоичной системе: $binary")
}