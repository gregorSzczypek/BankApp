fun registerAnzeigen() {
    println("Folgende Konten sind derzeit angemeldet:\n")
    for (i in 0 until register.keys.size){
        println(register.keys.toList()[i] + " -- " + register.values.toList()[i] + " Euro")
    }
    println("")
}