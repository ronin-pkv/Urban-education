package Kotlin.Collections

fun main() {
    val words = listOf("абрикос", "яблоко", "авокадо", "барбос", "боулинг", "банан", "водка", "ветер", "выдра", "грязь", "галоша", "гусь", "дом", "дым", "дама")
    val groupByFirst = words.groupBy { it.first() }
    println(groupByFirst)
}