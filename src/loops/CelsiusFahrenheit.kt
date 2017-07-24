package loops

fun main(args: Array<String>) {
    // Fahrenheit = 1.8 * Celsius + 32
    var fahrenheit = 0.0
    for (celsius in 0..20) {
        fahrenheit = 1.8 * celsius + 32
        println("$celsius°C \t= $fahrenheit°F")
    }
}