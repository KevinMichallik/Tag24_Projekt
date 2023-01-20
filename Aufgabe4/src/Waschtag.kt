fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    val rot = mutableListOf<String>()
    val blau = mutableListOf<String>()

    for (farbe in 0 until shirts.size) {

        if (shirts[farbe] == "rot") {
            rot.add("rot")
        }
        if (shirts[farbe] == "blau")
            blau.add("blau")
    }

    println("Es gibt ${rot.size} rote Shirts.")
    println("Es gibt ${blau.size} blaue Shirts.")

}