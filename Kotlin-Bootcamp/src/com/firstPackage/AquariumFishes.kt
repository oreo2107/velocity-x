package com.firstPackage
interface FishAction{
    fun eat()
}
interface FishColor{
    var color: String
}
class Shark: FishColor,FishAction{
    override var color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
//interface delegation by overriding a specific property using object
class Plecostomus: FishColor by GoldColor,FishAction{
    override fun eat() {
        println("eat algae")
    }
}
object GoldColor: FishColor {
    override var color = "gold"
}