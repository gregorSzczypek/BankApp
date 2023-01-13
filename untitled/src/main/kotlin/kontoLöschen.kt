fun kontoLoeschen() {

    println("Welches Konto möchten Sie löschen?")
    val kontoLoeschen = readln()
    if (register.contains(kontoLoeschen)) {
        register.remove(kontoLoeschen)
        println("Konto erfolgreich gelöscht")
    } else {
        println("Konto nicht gefunden, bitte nochmal oder exit")
        val choice = readln()
        if (choice == "exit") {
            exitFun()
        } else {
            kontoLoeschen()
        }
    }
}