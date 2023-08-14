package Exercises

import kotlin.random.Random

class Author(val name: String, val surname: String, val mail: String)

open class Book {
    var isbn: String
    var title: String
    var author: Author
    var price: Double

    constructor(isbn: String, title: String, author: Author, price: Double) {
        this.isbn = isbn
        this.title = title
        this.author = author
        this.price = price
    }

    constructor(isbn: String, title: String, author: Author) {
        this.isbn = isbn
        this.title = title
        this.author = author
        this.price = 15.25
    }
}

class EBook : Book {
    var downloadUrl: String
    var sizeMb: Double

    constructor(
        isbn: String,
        title: String,
        author: Author,
        price: Double,
        downloadUrl: String,
        sizeMb: Double
    ) : super(isbn, title, author, price) {
        this.downloadUrl = downloadUrl
        this.sizeMb = sizeMb
    }

    constructor(
        isbn: String,
        title: String,
        author: Author,
        downloadUrl: String,
        sizeMb: Double
    ) : super(isbn, title, author) {
        this.downloadUrl = downloadUrl
        this.sizeMb = sizeMb
    }
}

class PaperBook: Book{
    var shippingWeight: Int
    var inStock: Boolean

    constructor(isbn: String,
        title: String,
        author: Author,
        price: Double,
        shippingWeight: Int,
        inStock: Boolean):super(isbn, title, author, price){
            this.shippingWeight=shippingWeight
        this.inStock=inStock
        }

    constructor(isbn: String,
                title: String,
                author: Author,
                shippingWeight: Int,
                inStock: Boolean):super(isbn, title, author){
        this.shippingWeight= Random.nextInt(5,16)
        this.inStock=inStock
    }
}

fun main() {
    val author=Author("Cenker","Aydın","cenkeraydincse@gmail.com")
    val book=Book("0123214","Kotlin ile Android Development",author,199.99)
    println("Book: ${book.title}")
    println("ISBN: ${book.isbn}")
    println("Price: ${book.price}")
    println("Author Name: ${book.author.name}")
    println("Author Surname: ${book.author.surname}")
    println("Author mail: ${author.mail}")

}




