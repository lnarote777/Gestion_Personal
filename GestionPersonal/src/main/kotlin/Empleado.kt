open class Empleado(nombre: String, edad: Int, val salarioBase: Number, val porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

    open fun calcularSalario(): Double {
        val salarioBruto: Double = salarioBase.toDouble()
        val impuestos = salarioBruto * (porcentajeImpuestos / 100.0)
        return salarioBruto - impuestos
    }

    fun trabajar(): String {
        return "${nombre.capitalize()} está trabajando en la empresa."
    }

    override fun toString(): String {
        return "${super.toString().replace(".", ",")} Salario: ${calcularSalario()}€"
    }

}