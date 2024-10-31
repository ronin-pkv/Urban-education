package Kotlin.Collections

fun main() {
    val strings = listOf("один", "два", "три", "четыре", "пять", "шесть", "семь")
    val groupByLength = strings.groupBy { it.length }
    println(groupByLength)
}