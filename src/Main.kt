/**Oliver Graf **/

fun main(args: Array<String>){
    var x:String?
    var on = true
    val radio = Radio()
    println("Bienvenido(a) a esta simulacion de una radio.")

    do{
        println(radio.toString())
        println()
        println(radio.menu())
        x = readLine()!!


        when(x){
            1.toString()-> {

                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    var ab: Double
                    println("Actualmente esta sintonizado a ${radio.sintonia}\nLas frecuencias que alcanza la radio van de 70 a 200")
                    println("Ingrese la nueva estacion siguiendo este formato aaa.b")

                    do {
                        var tont = false
                        println("aaa = ")
                        var aaa: String? = readLine()!!
                        while(aaa!!.toInt() > 200||aaa!!.toInt()<70){
                            println("Ingreso un numero invalido, intentelo de nuevo (70 - 200)")
                            aaa = readLine()!!
                        }

                        println("Para b ingrese un numero de 0 a 9\nb = ")
                        var b: String? = readLine()!!
                        while (b!!.toInt()>9  || b!!.toInt()<0){
                            println("Ingreso un numero invalido, intentelo de nuevo (0 - 9)")
                            b = readLine()!!
                        }
                        try {
                            ab = aaa!!.toDouble()  + (b!!.toDouble() * 0.1)
                            radio.cambiarEstacion(ab)
                            println("Estacion cambiada exitosamente.")
                            tont = true
                        }catch(e: Exception){1
                            println("Error, intentelo de nuevo: ")
                        }
                    }while(!tont)

                }

            }
            2.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    println("El volumen actual es ${radio.volumen}\nIngrese cuanto desea subir el volumen(MAX 100): ")
                    do {
                        var subvol = readLine()!!
                        var tres = false
                        try {
                            subvol.toInt()
                            println("Volumen cambiado exitosamente.")
                            radio.subirVolumen(subvol.toInt())
                            tres = true
                        } catch (e: Exception) {
                            println("Necesitas ingresar un numero, intentalo de nuevo: ")
                        }
                    } while (!tres)
                }
            }
            3.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    println("El volumen actual es ${radio.volumen}\nIngrese cuanto desea bajar el volumen(MIN 0): ")
                    do {
                        var bajvol = readLine()!!
                        var tres = false
                        try {
                            bajvol.toInt()
                            println("Volumen cambiado exitosamente.")
                            radio.bajarVolumen(bajvol.toInt())
                            tres = true
                        } catch (e: Exception) {
                            println("Necesitas ingresar un numero, intentalo de nuevo: ")
                        }
                    } while (!tres)
                }
            }
            4.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    radio.cambiarSintonia()
                    println("Cambiado exitosamente a ${radio.sintonia}")
                }
            }
            5.toString()->{
               radio.encenderApagar()
            }
            6.toString()->{
                println("Gracias por utilizar el programa\nAdios.")
                on = false
            }
            else->{
                println("Debe ingresar un numero del 1 al 6.\nIntentelo de nuevo: ")
            }
        }
    }while(on)
}