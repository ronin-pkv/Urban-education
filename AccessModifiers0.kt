package Kotlin.AccessModifiers

class Registration {
    var email: String = ""
        get() = field.uppercase()

    var password: String = ""
        set(value) {
            if (value.length >= 6) {
                field = value
            } else {
                println("Пароль должен содержать не менее 6 символов.")
            }
        }
}

fun main() {
    val reg = Registration()
    reg.email = "example@email.com"
    reg.password = "12345"
    reg.password = "strongpassword"

    println("Email в верхнем регистре: ${reg.email}")
    println("Пароль: ${reg.password}")
}