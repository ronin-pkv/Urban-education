package Kotlin.AbstractionClasses

fun convertLength(unit: Int, lengthInMeters: Double): Pair<String, Double> {
    return when (unit) {
        1 -> "дециметрах" to lengthInMeters * 10
        2 -> "километрах" to lengthInMeters / 1000
        3 -> "метрах" to lengthInMeters
        4 -> "миллиметрах" to lengthInMeters * 1000
        5 -> "сантиметрах" to lengthInMeters * 100
        else -> throw IllegalArgumentException("Неверный номер единицы длины")
    }
}

fun main() {
    val lengthInMeters = 5.87

    for (unit in 1..5) {
        val (unitName, convertedLength) = convertLength(unit, lengthInMeters)
        println("Длина в $unitName: $convertedLength")
    }
}