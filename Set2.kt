package Kotlin.Collections

fun <T> removeDuplicates(collection: Collection<T>?): Set<T> {

    return collection?.toSet() ?: emptySet()
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    println("Уникальные элементы: ${removeDuplicates(numbers)}")
}