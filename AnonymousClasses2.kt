package Kotlin.AnonymousClasses

abstract class Printer (val model: String) {
    abstract fun printDocument(documentName: String)

    fun printInfo() {
        println("Модель принтера: $model")
    }
}

fun main() {
    val laserPrinter = object : Printer("Kyocera Ecosys") {
            override fun printDocument(documentName: String) {
                println("Печать документа на лазерном принтере: $documentName")
            }
    }

    val inkjetPrinter = object : Printer("Canon Pixma") {
        override fun printDocument(documentName: String) {
            println("Печать документа на струйном принтере: $documentName")
        }
    }

    laserPrinter.printInfo()
    laserPrinter.printDocument("Топосъёмка")

    inkjetPrinter.printInfo()
    inkjetPrinter.printDocument("Диаграмма Ганта")
}