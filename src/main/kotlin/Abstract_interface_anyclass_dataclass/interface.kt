package Abstract_interface_anyclass_dataclass


//Ko thể dùng để khởi tạo đối tượng
//Toàn bộ thuộc tính chưa khởi tạo ở interface thì phải khởi tạo ở lớp con
//Pthuc chưa thực hiện thì phải thực hiện ở lớp con
//Pthuc đã hiện thực thì tùy chọn hiện thực ở lớp con
//(lớp con có thể truy cập qua tham số super)

//=> một lớp có thể thực hiện nhiều giao diện interface

//Interface giúp hiện thực được 1  số nhóm chức năng nào đó
//Còn lớp trừu tg khi cta kế thừa thì bắt buộc kế thừa toàn bộ đặc điểm và tính chất
//của lớp trừu tượng đó


interface SayAble {
    //ko được khởi tạo giá trị trong interface
    val food: String
    fun say()
//    fun say(){
//        println("the animal is saying")
//    }
}
interface hihi{
    fun eat()
}

open class Animal1 : SayAble , hihi {
    open val image = "image_animal"
    override val food = "food_animal"

    override fun eat(){
        println("the animal is eating")
    }

    // khởi tạo trong interface thì bắt buộc phải hiện thực
    // nếu ko sẽ báo lỗi
    // hoặc hiện thực luôn trong interface thì ko cần
    override fun say(){
        println("the animal is saying")
    }

    fun sleep(){
        println("the animal is sleeping")
    }
}

open class Dog1 : Animal1() {
    override var image: String = "Dog_image"
    override val food: String = "meat"

    final override fun eat() {
        println("the Dog is eating $food")
    }

    override fun say() {
        println("the Dog is saying woo woo")
    }
}

fun main(args: Array<String>) {
//    val animal = Animal() // ko thể khởi tạo do là abstract class

    println("-------------Dog-------------")
    val mydog = Dog1()
    println("myDog image is ${mydog.image}")
    println("myDog food is ${mydog.food}")
    mydog.eat()
    mydog.say()
    mydog.sleep()
}