/**
 * enum class PositionTitle
 * @author Maria Cosenza
 * Date: 3/11/2025
 */

enum class PositionTitle {
    Administration,
    Production,
    Sales,
    Maintenance,
    Technical,
    Secretarial
}

/**
 * class Employee
 * @author Maria Cosenza
 * Date: 3/11/2025
 * @param
 * name: Name of Employee
 * position: from enum PositionTitle, sets employee's title
 * salary: defines whether employee is salary or hourly
 * payRate: amount of hourly pay
 * shift: defines which shift the worker does.
 */

class Employee(
    val name: String,
    val position: PositionTitle,
    val salary: Boolean,
    val payRate: Double,
    val shift: Int
) {

    /**
     * function calculatePay
     * @author Maria Cosenza
     * Date: 3/11/2025
     * @param
     * hoursIn: amount of hours worked weekly
     * @return
     * totalPay: double -- calculation of pay based on shift, salary status and hours worked
     */
    fun calculatePay(hoursIn: Double): Double {
        var totalPay = 0.0

        // Adjust pay based on the shift
        var adjustedPayRate = payRate
        when (shift) {
            2 -> adjustedPayRate *= 1.05 // 5% extra
            3 -> adjustedPayRate *= 1.10 // 10% extra
        }

        // Overtime calculation
        if (!salary) {
            if (hoursIn > 40) {
                val regularHours = 40.0
                val overtimeHours = hoursIn - regularHours
                totalPay = regularHours * adjustedPayRate + overtimeHours * adjustedPayRate * 1.5
            } else {
                totalPay = hoursIn * adjustedPayRate
            }
        } else {
            totalPay = adjustedPayRate * 40
        }
        return totalPay
    }
    /**
     * function displayPayDetails
     * @author Maria Cosenza
     * Date: 3/11/2025
     * @param
     * hoursIn: amount of hours worked
     * @return
     * prints employee's information and calculated pay
     */
    fun displayPayDetails(hoursIn: Double) {
        val totalPay = calculatePay(hoursIn)
        println("Employee: $name")
        println("Position: $position")
        println("Pay Rate: $$payRate")
        println("Total earnings for the week: $$totalPay")
    }
}

/**
 * function Main
 * @author Maria Cosenza
 * Date: 3/11/2025
 *
 * runs program
 */
fun main() {
    val employee1 = Employee("Maria Cosenza", PositionTitle.Production, false, 15.0, 2)
    val employee2 = Employee("Juan Arredondo", PositionTitle.Technical, true, 60.0, 1)
    val employee3 = Employee("Lionel Arredondo", PositionTitle.Secretarial, false, 23.0, 3)

    employee1.displayPayDetails(50.0)
    println()
    employee2.displayPayDetails(45.0)
    println()
    employee3.displayPayDetails(35.0)
}
