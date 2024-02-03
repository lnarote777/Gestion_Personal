class Gerente(nombre: String, edad: Int, salarioBase: Number, private val bonus: Double, private val exentoImpuestos: Boolean = false) :
    Empleado(nombre, edad, salarioBase, 33.99) {

    override fun calcularSalario(): Double {
        if (exentoImpuestos) {
            return salarioBase.toDouble() + bonus
        } else {
            val salarioBaseConBonus = super.calcularSalario() + bonus
            return salarioBaseConBonus - (salarioBaseConBonus * (porcentajeImpuestos / 100.0))
        }
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€, ¿Exento de impuestos? $exentoImpuestos"
    }

    fun administar(): String {
        return "$nombre está administrando la empresa."
    }

}