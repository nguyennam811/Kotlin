package p6_array_list_map_set

//MutableMap một tập hợp các cặp key - value:
//
//Key trong map là duy nhất.
//Có thể thay đổi số lượng phần tử
//Có thể thay đổi giá trị của phần tử

fun main() {
    val mapNumber = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)

    mapNumber.put("four", 4) // thêm vào mutableMap có sẵn
    mapNumber.put("four", 5)

    val yourNumber = mutableMapOf("Seven" to 7, "Ten" to 10)

    mapNumber.putAll(yourNumber) //put 2 chuỗi

    for ((key, value) in mapNumber) {
        println("Key is $key, value is $value")
    }

    mapNumber.remove("Seven")


    for ((key, value) in mapNumber) {
        println("Key is $key, value is $value")
    }

    if (mapNumber.containsKey("One")) {
        println("contain One")
    }

    if (mapNumber.containsValue(3)) {
        println("contain 3 value")
    }

    mapNumber.clear()

}