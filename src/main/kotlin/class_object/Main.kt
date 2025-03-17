package class_object

fun main(args: Array<String>) {
    var myDog = Dog("Lucky", 16 ,"Yellow")
    println("myDog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    myDog.weight = 20
    println("myDog have name ${myDog.name} ${myDog.weight} ${myDog.color}")

    var myDogs = arrayOf(Dog("Lucky", 15 ,"Yellow"), Dog("Bob", 25 ,"Blue"))
    println("myDogs have name ${myDogs[1].name} ${myDogs[1].weight} ${myDogs[1].color}")

    var myDoghehe = Dog("Lucky", color = "Yellow")
    println("myDoghehe have name ${myDoghehe.name} ${myDoghehe.weight} ${myDoghehe.color}")

    var myDog1 = Dog01("Lucky", 15, "Yellow")
    println("myDog1 have name ${myDog1.name} ${myDog1.weight} ${myDog1.color}")

    var myDog2 = Dog02("Lucky", 15, "Yellow")
    println("myDog2 have name ${myDog2.name} ${myDog2.weight} ${myDog2.color}")

    var myDog2Turn2 = Dog02("Lucky", 15)
    println("myDog2 - turn 2 have name ${myDog2Turn2.name} ${myDog2Turn2.weight} ${myDog2Turn2.color}")

    var myDog3 = Dog03("Lucky", 15, "Yellow")
    println("myDog3 have name ${myDog3.name} ${myDog3.weight} ${myDog3.color}")
}