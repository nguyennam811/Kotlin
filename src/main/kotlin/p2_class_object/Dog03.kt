package p2_class_object

//thứ tự khi khởi tạo đôi tượng
// 1. khởi tạo biến của primary constructor
// 2. thực thi khối init
// 3. khởi ta biến và công việc secondary constructor

class Dog03 (name_para: String, weight_para: Int = 10) {
    val name = name_para.uppercase()
    var weight = weight_para
    var color: String? = null

    constructor(name: String, weight: Int, color: String) : this(name, weight) {
        this.color = color
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