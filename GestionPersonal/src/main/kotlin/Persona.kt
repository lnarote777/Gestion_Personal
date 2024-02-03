open class Persona (val nombre: String, private var edad: Int){

    init {
        require(this.nombre.isNotBlank()) {"El nombre no puede ser una cadena vacía."}
        require(this.edad > 0) {"La edad no puede ser negativa."}
    }

    override fun toString(): String {
        return "Nombre: ${nombre.capitalize()}, Edad: $edad."
    }

    fun celebrarCumple(): String {
        edad++
        return "Feliz cumpleaños $nombre! Ya tienes $edad"
    }

}
