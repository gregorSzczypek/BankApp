fun geldbetragAnzeigen() {
    if (register.isNotEmpty()) {
        var name = ""
        println("Wessen Kontostand soll angezeigt werden, bitte Namen eingeben:")
        name = readln()
        if (register[name] != null) {
            println("Kontostand $name beträgt ${register[name]} Euro")
        } else {
            println("Der Kunde konnte nicht gefunden werden! Bitte nochmal.")
            geldbetragAnzeigen()
        }
    } else {
        println("Register leer.")
    }
}