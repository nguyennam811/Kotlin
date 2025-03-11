package var_val_loop_fun

fun main(args: Array<String>) {
    println("hello")

    //variable
    var x = 10
    var y = x + 10
    println("Gia tri cua y la $y")

    var a = 10.35
    println("a=$a")
    var b: Float = a.toFloat()
    println("b=$b")

    var text = "a"

    var c: Char = 'a'
    println("char c = $c")
//    var text1: Char = text

    var text2 = "abc"
    println("text2: ${text2[1]}")

    var myArray: Array<Long> = arrayOf(1, 2, 3)
    var testArray:Int = myArray[2].toInt()
    println("testArray: $testArray")

    // val (value) là hằng số, ko thể thay đổi , ko đc sử dụng lại
//    val d = 15
//    d = 10

    println("Mời nhập 1 số")
    var enterInt: Int = readLine()!!.toInt()
    // !! tức là không được null
    if (enterInt % 2 == 0) {
        println("số chẵn")
    } else {
        println("số lẻ")
    }

    val day = 1
    when (day) {
        2 -> println("monday")
        3 -> println("friday")
        4 -> println("sunday")
        5 -> println("planks")
        6 -> println("tidy")
        7 -> println("tidy")
        else -> println("ngày sai")
    }


    val testFor = 5
    for (i in 1..testFor) {
        println("testFor .. $i")
    }

    for (i in 1 until testFor) {
        println("testFor until $i")
    }

    for (i in testFor downTo  1) {
        println("testFor downTo $i")
    }

    val array01 = arrayOf("một", 2 , 'c', 2.5)
    for (i in array01) {
        println("testArray $i")
    }


    var itemWhile = 1
    while (itemWhile < 10) {
        println("test while $itemWhile")
        itemWhile++
    }

    var itemDoWhile = 1
    do {
        println("test do while $itemDoWhile")
        itemDoWhile++
    } while (itemDoWhile <= 0)

    // kiểm tra biến null an toàn
    var testNull : String? = null
    // ? đánh dấu biến này có thể null
    println(testNull)

    var size = testNull?.length
    println(size)

//    var size1 = testNull!!.length
//    println(size1)

    var test123: String? = null
    var size123 = test123?.length ?: "Biến này là null"
    // ?: nếu là null thì hiện ta cái kia
    println(size123)


    val v1 = 5
    val v2 = 1
    max(v1, v2)

    println(max1(v1, v2))

    println(max2(v1, v2))

}

fun max(a: Int, b: Int) {
    if (a > b) {
        println("a lớn hơn b")
    } else {
        println(" a bé hơn b")
    }
}

fun max1(a: Int, b: Int) : String {
    if (a > b) {
        return "a lớn hơn b"
    } else {
        return "a bé hơn b"
    }
}

fun max2(a: Int, b: Int) : String =
    if (a > b)  "a lớn hơn b"
    else  "a bé hơn b"

