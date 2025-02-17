// Area calculator //

// Functions

import kotlin.math.pow
import kotlin.math.PI

fun calcAreaRectangle(width: Int, height: Int): Int {
    return width * height
}

fun calcAreaCircle(radius: Double): Double {
    return PI * radius.pow(2.0)
}

fun calcAreaTriangle(base: Int, height: Int): Double {
    return 0.5 * base * height
}

fun calcAreaSquare(side: Double): Double {
    return side.pow(2.0)
}


fun main() {

    println("Welcome to the area calculator~!")
    println("Select a shape you want to calculate the area for:")

    println("""
        1.Rectangle
        2.Circle
        3.Triangle
        4.Square
    """.trimIndent())

    println("Choice: ")
    val userChoice = readln()

    when (userChoice) {
        "1" -> println("Width: 5, Height: 5..... Area: ${calcAreaRectangle(5, 5)}")
        "2" -> println("Radius: 25....Area: ${String.format("%.2f", calcAreaCircle(25.0))}")
        "3" -> println("Base: 5, Vertical Height: 10....Area: ${calcAreaTriangle(5,10)}")
        "4" -> println("Side: 3.... Area: ${calcAreaSquare(3.0)}")
        else -> {
            println("Something went wrong")
        }

}}