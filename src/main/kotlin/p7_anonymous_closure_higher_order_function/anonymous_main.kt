package p7_anonymous_closure_higher_order_function

//Anonymous Function: hàm ẩn danh, giống một hàm thông thường
// nhưng không có tên hàm và được gán trực tiếp cho một biến.


fun main() {
    val sum = sumAB(2,5)
    val mul = multiXY(4,5)
    println("tổng là $sum")
    println("tích là $mul")
}
//hàm ẩn danh với expression
val sumAB = fun(x: Int, y: Int): Int = x + y

// hàm ẩn danh với block
val multiXY = fun(x: Int, y: Int): Int {
    val z = x*y
    return z
}