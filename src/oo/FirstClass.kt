package oo

import java.util.*

class SomePerson(val name: String, var age: Int) {

    private var likedColor = ""
        private set

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

fun main(args: Array<String>) {
    val person = SomePerson("Jack", 17)
    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    val array = arrayOf(1,2,3)
    println(array)

    var immutableList = listOf(1,2,3)
    immutableList = listOf(4,5,6)
    var mutableList = mutableListOf(1,2,3)
    mutableList.add(4)
    mutableList = mutableListOf(4,5,6)

    val immutableList2 = listOf(1,2,3)
    val mutableList2 = mutableListOf(1,2,3)
    mutableList2.add(4)

    println(person.name)
    println(person.age)
}