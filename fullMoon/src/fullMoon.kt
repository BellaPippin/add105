// Full moon calculator
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday.")
    println("The time between full moons is roughly 29 days.\n")

    val lastFullMoon: LocalDate = LocalDate.of(2025, 2, 12)

    println("The most recent full moon was on $lastFullMoon")

    val daysToFullMoon = 29
    var nextFullMoon : LocalDate = lastFullMoon.plusDays(daysToFullMoon.toLong())

    println("The next full moon will be on: ${nextFullMoon}")

}