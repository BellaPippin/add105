import java.text.DecimalFormat

// Tip Calculator

fun calculateTipAndTaxes(subtotal: Double): Double{

    val tax = 0.25
    val tip = 0.175

    var withStuff = subtotal + (subtotal * tax) + (subtotal * tip)
    return withStuff

}


fun main() {
    var sum = 0.0

    do { // Ask for input until user enters 0, add input to sum
        println("Enter item price (enter 0 to finish):")
        val itemPrice = readln().toDouble()

        if (itemPrice != 0.0) {
            sum += itemPrice
        }

    } while (itemPrice != 0.0)

    println("Total sum of item prices: $$sum")
    println("Adding 2.5% Sales Tax...")
    println("Adding suggested gratuity of 17.5%...\n")

    val formatPlz = DecimalFormat("#.##") //Define formatting

    println("Total is: $${formatPlz.format(calculateTipAndTaxes(sum))}") // Calculate and display


}
