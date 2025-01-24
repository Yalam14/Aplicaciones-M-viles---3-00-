fun main (args: Array<String>) {

    //Jesus Yalam Guzman Villa 233350
    // Practica 2 cadebas
    println(verificaCadena("nombre")) // true
    println(verificaCadena("_nombre")) // true
    println(verificaCadena("_12")) // true
    println(verificaCadena("")) // false
    println(verificaCadena("012")) // false
    println(verificaCadena("no$")) // false
}

fun verificaCadena(cadena: String): Boolean {
   //Usamos algo que ya esta
    if (cadena.isEmpty()) return false

  //Aqui recorremos en forma conforme al abecedario y tambien si hay guion bajo
    val primerCarac = cadena[0]
    if (!(primerCarac in 'a'..'z' || primerCarac in 'A'..'Z' || primerCarac == '_')) {
        return false
    }

    // recorremos que el texto sea legible
    for (texto in cadena) {
        if (!(texto in 'a'..'z' || texto in 'A'..'Z' || texto in '0'..'9' || texto== '_')) {
            return false
        }
    }

    return true
}


