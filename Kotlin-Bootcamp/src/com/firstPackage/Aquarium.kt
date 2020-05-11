package com.firstPackage

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    init {
        println("Aquarium initializing")
    }
    var volume: Int
    get() = width*height*length/1000
    //private getter allows only reading of data outside the file
    private set(value){
        height = (value * 1000) / (width * length)
    }
    constructor(numberOfFish: Int): this(){
        //2000L per fish and extra room to prevent spill
        val tank = numberOfFish * 2000 * 1.1
        //using height and width from primary constructor
        height = (tank / (length * width)).toInt()
    }
    fun printSize(){
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm " +
                "Volume: $volume l\n"
                )
    }
}