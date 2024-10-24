package Kotlin.Infix

data class Point(val x: Int, val y: Int)

infix fun Point.isAbove(other: Point): Boolean {
    return this.y > other.y
}

infix fun Point.isRightOf(other: Point): Boolean {
    return this.x > other.x
}

fun main() {
    val point1 = Point(3, 5)
    val point2 = Point(2, 2)

    println(point1 isAbove point2)
    println(point1 isRightOf point2)
}