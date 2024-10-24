package Kotlin.Scope

class City(var name: String) {
    var population: Int = 0
}

fun main() {
    val city1 = City("Краснодар").apply {
        population = 1_138_654
    }
    val city2 = City("Ростов-на-Дону").apply {
        population = 1_140_487
    }
    println("Город: ${city1.name}, население: ${city1.population} человек")
    println("Город: ${city2.name}, население: ${city2.population} человек")
}