package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 42
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000
    )
    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 320_000_000)

    println(countryToInhabitants)

    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("France"))
    println(countryToInhabitants.containsValue(20_000_000))

    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }

}