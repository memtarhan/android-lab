import kotlin.random.Random

fun main() {
    val number = Random.nextInt(0, 100000)
    val numbers = List(10) { Random.nextInt(0, 100) }

    if (numbers.count() == 10) {
        println("This is correct")
    }

    if (number % 2 == 0) {
        println("It's even")

    } else {
        println("It's odd")
    }

    val trafficLight = "Yellow"

    if (trafficLight == "Red") {
        println("Stop")

    } else if (trafficLight == "Yellow") {
        println("Ready")

    } else if (trafficLight == "Green") {
        println("Go")

    } else {
        println("Failure")
    }

    // OR

    when (trafficLight) {
        "Red" -> {
            println("Stop")
        }
        "Yellow" -> {
            println("Ready")
        }
        "Green" -> {
            println("Go")
        }
        else -> {
            println("Failure")
        }
    }

    val x = 10
    when (x) {
        2, 3, 5, 7 -> println("a prime number")
        in 1..10 -> println("not a prime number")
        else -> println("not in range")
    }
}