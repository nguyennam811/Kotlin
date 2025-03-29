package p4_Abstract_interface_anyclass_dataclass

//lớp trừu tượng sẽ ko tạo ra đối tượng

//Đối với lớp trừu tượng mọi thuộc tính và phương thức khi cta khai báo trừu tượng
// thì phải khởi tạo các thuộc tính và hiện thực các phương thức trong lớp con
// (chứ ko làm ở lớp cha như kế thừa bthg vì Animal là 1 lớp cha nên ko thể tạo đối tượng)

//Khi kế thừa thì đảm bảo các thuộc tính và phương thức trừu tượng luôn luôn đc thực hiện

//- Phải có tham số abstract trước lớp
//- Phải có tham số abstract đối với thuộc tính, phương thức
//- Vẫn sử dụng open để có thể kế thừa và ghi đè như bthg

// => Một lớp con chỉ có thể kế thừa 1 lớp trừu tượng


abstract class Animal {
    abstract val image : String
    abstract val food : String
    private val habitat = "habitat_animal"

    abstract fun eat()

    abstract fun say()

    fun sleep(){
        println("the animal is sleeping")
    }

    fun habitat(){
        println("the habitat of $habitat")
    }
}

open class Dog : Animal() {
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
    val mydog = Dog()
    println("myDog image is ${mydog.image}")
    println("myDog food is ${mydog.food}")
    mydog.eat()
    mydog.say()
    mydog.sleep()
    mydog.habitat()
}