fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)

    berechnung(fees)

}



fun berechnung(feelist: List<Double>){


    var gebuehren = 0.00
    for (i in 0..feelist.size-1) {
        gebuehren = gebuehren + feelist[i]
    }
    println(gebuehren)







}