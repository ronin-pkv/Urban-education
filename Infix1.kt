package Kotlin.Infix

class Person(val name: String) {
    infix fun say(message: String) {
        println("$name говорит: $message")
    }
}

fun main() {
    val person = Person("Иван")
    person say "Привет, мир!"
}