// Full moon calculator
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    //Define a format for dates, define today.
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday.")
    println("The time between full moons is roughly 29 days.\n")

    // Last full moon
    val lastFullMoon: LocalDate = LocalDate.of(2025, 2, 12)

    println("The most recent full moon was on $lastFullMoon")

    // Calculate days to next full moon
    val daysToFullMoon = 29
    var nextFullMoon : LocalDate = lastFullMoon.plusDays(daysToFullMoon.toLong())

    println("The next full moon will be on: ${nextFullMoon}")

}