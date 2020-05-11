//main.kt to hold main method
package com.firstPackage

fun buildAquarium() {
    val aquarium = Aquarium(length = 25, width = 25, height = 40)
    aquarium.printSize()
}

fun main() {
    buildAquarium()
}