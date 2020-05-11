package com.firstPackage

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    init {
        println("Aquarium initializing")
    }
    open val shape = "Rectangle"
    open var water: Double = 0.0
    get() = volume * 0.9
    open var volume: Int
    get() = width*height*length/1000
    set(value){
        height = (value * 1000) / (width * length)
    }
    constructor(numberOfFish: Int): this(){
        //2000L per fish and extra room to prevent spill
        val tank = numberOfFish * 2000 * 1.1
        //using height and width from primary constructor
        height = (tank / (length * width)).toInt()
    }
    fun printSize(){
        //printing dimensions
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm "
                )
        //printing volume of water in Tank
        println("Volume: $volume l\n" +
                "Water: $water l (${water/volume*100.0}% full)")
    }
}