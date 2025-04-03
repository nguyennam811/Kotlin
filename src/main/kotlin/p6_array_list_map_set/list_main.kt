package p6_array_list_map_set

//List là một tập hợp các phần tử cùng kiểu:
//
//Phần tử có thể trùng nhau
//Truy cập được các phần tử qua index
//Không thể thay đổi số lượng phần tử
//Không thể thay đổi giá trị của phần tử
//Không thể xắp xếp


fun main() {
    val myNumber = listOf(1,2,3,3,5)
    showValue(myNumber, " ")

    println("Item at 1 is ${myNumber[1]}")
    println("Size is ${myNumber.size}")
    println("contain 3 is ${myNumber.contains(3)}")
    println("sum ${myNumber.sum()}")
    println("avg ${myNumber.average()}")
    println("min ${myNumber.minOrNull()}")
    println("max ${myNumber.maxOrNull()}")

//    myNumber[2] = 6
//    showValue(myNumber, "myNumber[2] = 6")
//
//    myNumber.reverse()
//    showValue(myNumber, "reverse()")
//
//    myNumber.sort()
//    showValue(myNumber, "sort()")

}
private fun showValue (myNumber: List<Int>, text: String) {
    println("=======$text =======")
    for ((index, value) in myNumber.withIndex()) {
        println("index $index is : $value")
    }
}