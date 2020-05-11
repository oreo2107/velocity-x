//main.kt to hold main method
package com.firstPackage

fun buildAquarium() {
    val aquarium = Aquarium(numberOfFish = 29)
    aquarium.printSize()
    aquarium.volume = 70
    aquarium.printSize()
}

fun main() {
    buildAquarium()
}