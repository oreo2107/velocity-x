//main.kt to hold main method
package com.firstPackage

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    //using Kotlin's setter method to set height value
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}