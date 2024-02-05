class Gerente(nombre: String, edad: Int, salarioBase: Number, private val bonus: Double, private val exentoImpuestos: Boolean = false) :
    Empleado(nombre, edad, salarioBase, 33.99) {

        private val salarioBruto = salarioBase.toDouble()

    /**
     * Calcula el salario del gerente, teniendo en cuenta el bonus y los impuestos, si corresponde.
     *
     * @return Salario calculado del gerente.
     */
    override fun calcularSalario(): Double {
        return if (exentoImpuestos) {
            salarioBruto + bonus
        } else {
            super.calcularSalario() + bonus
        }
    }
    /**
     * Devuelve una representación en forma de cadena del gerente, incluyendo detalles como el nombre,
     * edad, salario, bonus y si está exento de impuestos.
     *
     * @return Cadena que representa al gerente.
     */
    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€, ¿Exento de impuestos? $exentoImpuestos"
    }
    /**
     * Devuelve un mensaje indicando que el gerente está administrando la empresa.
     *
     * @return Mensaje de administración.
     */
    fun administar(): String {
        return "$nombre está administrando la empresa."
    }

}