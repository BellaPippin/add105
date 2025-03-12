open class Customer(
    val customerName: String,
    val customerPhone: String,
    val customerAddress: String,
    val squareFootage: Double
)

class Commercial(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    val propertyName: String,
    val multiProperty: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {
    val commercialRate = 5.0 / 1000

    fun calculateWeeklyCharge() {
        val baseCharge = squareFootage * commercialRate
        val totalCharge: Double
        // Add discount if multi property is true
        if (multiProperty) {
            totalCharge = baseCharge * 0.9
        } else {
            totalCharge = baseCharge
        }
        println("\nCustomer: $customerName\nPhone: $customerPhone\nAddress: $customerAddress")
        println("Property Name: $propertyName\nSquare Footage: $squareFootage sqft")
        println("Multi-Property Discount Applied: $multiProperty\nWeekly Quote: $${"%.2f".format(totalCharge)}")
    }
}

class Residential(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    val senior: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {
    val residentialRate = 6.0 / 1000

    fun calculateWeeklyCharge() {
        val baseCharge = squareFootage * residentialRate
        val totalCharge: Double
        // Add discount is customer is senior
        if (senior) {
            totalCharge = baseCharge * 0.85
        } else {
            totalCharge = baseCharge
        }
        println("\nCustomer: $customerName\nPhone: $customerPhone\nAddress: $customerAddress")
        println("Square Footage: $squareFootage sqft\nSenior Discount Applied: $senior")
        println("Weekly Quote: $${"%.2f".format(totalCharge)}")
    }
}

// Run menu
fun main() {
    while (true) {
        println("\nSelect Customer Type:\n1. Residential Customer\n2. Commercial Customer\n3. Done")
        when (readln().toInt()) {
            1 -> quoteResidentialCustomer()
            2 -> quoteCommercialCustomer()
            3 -> return
            else -> println("Invalid option. Try again!")
        }
    }
}

//Input options to create an instance and calculate the quote

//Residential
fun quoteResidentialCustomer() {
    print("Enter Customer Name: ")
    val name = readln()
    print("Enter Phone: ")
    val phone = readln()
    print("Enter Address: ")
    val address = readln()
    print("Enter Square Footage: ")
    val sqft = readln().toDouble()
    print("Is the customer a senior? (true/false): ")
    val senior = readln().toBoolean()

    val customer = Residential(name, phone, address, sqft, senior)
    customer.calculateWeeklyCharge()
}

//Commercial
fun quoteCommercialCustomer() {
    print("Enter Customer Name: ")
    val name = readln()
    print("Enter Phone: ")
    val phone = readln()
    print("Enter Address: ")
    val address = readln()
    print("Enter Square Footage: ")
    val sqft = readln().toDouble()
    print("Enter Property Name: ")
    val property = readln()
    print("Has multiple properties? (true/false): ")
    val multiProperty = readln().toBoolean()

    val customer = Commercial(name, phone, address, sqft, property, multiProperty)
    customer.calculateWeeklyCharge()
}
