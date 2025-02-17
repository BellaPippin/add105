
fun sayHello(name: String, ph: String) {
    println("""
        Hello $name, I've saved your phone number as $ph.
    """.trimIndent())
}

fun sayHello(name: String, ph: String, bizName: String) {
    println("""
        Hello $name, we've saved your business as $bizName.
        We've saved your phone number as $ph.'
    """.trimIndent())
}

fun main(){

    println("Are you a residential or business customer?")
    println("R or B: ")
    val userChoice= readln()

    if(userChoice.equals("R")){
        println("Enter name: ")
        val customerName= readln()

        println("Enter phone number: ")
        val phoneNumber= readln()

        sayHello(customerName, phoneNumber)
    } else if (userChoice.equals("B")){
        println("Enter business name: ")
        val bizName= readln()

        println("Enter name: ")
        val customerName= readln()

        println("Enter phone number: ")
        val phoneNumber= readln()

        sayHello(customerName, phoneNumber, bizName)

    } else {
        println("Something went wrong. Terminating program!")
    }



}