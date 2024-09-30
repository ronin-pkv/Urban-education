package Kotlin.NestedInner

class Head {
    fun think() {
        println("Человек думает головой.")
    }

    fun eat() {
        println("Человек ест, используя рот.")
    }
}

class Legs {
    fun walk() {
        println("Человек ходит на ногах.")
    }

    fun run() {
        println("Человек бежит на ногах.")
    }
}

class Human(val name: String, val head: Head, val legs: Legs) {
    fun describeHuman() {
        println("Описание человека $name:")
        head.think()
        head.eat()
        legs.walk()
        legs.run()
    }
}

fun main() {
    val head = Head()
    val legs = Legs()
    val human = Human("Иван", head, legs)

    human.describeHuman()
}