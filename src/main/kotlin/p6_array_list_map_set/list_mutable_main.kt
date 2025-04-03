package p6_array_list_map_set

//MutableList là một tập hợp các phần tử cùng kiểu:
//
//Phần tử có thể trùng nhau
//Truy cập được các phần tử qua index
//Có thể thay đổi số lượng phần tử
//Có thể thay đổi giá trị của phần tử
//Có thể xắp xếp

//Array cho phép bạn thay đổi giá trị của các phần tử,
// nhưng không thay đổi được số lượng phần tử.

//MutableList cho phép bạn thay đổi cả giá trị của các phần tử và số lượng phần tử.

//Array phù hợp khi bạn biết trước số lượng phần tử và
// không cần thay đổi kích thước sau khi tạo.

//MutableList linh hoạt hơn và phù hợp khi bạn cần thay đổi kích thước
// hoặc thao tác với các phần tử một cách linh hoạt.

fun main() {
    val myNumber = mutableListOf(1,2,3,3,5)
    showValue(myNumber, " ")

    println("Item at 1 is ${myNumber[1]}")
    println("Size is ${myNumber.size}")
    println("contain 3 is ${myNumber.contains(3)}")
    println("sum ${myNumber.sum()}")
    println("avg ${myNumber.average()}")
    println("min ${myNumber.minOrNull()}")
    println("max ${myNumber.maxOrNull()}")

    myNumber[2] = 6
    showValue(myNumber, "myNumber[2] = 6")

    myNumber.reverse()
    showValue(myNumber, "reverse()")

    myNumber.sort()
    showValue(myNumber, "sort()")

    val yourNumber = listOf(7, 8, 9)

    myNumber.addAll(yourNumber)
    showValue(myNumber, "addAll")

// myNumber.removeAll(yourNumber)
// showValue(myNumber, "removeAll")

    myNumber.retainAll(yourNumber)
    showValue(myNumber, "retainAll")

    myNumber.add(12)
    showValue(myNumber, "add(12)")

    myNumber.add(1, 15)
    showValue(myNumber, "add(1,15)")

    myNumber.removeAt(3)
    showValue(myNumber, "removeAt(3)")
}
private fun showValue (myNumber: List<Int>, text: String) {
    println("=======$text =======")
    for ((index, value) in myNumber.withIndex()) {
        println("index $index is : $value")
    }
}