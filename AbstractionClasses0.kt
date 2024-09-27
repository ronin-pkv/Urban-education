package Kotlin.AbstractionClasses

abstract class Shop(val name: String, val location: String, val openingHours: String) {

    fun shopInfo() {
        println("Магазин: $name, Расположение: $location, Часы работы: $openingHours")
    }

    abstract fun openShop()
    abstract fun closeShop()
}

class Magnit(name: String, location: String, openingHours: String) : Shop(name, location, openingHours) {
    override fun openShop() {
        println("$name открыт. Добро пожаловать в Магнит!")
    }

    override fun closeShop() {
        println("$name закрыт. Спасибо за покупки в Магните!")
    }
}

class Pyaterochka(name: String, location: String, openingHours: String) : Shop(name, location, openingHours) {
    override fun openShop() {
        println("$name открыт. Добро пожаловать в Пятерочку!")
    }

    override fun closeShop() {
        println("$name закрыт. Спасибо за покупки в Пятерочке!")
    }
}

fun main() {
    val magnit = Magnit("Магнит", "ул. Ленина, 5", "08:00 - 22:00")
    val pyaterochka = Pyaterochka("Пятерочка", "ул. Гагарина, 10", "09:00 - 23:00")

    magnit.shopInfo()
    magnit.openShop()
    magnit.closeShop()

    pyaterochka.shopInfo()
    pyaterochka.openShop()
    pyaterochka.closeShop()
}