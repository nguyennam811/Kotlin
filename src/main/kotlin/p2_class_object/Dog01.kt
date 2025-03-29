package p2_class_object

//hàm khởi tạo chính: là 1 phần của tiêu đề lớp và nó đi sau tên lớp và các tham số

class Dog01 (name_para: String, weight_para: Int = 10, color_para: String) {
    val name = name_para.uppercase()
    var weight = weight_para
    val color = color_para
    fun say(){
        println("dog wwowow 01")
    }
}