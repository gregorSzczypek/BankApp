fun geldEinzahlen() {

    var betrag = ""
    var nameKonto = ""

    println("Auf welches Konto soll eingezahlt werden?")
    nameKonto = readln()
    if (!register.contains(nameKonto)) {
        println("Bitte geben Sie den Betrag an:")
        try {
            betrag = readln()
            register[nameKonto] = betrag.toDouble()
            println("Konto nicht verfügbar, wurde hinzugefügt!")
            println("Aktueller Kontostand: ${register[nameKonto]}")
        } catch (e: Exception) {
            println("Eingabe ungültig, Vorgang abgebrochen, bitte nochmal (Enter) oder exit")
            val choice = readln()
            if (choice == "exit") {
                exitFun()
            } else {
                geldEinzahlen()
            }
        }
    } else {
        println("Bitte geben Sie den Betrag an:")
        try {
            betrag = readln()
            register[nameKonto] = register[nameKonto]!! + betrag.toDouble()
            println("Der Betrag wurde gutgeschrieben.")
            println("Aktueller Kontostand: ${register[nameKonto]}")
        } catch (e: Exception) {
            println("Eingabe ungültig, Vorgang abgebrochen, bitte nochmal (Enter) oder exit")
            val choice = readln()
            if (choice == "exit") {
                exitFun()
            } else {
                geldEinzahlen()
            }
        }
    }
}

