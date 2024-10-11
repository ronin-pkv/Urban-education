package Kotlin.StringClass

fun main() {
    val stroke = "kotlin2023course"
    val countDigits = stroke.count { it.isDigit() }
    println("Количество цифр в строке \"$stroke\": $countDigits")
}