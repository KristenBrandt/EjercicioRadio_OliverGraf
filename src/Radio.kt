class Radio(    var encendido: Boolean = false,
                var volumen: Int = 0,
                var estacion: Double = 0.0,
                var sintonia: String = "Fm") {
    fun subirVolumen(int: Int){
        volumen =+ int
        if( volumen > 100){
            volumen = 100
        }

    }
    fun bajarVolumen(int: Int){
        volumen =- int
        if(volumen < 0){
            volumen = 0
        }
    }
    fun cambiarEstacion(d: Double){
        estacion = d
    }

    fun cambiarSintonia(){ if (sintonia.equals("Fm")){
        sintonia = "Am"
    }else{
        sintonia = "Fm"
    }}
    fun encenderApagar(){
        if(encendido == false){
            println("Acaba de encender la radio")
            encendido = true
        }else{
            println("Acaba de apagar la radio")
            encendido = false
        }

    }

    override fun toString(): String {
        return """
            Estado actual de la radio:
                Estacion: $estacion
                Fm/Am: $sintonia
                Volumen: $volumen
                Encendido/Apagado: $encendido
        """.trimIndent()
    }

    fun menu():String{
        return """
            ¿Cual de las siguientes acciones desea tomar?
            Ingrese el numero de la opcion que quiere(1-6)
            1.Cambiar de sintonia
            2.Subir volumen
            3.Bajar volumen
            4.Cambiar entre Fm y Am
            5.Encender o apagar la radio
            6.Salir del programa
            """.trimIndent()
    }
}