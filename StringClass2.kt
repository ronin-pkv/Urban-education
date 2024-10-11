package Kotlin.StringClass

fun main() {
    val word = "Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке."
    val reverseWord = word.reversed()
    println("Строка \"$word\" в обратном порядке:")
    println("$reverseWord")
}