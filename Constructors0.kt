package Kotlin.Constructors

class Box(val width: Double, val height: Double, val depth: Double) {

    fun calculateVolume(): Double {
        return width * height * depth
    }
}

fun main() {
    val box = Box(3.5, 4.0, 5.0)
    val volume = box.calculateVolume()
    println("Объем коробки: $volume кубических единиц")
}