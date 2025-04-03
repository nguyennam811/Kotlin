package p7_anonymous_closure_higher_order_function

//Closure Function: là hàm có thể truy cập và sửa đổi các thuộc tính
// được xác định bên ngoài phạm vi của hàm.

fun main() {
    println("Ba kí tự đầu Kotlin: "+ getSubString()("Kotlin", 3))
}


fun getSubString(): (text: String, number: Int) -> String {
    return fun(text: String, number: Int): String {
        //Dòng này trả về một hàm ẩn danh (anonymous function).
        //Hàm ẩn danh này nhận một chuỗi text và một số nguyên number làm đối số.
        return text.substring(0, number)
    }
}
//Dòng này định nghĩa một hàm có tên là getSubString.

//Hàm này không nhận đối số nào và trả về một hàm khác.

//Hàm trả về có kiểu (text: String, number: Int) -> String,
// nghĩa là nó nhận một chuỗi text và một số nguyên number làm đối số, và trả về một chuỗi.

//Hàm getSubString trả về một hàm ẩn danh (anonymous function).

//Hàm ẩn danh này có kiểu dữ liệu là (text: String, number: Int) -> String.

//Điều này có nghĩa là khi bạn gọi getSubString(), bạn sẽ nhận được một hàm
// mà bạn có thể gọi với một chuỗi và một số nguyên, và hàm đó sẽ trả về một chuỗi.