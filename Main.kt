import kotlin.math.sqrt
import java.io.File

fun main(args: Array<String>){
    if (!args.isEmpty()) { nonInteractiveMode(args) }
    else {interactiveMode()}
}

fun nonInteractiveMode(args: Array<String>) {
    val file = File(args[0])
    if (!file.exists()) {
        println("Error: file does not exist")
        return
    }
    val input = file.readText().trim().split(" ")
    if (input.size != 3) {
        println("Error: expected 3 numbers")
        return
    }
    val (a, b, c) = input.map { it.toDoubleOrNull() }
    if (a == 0.0) {
        println("Error: 'a' coefficient cannot be 0")
        return
    }
    if (a == null || b == null || c == null) {
        println("Error: expected valid real numbers")
        return
    }
    solveQuadEquation(a, b, c)
}

fun interactiveMode(){
    println("Enter the parameters")
    val a = readDouble("a")
    val b = readDouble("b")
    val c = readDouble("c")
    if (a == 0.0) {
        println("Error: 'a' coefficient cannot be zero")
        return
    }
    solveQuadEquation(a, b, c)
}

fun readDouble(name: String): Double {
    while (true) {
        print("$name = ")
        val input = readLine()?.toDoubleOrNull()
        if (input != null) {
            return input
        }
        println("Error: expected a valid real number")
    }
}


fun solveQuadEquation(a: Double, b: Double, c: Double) {
    val discriminant = b * b - 4 * a * c
    println("Equation is: ($a) x^2 + ($b) x + ($c) = 0")
    when {
        discriminant > 0 -> {
            val x1 = (-b + sqrt(discriminant)) / (2 * a)
            val x2 = (-b - sqrt(discriminant)) / (2 * a)
            println("Tow real roots: x1 = $x1 x2 = $x2")
        }
        discriminant == 0.0 -> {
            val x = -b / (2 * a)
            println("One real root: x = $x")
        }
        else -> {
            println("No real roots")
        }
    }
    return
}