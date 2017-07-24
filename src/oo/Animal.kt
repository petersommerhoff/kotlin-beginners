package oo

open class Animal {
    private var age: Int = 0
    protected var name = "Sam"
    internal val isDangerous = true

    public fun isOld(): Boolean {
        return age > 12
    }
}

class Vertebrate : Animal() {

    fun introduceYourself() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Animal()

}
