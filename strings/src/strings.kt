fun main() {
    var correctAnswers = 0

    println("Welcome to the World Capitals Quiz!")

    // Question 1
    println("Question 1: What is the capital of France?")
    val answer1 = readLine()!!
    if (answer1.equals("Paris", ignoreCase = true)) {
        println("Correct!")
        correctAnswers++
    } else {
        println("Incorrect! The correct answer is Paris.")
    }

    // Question 2
    println("Question 2: What is the capital of Japan?")
    val answer2 = readLine()!!
    if (answer2.equals("Tokyo", ignoreCase = true)) {
        println("Correct!")
        correctAnswers++
    } else {
        println("Incorrect! The correct answer is Tokyo.")
    }

    // Question 3
    println("Question 3: What is the capital of Canada?")
    val answer3 = readLine()!!
    if (answer3.equals("Ottawa", ignoreCase = true)) {
        println("Correct!")
        correctAnswers++
    } else {
        println("Incorrect! The correct answer is Ottawa.")
    }

    // Question 4
    println("Question 4: What is the capital of Australia?")
    val answer4 = readLine()!!
    if (answer4.equals("Canberra", ignoreCase = true)) {
        println("Correct!")
        correctAnswers++
    } else {
        println("Incorrect! The correct answer is Canberra.")
    }

    // Question 5
    println("Question 5: What is the capital of Brazil?")
    val answer5 = readLine()!!
    if (answer5.equals("Brasilia", ignoreCase = true)) {
        println("Correct!")
        correctAnswers++
    } else {
        println("Incorrect! The correct answer is Brasília.")
    }

    // Final score
    println("\nYou got $correctAnswers out of 5 questions correct!")
}
