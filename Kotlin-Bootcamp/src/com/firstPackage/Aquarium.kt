package com.firstPackage

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize(){
        println("Width: $width cm\n" +
                "Height: $height cm\n" +
                "Length: $length cm"
                )
    }
}