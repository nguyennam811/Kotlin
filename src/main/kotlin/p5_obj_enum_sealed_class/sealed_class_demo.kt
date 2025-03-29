package p5_obj_enum_sealed_class

//Lớp niêm phong (sealed class) là một lớp trừu tượng,
//giới hạn số lượng lớp con có thể kế thừa từ nó.
//Các lớp con phải được khai báo trong cùng một file hoặc package.

//Lớp niêm phong sealed class
//-	Lớp niêm phong là lớp trừu tượng
//-	Ko thể đc khởi tạo
//-	Các lớp con phải khai báo trong cùng file hoặc cùng package với lớp sealed.
//-	Thuộc tính constructor luôn là private


// => Nếu dùng sealed class, Kotlin biết trước tất cả các lớp con,
//     giúp tránh thiếu case trong when.

fun main() {
    val vehicle : Vehicle = Car("ABC")
    getVehicle(vehicle)

    val vehicle2 : Vehicle = Accord
    getVehicle(vehicle2)
}

sealed class Vehicle(var manufacturer: String){
    abstract val model: String
    abstract fun start()
}

data class Car(override val model: String) : Vehicle("honda"){
    override fun start(){
        println("car start")
    }
}

data class Bicycle(override val model: String) : Vehicle("martin"){
    override fun start(){
        println("Bicycle start")
    }
}

object Accord : Vehicle("Accord"){
    override val model: String = "Accord"

    override fun start(){
        println("Accord start")
    }
}

fun getVehicle (vehicle: Vehicle) =
    when(vehicle){
        Accord -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
        is Bicycle -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
        is Car -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
    }
