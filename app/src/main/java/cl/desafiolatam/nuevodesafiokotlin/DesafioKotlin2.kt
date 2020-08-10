package cl.desafiolatam.nuevodesafiokotlin

fun main() {
    val nombres = "Jaime"
    var apellidos = "Gonzalez"
    var edades = 41
    println(" Mi Nombre es :$nombres $apellidos")

    var a = 10
    val b = 20
    val c = 30
    var resultado = a + b + c
    println(resultado)

    val nombre: String
    var vocal: Char
    nombre = "Arataka Reigen"
    vocal = 'A'
    println(nombre.length)
    vocal = 'E'

    val flotante: Float = 10F

    val byteMaximo = Byte.MAX_VALUE
    val shortMaximo = Short.MAX_VALUE
    println("el valor maximo de un byte es $byteMaximo")
    println("el valor maximo de una variable short es $shortMaximo")

    val intMinimo = Int.MIN_VALUE
    val longMinimo = Long.MIN_VALUE
    println("el valor minimo que puede almacenar la variable int es $intMinimo")
    println("el valor minimo que puede almacenar la variable long  es $longMinimo")

    val y: Boolean = false
    println("el valor de la variable booleana es $y")


    imprimiendoParametros()
    calcularIva()
}


fun imprimiendoParametros(a: String = "hola", b: String = "adios") {
    println("la suma de los parametros es ${a.length + b.length}")
}


fun calcularIva() {
    var valor:Float = 1000F
    val iva : Float= 0.19F
    var total: Float = valor * iva
    println("el iva de $valor es $total")
}







