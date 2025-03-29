package p2_class_object

// khi khai báo biến var Kotlin sẽ thêm vào
//var name:String = "abc"
//    get() = field      -> getter
//    set(value) {       -> setter
//        field = value
//    }

// Không muốn thay đổi giá trị từ bên ngoài
//var name:String = "abc"
//  private set

// khi khai báo biến val (value) Kotlin sẽ thêm vào
//    get() = field      -> getter (ko có set vì ko thể thay đổi giá trị)

//tùy chỉnh getter, setter -> demo


class Dog05 (name_para: String, weight_para: Int = 10) {
    val name = name_para.uppercase().also(::println)
        get() {
            return field.lowercase()
        }

    var weight = weight_para.also(::println)
//        private set
        set(value) {
            field = if (value > 5) value else throw IllegalArgumentException("weight is too low")
        }

    var color: String? = null

    constructor(name: String, weight: Int, color: String) : this(name, weight) {
        this.color = color.also(::println)
    }

    //initializer block : khi tạo 1 lớp muốn xuất ra 1 câu thông báo nào đó
    init {
        println("beginning program show name ${name} and color ${color}")
        // sau khi khởi tạo xong biến thì khối init sẽ đc thực hiện
        // thực hiện xong hàm init thì mới thực hiện hàm constructor
    }

    fun say(){
        println("dog wwowow 01")
    }

}