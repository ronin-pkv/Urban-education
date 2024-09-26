package Kotlin.Incapsulation

class BankCard (val cardNumber: String, private val cardCode: String) {
    private val correctPassword = "1234"

    fun accessCardData(password: String) {
        if (password == correctPassword) {
            println ("Доступ разрещён. Номер карты: $cardNumber, код карты: $cardCode")
        } else {
            println("Неверный пароль. Доступ запрещен.")
        }
    }
}

fun main() {
    val myCard = BankCard("1234 5678 9101 1121", "314" )
    println("Номер карты: ${myCard.cardNumber}")
    myCard.accessCardData("1234")
    myCard.accessCardData("4321")
}