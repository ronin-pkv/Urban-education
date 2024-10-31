package Kotlin.Collections

data class Person(val name: String, val age: Int, val position: String)

fun main() {

    val personHashMap = hashMapOf(
        1 to Person("Иван", 30, "Менеджер"),
        2 to Person("Анна", 25, "Разработчик"),
        3 to Person("Петр", 40, "Директор")
    )
    
    println("Список сотрудников:")
    personHashMap.forEach { (key, person) ->
        println("$key: $person")
    }
}