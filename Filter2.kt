package Kotlin.Collections

fun main() {
    val namesMap = mapOf(1 to "Григорий", 2 to "Мария", 3 to "Галина", 4 to "Светлана")
    val filteredByNamesStartingG = namesMap.filter { (_, value) -> value.startsWith("Г") }
    println("Фильтр по значению, начинается на 'Г': $filteredByNamesStartingG")
}