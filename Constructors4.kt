package Kotlin.Constructors

class Car(val mass: Double, val speed: Double) {

    fun move() {
        println("Автомобиль движется со скоростью $speed км/ч.")
    }

    fun stop() {
        println("Автомобиль остановился.")
    }
}

fun main() {
    val car = Car(1500.0, 80.0)
    car.move()
    car.stop()
}