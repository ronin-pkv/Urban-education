package Kotlin

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Ticket(
    val movieTitle: String,
    val seatNumber: String,
    val sessionTime: LocalDateTime
)

class Cinema {
    private val soldTickets = mutableListOf<Ticket>()

    fun sellTicket(movieTitle: String, seatNUmber: String, sessionTime:LocalDateTime) {
        val ticket = Ticket(movieTitle, seatNUmber, sessionTime)
        soldTickets.add(ticket)
        println("Билет продан на фильм $movieTitle, место $seatNUmber, время сеанса: ${sessionTime.format(
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"))}")
    }

    fun printSoldTickets (movieTitle: String) {
        val ticketsForMovie = soldTickets.filter {it.movieTitle == movieTitle}
        if (ticketsForMovie.isEmpty()) {
            println("Билетов на фильм $movieTitle не продано.")
        } else {
            println("Проданные билеты на фильм $movieTitle:")
            for (ticket in ticketsForMovie) {
                println("Место: ${ticket.seatNumber}, время: ${ticket.sessionTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"))}")
            }
        }
    }
}

fun main() {
    val cinema = Cinema()

    cinema.sellTicket("Граф Монте-Кристо", "6-12", LocalDateTime.of(2024, 10, 2, 20, 30 ))
    cinema.sellTicket("Субстанция", "3-3", LocalDateTime.of(2024, 10, 6, 16, 0,0))
    cinema.sellTicket("Команда монстров", "5-7", LocalDateTime.of(2024, 10, 15, 10, 25))

    cinema.printSoldTickets("Граф Монте-Кристо")
}