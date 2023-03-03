import kotlin.math.sqrt

fun main(){
    interactiveMode()
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