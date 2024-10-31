package Kotlin.Collections

fun main() {
    val prizeMap = mapOf(15 to 25, 25 to 18, 35 to 30, 45 to 22, 50 to 12)
    val filteredPrizeMap = prizeMap.filter { (key, value) -> key % 10 == 5 && value > 20 }
    println("Фильтр по ключу, оканчивается на '5' и премия > 20: $filteredPrizeMap")
}