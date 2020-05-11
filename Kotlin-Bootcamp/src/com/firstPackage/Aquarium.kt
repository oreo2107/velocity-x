package com.firstPackage

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    fun printSize(){
        println("Width: $width cm\n" +
                "Height: $height cm\n" +
                "Length: $length cm\n"
                )
    }
}