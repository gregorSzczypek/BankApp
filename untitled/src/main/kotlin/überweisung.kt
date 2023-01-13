fun ueberweisung() {

    println("Von welchem Konto soll überwiesen werden?")
    val sender = readln()
    println("An welches Konto soll das Geld überwiesen werden?")
    val empfaenger = readln()
    println("Welcher Betrag soll überwiesen werden?")
    val betrag = readln()

    try {
        betrag.toDouble()
    } catch (e: Exception) {
        println("Der eingegebene Betrag ist ungültig.  Vorgang abgebrochen. Bitte nochmal.")
        ueberweisung()
    }
    if (register[sender] != null && register[empfaenger] != null && register[sender]!! >= betrag.toDouble()) {
        register[sender] = register[sender]!! - betrag.toDouble()
        register[empfaenger] = register[empfaenger]!! + betrag.toDouble()
        println("Neuer Betrag Sender: ${register[sender]} Euro.")
        println("Neuer Betrag Sender: ${register[empfaenger]} Euro.")
    } else if (register[sender] == null) {
        println("Sender nicht gefunden! Vorgang abgebrochen. Bitte nochmal.")
        ueberweisung()
    } else if (register[empfaenger] == null) {
        println("Empfänger nicht gefunden! Vorgang abgebrochen. Bitte nochmal.")
        ueberweisung()
    } else if (register[sender]!! <= betrag.toDouble()) {
        println("Deckung ungenügend! Vorgang abgebrochen.")
        return
    }
}