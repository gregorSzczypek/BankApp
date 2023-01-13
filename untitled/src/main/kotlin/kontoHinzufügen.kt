fun kontoHinzufuegen() {

    println("Bitte geben Sie den Namen des Kontoinhabers ein:")
    val nameNeuesKonto = readln()
    if (register.contains(nameNeuesKonto)) {
        println("Konto bereits vergeben, Abbruch.")
        return
    } else {
        println("Bitte geben Sie den Kontostand an:")
        try {
            val kontostand = readln().toDouble()
            register[nameNeuesKonto] = kontostand
            println("Konto hinzugefügt!")
        } catch (e: Exception) {
            println("Eingabe ungültig, Vorgang abgebrochen, bitte nochmal oder exit")
            var choice = readln()

            if (choice == "exit") {
                exitFun()
            } else {
                kontoHinzufuegen()
            }
        }
    }
}