package Kotlin.Classes

class Pet(val type: String, val nickname: String, val weight: Double)

fun main() {
    val myPet = Pet("Собака", "Барсик", 15.5)
    println("Домашнее животное: ${myPet.type}, Кличка: ${myPet.nickname}, Вес: ${myPet.weight} кг")
}