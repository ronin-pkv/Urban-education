package Kotlin.Incapsulation

fun reverseDigits(number: Int): Int {
    val isNegative = number < 0
    val absNumber = Math.abs(number)
    val reversedStr = absNumber.toString().reversed()
    val reversedNumber = reversedStr.toInt()
    return if (isNegative) -reversedNumber else reversedNumber
}

fun main() {
    val number1 = 57
    val number2 = -453
    val number3 = 12345
    val reversed1 = reverseDigits(number1)
    val reversed2 = reverseDigits(number2)
    val reversed3 = reverseDigits(number3)
    println("Перестановка цифр числа $number1: $reversed1")
    println("Перестановка цифр числа $number2: $reversed2")
    println("Перестановка цифр числа $number3: $reversed3")
}