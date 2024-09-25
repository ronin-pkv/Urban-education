package Kotlin.Classes

class Helicopter(val name: String, val weight: Double, val speed: Double, val maxHeight: Double)

fun main() {
    val alligator = Helicopter("Alligator", 7600.0, 310.0, 5500.0)
    println("Спроектировали вертолет с названием ${alligator.name}, скоростью полета ${alligator.speed} км/ч, весом ${alligator.weight} кг, высотой полета ${alligator.maxHeight} м.")
}