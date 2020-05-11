package com.firstPackage

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${plecostomus.color}")
}
fun main(){
    makeFish()
}