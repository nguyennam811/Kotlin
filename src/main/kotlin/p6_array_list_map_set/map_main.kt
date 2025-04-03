package p6_array_list_map_set

//Map một tập hợp các cặp key - value:
//
//Key trong map là duy nhất.
//Không thể thay đổi số lượng phần tử
//Không thể thay đổi giá trị của phần tử


fun main() {
    val mapNumber = mapOf("One" to 1, "Two" to 2, "Three" to 3, "Three" to 5)
    //Key is Three, value is 5
    //ptu 3 ko còn do nó chỉ lấy những cái ở cuôí nhất, key là duy nhất

    for ((key, value) in mapNumber) {
        println("Key is $key, value is $value")
    }

    if (mapNumber.containsKey("One")) {
        println("contain One")
    }

    if (mapNumber.containsValue(3)) {
        println("contain 3 value")
    }
}