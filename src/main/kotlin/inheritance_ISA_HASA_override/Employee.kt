package inheritance_ISA_HASA_override

class Employee (
    val name: String = "",
    val image: String = "",
    val address : Address
) {
    //khi chúng ta gọi lớp Employee để khởi tạo đối tưởng thì tự động xuất thông tin

    init {
        display()
    }
    fun display (){
        println(" name is $name")
        println(" image is $image")
        println(" address is $address")
    }
}