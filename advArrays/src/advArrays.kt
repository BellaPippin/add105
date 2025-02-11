fun main() {

    // Declarations
    val supplies = arrayOf("Hot dogs", "Buns", "Ketchup", "Mustard", "Relish")

    val inventory = arrayOf("20", "11", "0", "15", "22")

    val combArray = arrayOf<Array<String>>(supplies, inventory)

    // Search
    print("Search an item:")
    val input = readln()

    if (supplies.contains(input)) {

        //Get index of item
        val index = supplies.indexOf(input)

        //Display stock
        println("${combArray[0][index]} has ${combArray[1][index]} inventory")

        print("Type 1 to use one unit, type 2 to add 1 to current stock:")

        val choice = readln()

        // Subtract 1 from stock, display new stock.
        if (choice == "1") {
            var intStock = combArray[1][index].toInt()

            if (intStock > 0) {  // Check if stock is greater than 0 before subtracting
                intStock -= 1
                combArray[1][index] = intStock.toString()
                println("You used 1 ${combArray[0][index]}. ${combArray[0][index]} has ${combArray[1][index]} stock now.")
            } else {
                println("Not enough stock!")
            }

        } else if (choice == "2") { // Add 1 to stock
            var intStock = combArray[1][index].toInt()
            intStock += 1
            combArray[1][index] = intStock.toString()
            println("You added 1 to ${combArray[0][index]}. ${combArray[0][index]} has ${combArray[1][index]} stock now.")
        }



    } else {
        println("$input is not in the list")
    }




}