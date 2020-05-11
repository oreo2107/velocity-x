package com.firstPackage

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${plecostomus.color}")
    plecostomus.eat()
}
fun main(){
    makeFish()
}