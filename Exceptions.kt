package Kotlin

class MyException(message: String) : Exception(message)

fun greeting() {
    println("Добро пожаловать в каталог пользователей")
}

fun createList(list: Array<String>) {
    try {
        print("Введите имя:")
        val firstName = readLine() ?: ""
        if (firstName.isEmpty()) throw MyException("Имя не может быть пустым")

        print("Введите фамилию:")
        val lastName = readLine() ?: ""
        if (lastName.isEmpty()) throw MyException("Фамилия не может быть пустой")

        val fullName = "$firstName $lastName"

        print("Выберите позицию в каталоге (от 0 до ${list.size - 1}):")
        val position = readLine()?.toIntOrNull() ?: throw MyException("Неверный ввод позиции")

        if (position !in list.indices) {
            throw MyException("Позиция выходит за пределы списка")
        }

        list[position] = fullName
        println("Пользователь $fullName")
    } catch (e: MyException) {
        println("Ошибка: ${e.message}")
    } catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
    }
}

fun main() {
    greeting()

    val userList = Array(10) { "" }

    while (true) {
        println("\nТекущий каталог пользователей:")
        userList.forEachIndexed { index, user -> println("Позиция $index: ${if (user.isEmpty()) "пусто" else user}") }

        createList(userList)

        print("Хотите добавить ещё пользователя? (да/нет): ")
        val response = readLine()?.lowercase() ?: ""
        if (response != "да") break
    }
}
