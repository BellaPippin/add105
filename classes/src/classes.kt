class Employee(
    val name: String,
    val employeeNumber: Int,
    val shift: Int
) {

    fun displayEmployeeInfo() {
        println("Employee Name: $name")
        println("Employee Number: $employeeNumber")
        println("Employee Shift: $shift")
        println()
    }
}

fun main() {
    //Instantiate
    val employee1 = Employee("John Doe", 101, 1)
    val employee2 = Employee("Jane Smith", 102, 2)
    val employee3 = Employee("Alice Johnson", 103, 3)

    //Display
    println("Employee 1 Info:")
    employee1.displayEmployeeInfo()

    println("Employee 2 Info:")
    employee2.displayEmployeeInfo()

    println("Employee 3 Info:")
    employee3.displayEmployeeInfo()
}
