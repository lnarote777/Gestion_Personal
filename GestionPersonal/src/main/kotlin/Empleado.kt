/**
 * Clase base que representa a un empleado en la empresa.
 *
 * @property nombre Nombre del empleado.
 * @property edad Edad del empleado.
 * @property salarioBase Salario base del empleado.
 * @property porcentajeImpuestos Porcentaje de impuestos a aplicar al salario base (por defecto 10.0%).
 */
open class Empleado(nombre: String, edad: Int, salarioBase: Number, porcentajeImpuestos: Number = 10.0) : Persona(nombre, edad) {

    private val porcentajeImpuestos = porcentajeImpuestos.toDouble()
    private val salarioBase = salarioBase.toDouble()

    /**
     * Calcula el salario del empleado, descontando los impuestos.
     *
     * @return Salario neto después de aplicar impuestos.
     */
    open fun calcularSalario(): Double {
        val impuestos = salarioBase * (porcentajeImpuestos / 100.0)
        return salarioBase - impuestos
    }

    /**
     * Realiza la acción de trabajar y devuelve un mensaje.
     *
     * @return Mensaje indicando que el empleado está trabajando en la empresa.
     */
    fun trabajar(): String {
        return "${nombre.capitalize()} está trabajando en la empresa."
    }

    /**
     * Devuelve una representación en forma de cadena del empleado, incluyendo detalles como el nombre,
     * edad, y salario neto después de aplicar impuestos.
     *
     * @return Cadena que representa al empleado.
     */
    override fun toString(): String {
        return "${super.toString().replace(".", ",")} Salario: ${calcularSalario()}€"
    }

}