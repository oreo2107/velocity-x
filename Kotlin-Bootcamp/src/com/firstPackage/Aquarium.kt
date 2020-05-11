package com.firstPackage
import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40){
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
    fun printSize(){
        //printing shape
        println(shape)
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
class TowerTank(override var height: Int, var diameter: Int): Aquarium(height=height, width=diameter, length=diameter){
    override var volume: Int
    //elliptical area = π * r1 * r2
    get() = (width/2 * length/2 * height/1000 * PI).toInt()
    set(value){
        height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
    }
    override var water = volume * 0.8
    override val shape = "Cylinder"
}