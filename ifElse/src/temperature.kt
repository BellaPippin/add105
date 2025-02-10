fun main() {

    println("Do you have a fever???")
    print("Enter your temperature per thermometer: ")
    val temperature = readLine()!!.toDouble()

    if (temperature < 97.5) {
        println("Temperature: $temperature - Hypothermia alert!")
    } else if (temperature in 97.5..99.5) {
        println("Temperature: $temperature - This is normal!")
    } else {
        println("Temperature: $temperature - You have a fever!!")
    }
}
