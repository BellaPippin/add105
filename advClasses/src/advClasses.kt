enum class PositionTitle {
    Administration,
    Production,
    Sales,
    Maintenance,
    Technical,
    Secretarial
}

class Employee(
    val name: String,
    val position: PositionTitle,
    val salary: Boolean,
    val payRate: Double,
    val shift: Int
) {

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

    fun displayPayDetails(hoursIn: Double) {
        val totalPay = calculatePay(hoursIn)
        println("Employee: $name")
        println("Position: $position")
        println("Pay Rate: $$payRate")
        println("Total earnings for the week: $$totalPay")
    }
}

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
