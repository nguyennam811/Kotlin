package inheritance_ISA_HASA_override

fun main(args: Array<String>) {
    val mydog = Dog()
    mydog.image = "new image My dog"
    println("myDog image is ${mydog.image}")
    println("myDog foog is ${mydog.food}")
    println("myDog habitat is ${mydog.habitat}")
    mydog.eat()
    mydog.say()
    mydog.sleep()

    println("--------------------------------")

    val myBabydog = BabyDog()
    println("myBabydog image is ${myBabydog.image}")
    println("myBabydog foog is ${myBabydog.food}")
    println("myBabydog habitat is ${myBabydog.habitat}")
    myBabydog.eat()
    myBabydog.say()
    myBabydog.sleep()

    println("--------------------------------")

    val myCat = Cat()
    println("myCat image is ${myCat.image}")
    println("myCat foog is ${myCat.food}")
    println("myCat habitat is ${myCat.habitat}")
    myCat.eat()
    myCat.say()
    myCat.sleep()

    println("--------------------------------")

    val nam_address = Address("lang Ao" , "Minh Hehe" , "Vietnam")
    val namEmployee = Employee("Minh" , "Minh_image" , nam_address)

}