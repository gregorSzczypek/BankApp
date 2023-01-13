fun geldAbheben() {

    println("Von welchem Konto soll Geld abgehoben werden?")
    var nameKonto = readln()

    if (!register.contains(nameKonto)) {
        println("Konto nicht gefunden, Vorgang abgeborchen!")
    } else {
        fun abheben() {
            println("Welcher Geldbetrag soll abgehoben werden?")
            println("Kleinster Betrag 5 Euro")
            println("Maximaler Betrag 500 Euro")
            var betrag = readln()
            try {
                betrag.toDouble()
            } catch (e: Exception) {
                println("Eingabe ungültig! Bitte nochmal.")
                abheben()
            }
            if ((betrag.toDouble() % 5).toInt() != 0 || betrag.toDouble() > 500) {
                println("Betrag nicht auszahlbar, bitte anderen Betrag wählen.")
                abheben()
            } else {
                register[nameKonto] = register[nameKonto]!! - betrag.toDouble()
                println("Abheben erfolgreich, neuer Kontostand: ${register[nameKonto]} Euro")
            }
        }
        abheben()
    }
}
