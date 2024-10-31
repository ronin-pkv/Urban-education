package Kotlin.Collections

fun removeByValue(map: MutableMap<Int, String>, valueToRemove: String) {

    val keysToRemove = map.filterValues { it == valueToRemove }.keys

    for (key in keysToRemove) {
        map.remove(key)
    }
}

fun main() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")

    println("Введите имя для удаления:")
    val input = readLine() ?: ""

    removeByValue(people, input)
    println("Коллекция после удаления: $people")
}