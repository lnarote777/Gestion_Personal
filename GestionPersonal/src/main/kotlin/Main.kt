fun main(args: Array<String>) {
    val persona = Persona("julia", 32)
    println(persona.toString())
    println(persona.celebrarCumple())
    println()

    val empleado = Empleado("antonio", 45, 566,5.9)
    println(empleado.toString())
    println(empleado.trabajar())
    println()

    val gerente = Gerente("sebas", 43, 9689.7, 786.9, false)
    println(gerente.toString())
    println(gerente.administar())
}