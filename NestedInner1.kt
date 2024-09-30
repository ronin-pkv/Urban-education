package Kotlin.NestedInner

fun findByInputSymbol(names: Array<String>, input: String) {
    val results = names.filter { it.contains(input, ignoreCase = true) }
    if (results.isNotEmpty()) {
        println("Найдено совпадение: ${results.joinToString(", ")}")
    } else {
        println("Совпадений не найдено.")
    }
}

fun main() {
    val names = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Введите символы для поиска:")
    val input = readLine() ?: ""
    findByInputSymbol(names, input)
}