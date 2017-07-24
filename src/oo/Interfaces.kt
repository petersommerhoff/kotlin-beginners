package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color): Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Built a shiny car.")
    }
}

class MotorCycle(val color: String): Driveable {
    override fun drive() {
        println("Driving motorcycle.")
    }
}

fun main(args: Array<String>) {
    val car = Car(Color.GREEN)
    println(car.color)
    car.drive()
    val motorcycle: Driveable = MotorCycle("red")
    motorcycle.drive()
}