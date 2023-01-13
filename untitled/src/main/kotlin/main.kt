val register = mutableMapOf<String, Double>(
    "franz" to 1234.00,
    "Gerd" to 2000.00,
    "Lisa" to 12000.00,
    "Karina" to 23.00,
    "Jan" to -1234.00,
    "Ari" to 7890.00,
)

fun main() {

    println("Willkommen zur Bank!")

    while (true) {
        println("Was möchten Sie erledigen?")
        println("1 - Kontostand anzeigen")
        println("2 - Konto hinzufügen")
        println("3 - Konto löschen")
        println("4 - Geld abheben")

        println("exit - Programm beenden")
        val choice = readln()

        when(choice){
            "1" -> {geldbetragAnzeigen()}
            "2" -> {kontoHinzufuegen()}
            "3" -> {kontoLoeschen()}
            "4" -> {geldAbheben()}

            "exit" -> {exitFun()}
        }
    }
}