package Kotlin.Override

fun findUpperCaseChars(str: String) {
    val upperCaseChars = str.filter { it.isUpperCase() }
    println("Символы в верхнем регистре: $upperCaseChars")
    println("Количество символов в верхнем регистре: ${upperCaseChars.length}")
}

fun main() {
    val str = "ПриВет, кАк деЛа"
    findUpperCaseChars(str)
}