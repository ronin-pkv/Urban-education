package Kotlin.Interfaces

interface Describable {
    fun getDescription(): String
}

abstract class EmergencyService(val name: String, val phone: String) {
    abstract fun performDuty()

    fun showContactInfo() {
        println("Служба: $name, Телефон: $phone")
    }
}

class FireService(name: String, phone: String) : EmergencyService(name, phone), Describable {
    override fun performDuty() {
        println("Пожарная служба тушит пожары!")
    }

    override fun getDescription(): String {
        return "Пожарная служба занимается тушением пожаров."
    }
}

class AmbulanceService(name: String, phone: String) : EmergencyService(name, phone), Describable {
    override fun performDuty() {
        println("Скорая помощь спасает жизни!")
    }

    override fun getDescription(): String {
        return "Скорая помощь занимается оказанием медицинской помощи в экстренных случаях."
    }
}

fun main() {
    val fireService = FireService("Пожарная служба", "101")
    val ambulanceService = AmbulanceService("Скорая помощь", "103")

    fireService.showContactInfo()
    println(fireService.getDescription())
    fireService.performDuty()

    ambulanceService.showContactInfo()
    println(ambulanceService.getDescription())
    ambulanceService.performDuty()
}