package playground

fun main(args: Array<String>) {
    val vegs = arrayOf("Potatoes", "Carrots", "Cabbage")
    val fruities = arrayOf("Apples", "Oranges", "Bananas")
    val healthyFood = vegs + fruities;
    println(healthyFood.joinToString {it})
    for (item in healthyFood) {
        print(item)
        if (healthyFood.indexOf(item) != healthyFood.size - 1) {
            print(", ")
        }
    }
    println()
    println(healthyFood)
}