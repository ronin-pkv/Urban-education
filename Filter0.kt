package Kotlin.Collections

fun main() {
    val namesMap = mapOf(1 to "Иван", 2 to "Мария", 5 to "Анна", 7 to "Петр")
    val filteredByKeys = namesMap.filter { (key, _) -> key < 5 }
    println("Фильтр по ключам < 5: $filteredByKeys")
}