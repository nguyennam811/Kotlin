package p2_class_object

//hàm khởi tạo thứ cấp:
// nằm trong thân (body) của lớp
// phải có đầy đủ tham số của hàm khởi tạo chính

class Dog02 (name_para: String, weight_para: Int = 10) {
    val name = name_para.uppercase()
    var weight = weight_para
    var color: String? = null
//    lateinit var color: String (báo cho chương trình là sẽ gán giá trị cho biến color sau này)

    constructor(name: String, weight: Int, color: String) : this(name, weight) {
        this.color = color
    }

    fun say(){
        println("dog wwowow 01")
    }
}