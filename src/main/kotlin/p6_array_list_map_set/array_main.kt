package p6_array_list_map_set

//Mảng Array là một tập hợp các phần tử cùng kiểu:
//
//Phần tử có thể trùng nhau
//Số lượng phần tử khi khởi tạo, không thể thay đổi
//Thay đổi được giá trị của phần tử
//Xắp xếp được các phần tử


fun main() {
    val myNumber = arrayOf(1,2,3,3,5)
    showValue(myNumber, " ")

    println("Item at 1 is ${myNumber[1]}")
    println("Size is ${myNumber.size}")
    println("contain 3 is ${myNumber.contains(3)}")
    println("sum ${myNumber.sum()}")
    println("avg ${myNumber.average()}")
    println("min ${myNumber.minOrNull()}")
    println("max ${myNumber.maxOrNull()}")

//    Trong Kotlin, các phương thức min() và max()
//    không tồn tại trên Array<T>, nhưng chúng tồn tại trên List<T> và Sequence<T>.

    myNumber[2] = 6
    showValue(myNumber, "myNumber[2] = 6")

    myNumber.reverse()
    showValue(myNumber, "reverse()")

    myNumber.sort()
    showValue(myNumber, "sort()")

}
private fun showValue (myNumber: Array<Int>, text: String) {
    println("=======$text =======")
    for ((index, value) in myNumber.withIndex()) {
        println("index $index is : $value")
    }
}