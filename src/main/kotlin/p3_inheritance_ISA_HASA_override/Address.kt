package p3_inheritance_ISA_HASA_override

class Address (
    val street: String,
    val district: String,
    val country: String,
) {

    override fun toString(): String {
        return "Address(street=$street, district=$district, country=$country)"
    }
}