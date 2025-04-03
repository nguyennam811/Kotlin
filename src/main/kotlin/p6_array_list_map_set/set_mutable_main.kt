package p6_array_list_map_set

//MutableSet là một tập hợp các phần tử cùng kiểu:
//
//Tập hợp các phần tử không có thứ tự
//Các phần tử là duy nhất, không thể trùng nhau
//Có thể thay đổi số lượng phần tử
//Có thể thay đổi giá trị của phần tử
//Có thể xắp xếp

fun main() {
    val myNumber = mutableSetOf(1,2,3,3,5)
    showValue(myNumber, " ")

//    println("Item at 1 is ${myNumber[1]}")
    println("Size is ${myNumber.size}")
    println("contain 3 is ${myNumber.contains(3)}")
    println("sum ${myNumber.sum()}")
    println("avg ${myNumber.average()}")
    println("min ${myNumber.minOrNull()}")
    println("max ${myNumber.maxOrNull()}")

//    myNumber[2] = 6
//    showValue(myNumber, "myNumber[2] = 6")

//    myNumber.reverse()
//    showValue(myNumber, "reverse()")
//
//    myNumber.sort()
//    showValue(myNumber, "sort()")

    val yourNumber = setOf(7, 8, 9)

    myNumber.addAll(yourNumber)
    showValue(myNumber, "addAll")

// myNumber.removeAll(yourNumber)
// showValue(myNumber, "removeAll")

    myNumber.retainAll(yourNumber)
    showValue(myNumber, "retainAll")

    myNumber.add(12)
    showValue(myNumber, "add(12)")

}
private fun showValue (myNumber: Set<Int>, text: String) {
    println("=======$text =======")
    for ((index, value) in myNumber.withIndex()) {
        println("index $index is : $value")
    }
}