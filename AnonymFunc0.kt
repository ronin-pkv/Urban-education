package Kotlin.AnonymFunc

fun main() {
    val newYearGreeting = {name: String, year: Int ->
        "Дорогой(ая) $name, поздравляем с наступающим $year годом! Желаем счастья, здоровья и успехов!"
    }

    val greetingMessage = newYearGreeting("Александр", 2025)
    println(greetingMessage)
}