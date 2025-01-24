
fun main() {
//Jesus Yalam Guzman Villa 233350
    // Practica 1 triangulos
    println("Ingresa el lado 1:")
    val lado1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingresa el lado 2:")
    val lado2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingresa el lado 3:")
    val lado3 = readLine()?.toDoubleOrNull() ?: 0.0


    //Aqui coroboramos si realmente es un triangulo
    if (lado1 > 0 && lado2 > 0 && lado3 > 0 &&
        lado1 + lado2 > lado3 &&
        lado1 + lado3 > lado2 &&
        lado2 + lado3 > lado1
    ) {
        // Identificar el tipo de triángulo
        val tipo = when {
            lado1 == lado2 && lado2 == lado3 -> " es equilatero"
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> "es Isosceles"
            else -> "es Escaleno"
        }
        println("el triangulo : $tipo")
    } else {
        println("Esto no es un triangulo")
    }
}
