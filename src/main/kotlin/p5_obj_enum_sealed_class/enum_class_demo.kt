package p5_obj_enum_sealed_class

//1 lớp Enum cho pheps bạn tạo 1 tập hợp các hằng số:
//-	Ko cần khởi tạo
//-	Mỗi hằng số trong Enum là thực thể của lớp Enum
//-	Các hằng số có tính chất hoàn toàn giống nhau
//-	Khai báo đc thuộc tính và pthuc

fun main() {
    val color = Color.RED
    getColor(color)
    color.showColor()
}

fun getColor (color: Color) = when (color) {
    //color trong fun getColor(color: Color) là một biến kiểu Color, không phải đối tượng
    Color.RED -> println("getColor RED ${color.nameVN}")
    Color.YELLOW -> println("getColor YELLOW ${color.nameVN}")
    Color.BLUE -> println("getColor BLUE ${color.nameVN}")
}
enum class Color (val nameVN : String) {
    //Mỗi hằng số trong Enum là kiểu của lớp Enum
    RED("Đỏ") {
        override fun showColor() {
            println("this color is RED")
        }
    },
    YELLOW("Vàng"){
        override fun showColor() {
            println("this color is YELLOW")
        }
    },
    BLUE("Xanh"){
        override fun showColor() {
            println("this color is BLUE")
        }
    };

    open fun showColor(){}
}

