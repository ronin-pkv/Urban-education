package Kotlin.Generics

class Person<T>(val name: String, val phone: T)

fun main() {
    val person1 = Person("Женя", 89998889988)
    val person2 = Person("Саша", "+79889998989")

    println("Person: name = ${person1.name}, phone = ${person1.phone}")
    println("Person: name = ${person2.name}, phone = ${person2.phone}")
}