package oo

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {
    // 0..9 -> 2137 (decimal)
    // 0..9,A,B,C,D,E,F -> 0x10
    println(0x10) // 16
    println(0x1F) // 31
    println(0xFF) // 255
    println(0xCAFEBABE)

    println(0x000000)  // black
    println(0xFFFFFF)  // white
    println(0xFF0000)  // red
    println(0x00FF00)  // green
    println(0x0000FF)  // blue
    println(0x000088)  // dark blue

    // binary numbers
    // 0..1 -> 0b1010 = 10
    println(0b1010)
    println(0b00001010)
    println(0b11111111 == 0xFF)  // = 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 1 == 0
    // 0 and 0 == 0
    //     1101
    // and 1011
    // ----------
    //   = 1001
    println(0b1101 and 0b1011)

    // 0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    // bitwise operators
    //    1101
    // or 1000
    //  = 1101
    println(0b1101 or 0b1000)  // 13

    //     1101
    // xor 1000
    //   = 0101
    println(0b1101 xor 0b1000)  // 5

    // inverse
    // 0b10011.inv() == 0b...01100
    // 0x0000001F == 0b00...0011111
    println(0b10011.inv() and 0x0000001F)  // 0b01100
}












