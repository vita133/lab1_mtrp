import kotlin.math.sqrt

fun main(){
    println("Enter the parameters")
    print("a = ")
    val a = readLine()!!.toDouble()
     print("b = ")
    val b = readLine()!!.toDouble()
     print("c = ")
    val c = readLine()!!.toDouble()


    solveQuadEquation(a, b, c)
    println("End")
}

fun solveQuadEquation(a: Double, b: Double, c: Double){
    val discriminant = b * b - 4 * a * c
    if(discriminant > 0) {
        val x1 = (-b + sqrt(discriminant)) / (2 * a)
        val x2 = (-b - sqrt(discriminant)) / (2 * a)
        println("Tow real roots: x1 = $x1 x2 = $x2")
    }
    else if (discriminant.toInt() == 0) {
        val x = (-b + sqrt(discriminant)) / (2 * a)
        println("One real root: x = $x")
    }
    else {
        println("No real roots")
    }
    return
}