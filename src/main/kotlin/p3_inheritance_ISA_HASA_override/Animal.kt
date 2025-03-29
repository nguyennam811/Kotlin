package p3_inheritance_ISA_HASA_override

//mặc định một lớp trong kotlin là không thể kế thừa
//để 1 lớp trở thành lớp cha để kế thừa:
// - Khai tham số open

// Nếu không muốn cho kế thừa thì khai báo tham số private


//ghi đè (override)  tự triển khai các phương thực của lớp con đè lên lớp cha . Để triển khai
// - tham số open
// - tham số override

// khi thay đổi từ val sang var ở lớp cha thì tất cả lớp con cx phải thay đổi lại
// nhưng khi lớp chả là val mà lớp con đặt var thì ko sao

open class Animal {
    open val image = "image_animal"
    open val food = "food_animal"
//    private val food = "food_animal"
    open val habitat = "habitat_animal"

    open fun eat(){
        println("the animal is eating")
    }

    open fun say(){
        println("the animal is saying")
    }
    fun sleep(){
        println("the animal is sleeping")
    }
}