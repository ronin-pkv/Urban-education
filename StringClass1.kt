package Kotlin.StringClass

fun main() {
    val phoneNumber = "+79189990099"
    if (isNumberValid(phoneNumber)) {
        println("Номер телефона $phoneNumber верен")
    } else {
        println("Номер телефона $phoneNumber недопустим")
    }
}

fun isNumberValid(phone: String): Boolean {
    return (phone.startsWith("+7") && phone.length == 12 && phone.substring(2).all { it.isDigit() })
}