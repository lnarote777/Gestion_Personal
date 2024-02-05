/**
 * Clase abierta que representa a una persona.
 *
 * @param nombre Nombre de la persona.
 * @param edad Edad de la persona.
 */
open class Persona (val nombre: String, private var edad: Int){

    /**
     * Inicializador de la clase que verifica las condiciones iniciales.
     *
     * @throws IllegalArgumentException Si el nombre es una cadena vacía o la edad es negativa.
     */
    init {
        require(this.nombre.isNotBlank()) {"El nombre no puede ser una cadena vacía."}
        require(this.edad > 0) {"La edad no puede ser negativa."}
    }

    /**
     * Devuelve una representación en forma de cadena de la persona, incluyendo detalles como el nombre y la edad.
     *
     * @return Cadena que representa a la persona.
     */
    override fun toString(): String {
        return "Nombre: ${nombre.capitalize()}, Edad: $edad."
    }

    /**
     * Incrementa la edad de la persona y devuelve un mensaje de celebración de cumpleaños.
     *
     * @return Mensaje de cumpleaños.
     */
    fun celebrarCumple(): String {
        edad++
        return "Feliz cumpleaños $nombre! Ya tienes $edad"
    }

}
