fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)

    for (i in 0..numbers.size - 1)

        numbers[i] = (numbers[i] * 3.0)
    println(numbers)


}
