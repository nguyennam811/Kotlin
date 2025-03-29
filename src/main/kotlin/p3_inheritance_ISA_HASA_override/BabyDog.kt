package p3_inheritance_ISA_HASA_override

class BabyDog : Dog() {
    override var image: String = "BabyDog_image"
    override val food: String = "Baby_meat"
    override val habitat: String = "Baby_home"

    override fun eat() {
        println("the Baby_Dog is eating $food")
    }

    override fun say() {
        println("the Baby_Dog is saying woo woo")
    }
}