fun main() {
    print("Enter a number between 1 and 10: ")
    val number = readLine()!!.toInt()

    when (number) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        6 -> println("Seis")
        7 -> println("Siete")
        8 -> println("Ocho")
        9 -> println("Nueve")
        10 -> println("Diez")
        else -> println("Invalid number! Please enter a number between 1 and 10.")
    }
}
