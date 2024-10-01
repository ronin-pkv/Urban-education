package Kotlin.Enum

import java.util.Scanner

enum class Month(val season: String) {
    JANUARY("Зима"),
    FEBRUARY("Зима"),
    MARCH("Весна"),
    APRIL("Весна"),
    MAY("Весна"),
    JUNE("Лето"),
    JULY("Лето"),
    AUGUST("Лето"),
    SEPTEMBER("Осень"),
    OCTOBER("Осень"),
    NOVEMBER("Осень"),
    DECEMBER("Зима");
}

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Введите месяц(например 'январь'):")
        val inputMonth = scanner.nextLine().trim().uppercase()

        val season = when (inputMonth) {
            "ЯНВАРЬ" -> Month.JANUARY.season
            "ФЕВРАЛЬ" -> Month.FEBRUARY.season
            "МАРТ" -> Month.MARCH.season
            "АПРЕЛЬ" -> Month.APRIL.season
            "МАЙ" -> Month.MAY.season
            "ИЮНЬ" -> Month.JUNE.season
            "ИЮЛЬ" -> Month.JULY.season
            "АВГУСТ" -> Month.AUGUST.season
            "СЕНТЯБРЬ" -> Month.SEPTEMBER.season
            "ОКТЯБРЬ" -> Month.OCTOBER.season
            "НОЯБРЬ" -> Month.NOVEMBER.season
            "ДЕКАБРЬ" -> Month.DECEMBER.season
            else -> "Некорректный ввод месяца"
        }

        println("Время года для месяца $inputMonth: $season")

        println("1. Продолжить; 2. Закончить работу.")
        val choice = scanner.nextLine().trim()
        if (choice == "2") {
            println("Завершение работы.")
            break
        }
    }
}

