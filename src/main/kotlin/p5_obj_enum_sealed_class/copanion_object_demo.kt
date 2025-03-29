package p5_obj_enum_sealed_class

import p5_obj_enum_sealed_class.ShowPerson.showName

//companion object được sử dụng để khai báo một đối tượng bên trong một class,
//nhưng nó hoạt động giống như một đối tượng tĩnh (static) trong Java.
//Điều này có nghĩa là bạn có thể gọi các phương thức và thuộc tính bên trong
//companion object mà không cần tạo một instance của class.

//Đối tượng đồng hành (Companion objects)
//-	Khai báo trong thân 1 lớp
//-	Được tạo ra 1 lần duy nhất khi truy cập qua lớp
//-	Truy cập qua tên lớp
//-	Tên có thể đc bỏ qua, tên “Companion” sẽ đc áp dụng
//-	Chỉ đc tạo 1 đối tượng đồng hành trong 1 lớp

//khi nào cần dùng:

//Khi bạn cần các phương thức hoặc thuộc tính dùng chung cho
//toàn bộ class (giống như static trong Java).
//
//Khi bạn cần hằng số (const val).
//
//Khi bạn muốn tạo một Singleton mà chỉ có một instance duy nhất trong chương trình.
//
//💡 Lưu ý: Nếu bạn muốn một class chỉ có một instance duy nhất nhưng có thể được
//    khởi tạo linh hoạt hơn, hãy dùng object thay vì companion object.

class Example {
    val instanceVar = "Đây là biến của instance"

    companion object {
        init {
            println("Singleton is created")
        }
        private var number = 0
        const val number1 = 10 // sẽ coi là 1 hằng số
        fun showNumber() = println("the number is $number")
        fun increase() = number++


        const val staticVar = "Đây là biến của companion object"
    }
}

fun main() {
    println(Example.staticVar) // Không cần tạo instance

    val ex = Example()
    println(ex.instanceVar) // Cần tạo instance

    Example.showNumber()
    Example.increase()
    Example.increase()
    Example.showNumber()

    println(" number1 is ${Example.number1}")
}
