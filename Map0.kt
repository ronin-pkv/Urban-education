package Kotlin.Collections

fun <K> countOccurrences(array: Array<K>): Map<K, Int> {

    val occurrencesMap = mutableMapOf<K, Int>()

    for (element in array) {

        occurrencesMap[element] = occurrencesMap.getOrDefault(element, 0) + 1
    }

    return occurrencesMap
}

fun main() {
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    println("Количество вхождений: ${countOccurrences(array)}")
}