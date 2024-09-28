package Kotlin.Override

open class Bird(val type: String) {
    open val canFly: Boolean = true

    open fun characteristic() {
        println("Тип птицы: $type, может летать: $canFly")
    }
}

class Penguin : Bird("Пингвинообразные") {
    override val canFly: Boolean = false

    override fun characteristic() {
        println("Пингвины не могут летать!")
    }
}

class Flamingo : Bird("Фламингообразные") {
    override fun characteristic() {
        println("Фламинго могут летать на большие расстояния!")
    }
}

fun main() {
    val bird1 = Penguin()
    bird1.characteristic()

    val bird2 = Flamingo()
    bird2.characteristic()
}