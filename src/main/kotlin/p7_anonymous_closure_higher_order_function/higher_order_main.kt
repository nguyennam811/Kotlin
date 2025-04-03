package p7_anonymous_closure_higher_order_function

//Higher Order Function: là hàm chấp nhận một hàm khác
// làm đối số hoặc trả về một hàm từ nó.

//dấu ngoặc nhọn {} được sử dụng để định nghĩa một lambda expression (biểu thức lambda)
// hoặc một anonymous function (hàm ẩn danh). Đây là một cách để tạo ra một hàm
// mà không cần đặt tên rõ ràng cho nó.

fun main() {
    rollDice ( 1..6, 3 , {result: Int -> println(result) } )
    //hàm lambda expression nhận một tham số có tên là result và kiểu Int.

    // Đây là phần thân của hàm lambda. Nó in ra màn hình
    rollDice ( 1..6, 3 ) {result: Int -> println(result) }
}

fun rollDice(range: IntRange, time: Int, callback: (result: Int) -> Unit) {
    //Bản thân callback là một biến, nhưng biến này chứa một "hàm".
    // Nói cách khác, callback là một biến mà giá trị của nó là một hàm.

    //(result: Int) -> Unit là kiểu dữ liệu của hàm callback.
    // coi như callback là một hàm nhận một số nguyên result
    // làm đối số và không trả về giá trị nào

    for (i in 0 until time) {

        val result = range.random()

        callback(result)
        //callback(result) gọi hàm lambda được truyền vào,
    // tức là { result: Int -> println(result) }.

        // Chúng ta truyền biến result (kiểu Int) làm đối số cho hàm callback.
    // Tại sao có thể truyền result? Bởi vì:
        //callback là một biến chứa một hàm.
        //Hàm mà callback chứa được định nghĩa để nhận một đối số kiểu Int.
        //Biến result trong vòng lặp for là kiểu Int.

    }

}

//Để dễ hiểu hơn, chúng ta có thể viết lại ví dụ mà không dùng lambda:
//fun processNumbers(numbers: List<Int>, action: (Int) -> Unit) {
//    for (number in numbers) {
//        action(number)
//    }
//}
//
//fun printNumber(number: Int) {
//    println("Số: $number")
//}
//
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    processNumbers(numbers, ::printNumber) // Truyền hàm printNumber làm action
//}