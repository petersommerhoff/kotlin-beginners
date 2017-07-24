package io

import java.io.File

fun main(args: Array<String>) {

    var lineNumber = 0
    File("src/inputfile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}
