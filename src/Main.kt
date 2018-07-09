/**Oliver Graf **/

fun main(args: Array<String>){
    var x:String?
    var on: Boolean = true
    val radio = Radio()
    println("Bienvenido(a) a esta simulacion de una radio.")
    println(radio.toString())
    println(radio.menu())
    do{
        x = readLine()!!

        when(x){
            1.toString()-> {
                println("Actualmente esta sintonizado a ${radio.sintonia}")
                println("Ingrese la nueva estacion siguiendo este formato aaa.b")
                println("aaa = ")
                var aaa: String? = readLine()!!
                println("b = ")
                var b: String? = readLine()!!
                aaa = aaa + (b*0.1)
                radio.cambiarEstacion(aaa.toDouble())

            }
            2.toString()->{
                println("El volumen actual es ${radio.volumen}")

            }
            3.toString()->{

            }
            4.toString()->{

            }
            5.toString()->{
                println("Gracias por utilizar el programa\nAdios.")
                on = false
            }
            else->{

            }
        }
    }while(on)
}