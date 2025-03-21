fun main() {
    var choice: Int = 0


    do {
        println("Welcome to McDonald's!")
        println("Please choose an option:")
        println("1. View Menu")
        println("2. Order Burger")
        println("3. View Prices")
        println("4. Talk to Staff")
        println("5. Exit")

        print("Enter your choice (1-5): ")

        try {
            choice = readln().toInt()

            when (choice) {
                1 -> println("You chose: View Menu")
                2 -> println("You chose: Order Burger")
                3 -> println("You chose: View Prices")
                4 -> println("You chose: Talk to Staff")
                5 -> println("You chose: Exit. Have a great day!")
                else -> println("\nInvalid choice. Please choose a number between 1 and 5.\n")
            }
        } catch (e: NumberFormatException) {
            println("\nException: That's not a number!\n")
        }
    } while (choice != 5)
}
