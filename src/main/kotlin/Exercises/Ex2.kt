package Exercises

import java.text.SimpleDateFormat
import java.util.Date

class Ticket {
    val from: City
    val to: City
    val date: Date
    val seat: Int

    constructor(from: City, to: City, date: Date, seat: Int) {
        this.from = from
        this.to = to
        this.date = date
        this.seat = seat
    }

    constructor(from: City, to: City, seat: Int) {
        this.from = from
        this.to = to
        this.date = Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000)
        this.seat = seat
    }
}

class City(val postalCode: String, val name: String)


class Person(val name: String, val surname: String, val phoneNumber: String)

fun main() {
    val adana = City("1", "Adana")
    val antalya = City("2", "Antalya")

    val inputDate = SimpleDateFormat("yyyy MM dd")
    val travelDate = inputDate.parse("2023 09 16")
    val ticket = Ticket(adana, antalya, travelDate, 23)
    val person = Person("Cenker", "Aydın", "5368976565")
    println("Name: ${person.name}")
    println("Surname: ${person.surname}")
    println("Phone Number: ${person.phoneNumber}")
    println("From: ${ticket.from.name}")
    println("To: ${ticket.to.name}")
    println("Date: ${ticket.date}")
    println("Seat: ${ticket.seat}")

}