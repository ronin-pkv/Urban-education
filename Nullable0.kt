package Kotlin.Nullable

fun favoriteBook(book: String?) {
    if (book == null) {
        println("У меня нет любимой книги")
    } else {
        println("Моя любимая книга: $book")
    }
}

fun main() {
    val bookName: String? = null
    favoriteBook(bookName)

    val myBook: String? = "Финансист, Т.Драйзер"
    favoriteBook(myBook)
}