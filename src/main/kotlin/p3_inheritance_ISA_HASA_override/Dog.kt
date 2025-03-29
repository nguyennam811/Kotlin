package p3_inheritance_ISA_HASA_override

//để override tất cả thông tin ấn ctrl + o
// alt+J để chọn những từ giống nhau

// để lớp BabyDog ko ghi đè lại thông tin của lớp Dog thì ta dùng final

open class Dog : Animal() {
//    final override val image: String = "Dog_image"
    override var image: String = "Dog_image"
    override val food: String = "meat"
    override val habitat: String = "home"

    override fun eat() {
        println("the Dog is eating $food")
    }

    override fun say() {
        println("the Dog is saying woo woo")
    }
}