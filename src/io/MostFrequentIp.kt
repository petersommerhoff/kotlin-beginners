package io

import java.io.File

fun main(args: Array<String>) {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Most frequent IP address is $maxIp, which occurred $maxCount times.")

    val arr = arrayOfNulls<Any>(10)
    arr[0] = 2
    println(arr[0])

    val ints = IntArray(10)
    ints[3] = 4
    println(ints)
}