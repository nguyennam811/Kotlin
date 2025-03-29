package p2_class_object

//also(::println) là thuộc tính đợi xuất thông tin

class Dog04 (name_para: String, weight_para: Int = 10) {
    val name = name_para.uppercase().also(::println)
    var weight = weight_para.also(::println)
    var color: String? = null

    constructor(name: String, weight: Int, color: String) : this(name, weight) {
        this.color = color.also(::println)
    }

    //initializer block : khi tạo 1 lớp muốn xuất ra 1 câu thông báo nào đó
    init {
        println("beginning program show name ${name} and color ${color}")
        // sau khi khởi tạo xong biến thì khối init sẽ đc thực hiện
        // thực hiện xong hàm init thì mới thực hiện hàm constructor
    }

    fun say(){
        println("dog wwowow 01")
    }
}