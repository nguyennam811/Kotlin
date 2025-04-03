package p8_lambda_high_order_fun

fun main() {
    sum( 5, 7)
    val sumLambda: (Int, Int) -> Unit = { x: Int, y: Int -> println(x + y) }
    sumLambda(5, 6)
}

fun sum(x: Int, y: Int) {
    val z = x + y
    println(z)
}