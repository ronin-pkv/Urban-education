package Kotlin.AbstractionClasses

abstract class Person(val firstName: String, val lastName: String, val age: Int) {

    fun fullName(): String {
        return "$firstName $lastName"
    }

    abstract fun work()
    abstract fun relax()
}

class Student(firstName: String, lastName: String, age: Int, val university: String) : Person(firstName, lastName, age) {
    override fun work() {
        println("$firstName учится в $university.")
    }

    override fun relax() {
        println("$firstName отдыхает, смотря фильмы.")
    }
}

class Employee(firstName: String, lastName: String, age: Int, val company: String) : Person(firstName, lastName, age) {
    override fun work() {
        println("$firstName работает в компании $company.")
    }

    override fun relax() {
        println("$firstName отдыхает на выходных.")
    }
}

fun main() {
    val student = Student("Иван", "Петров", 20, "МГУ")
    val employee = Employee("Анна", "Иванова", 30, "Google")

    println(student.fullName())
    student.work()
    student.relax()

    println(employee.fullName())
    employee.work()
    employee.relax()
}