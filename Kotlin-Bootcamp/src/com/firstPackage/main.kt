//main.kt to hold main method
package com.firstPackage

fun buildAquarium() {
    val aquarium = Aquarium(numberOfFish = 29)
    aquarium.printSize()
    println("Volume: ${aquarium.width * aquarium.length * aquarium.height / 1000} l")
}

fun main() {
    buildAquarium()
}