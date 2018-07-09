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
        sintonia = "Am".toString()
    }else{
        sintonia = "Fm".toString()
    }}
    fun encenderApagar(){
        if(encendido == false){
            encendido = true
        }else{
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
            1.Cambiar de sintonia
            2.Subir o bajar volumen
            3.Cambiar entre Fm y Am
            4.Encender o apagar la radio
            5.Salir del programa
            """
    }
}