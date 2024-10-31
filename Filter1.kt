package Kotlin.Collections

fun main() {
    val namesMap = mapOf(1 to "Анна", 2 to "Мария", 3 to "Петр", 4 to "Света")
    val endingByA = namesMap.filter {(_, value) -> value.endsWith("а")}
    println("Фильр по окончаниям на \"а\": $endingByA")
}