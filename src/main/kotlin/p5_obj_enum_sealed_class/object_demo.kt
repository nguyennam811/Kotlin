package p5_obj_enum_sealed_class

//Khai báo đối tượng (object declarations) # khởi tạo đối tương val animal = Animal():
//-	Khởi tạo đối tượng khi đc truy cập lần đầu
//-	Tạo ra 1 lần duy nhất (Singleton)
//-	Ko có hàm khởi tạo constructor
//-	Kế thừa đc super class / abstract class
//-	Hiện thực đc giao diện interface


fun main (){
    println("===========Singleton===============")
    Singleton.showNumber()
    val number1 = Singleton
    val number2 = Singleton
    val number3 = Singleton
    number1.increase()
    number2.increase()
    number3.increase()
    Singleton.showNumber() // =3 ,lớp này chỉ đc khai báo 1 lần duy nhất

    println("===========ShowPerson===============")
    ShowPerson.getWorker()
    ShowPerson.showName
    ShowPerson.showName()
}

object Singleton {
    init {
        println("Singleton initialized")
    }
    private var number = 0
    fun showNumber() = println("the number is $number ")
    fun increase() = number++
}

interface Worker {
    fun getWorker()
}

open class Person(private val name: String) {
    open fun showName() = println("Person $name")
}

object ShowPerson : Person(name = "NNAM"), Worker {

    override fun getWorker() {
        println("I am a worker")
    }

    val showName = super.showName() // Xuất hiện trước do khi khởi tạo 1 đối tượng thì biến sẽ khởi tạo trước

    override fun showName() {
        println("I am showName ")
    }
}