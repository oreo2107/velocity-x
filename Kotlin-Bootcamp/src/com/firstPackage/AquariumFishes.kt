package com.firstPackage
interface FishAction{
    fun eat()
}
abstract class AquariumFishes {
    abstract val color: String
}
class Shark: AquariumFishes(),FishAction{
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
class Plecostomus: AquariumFishes(),FishAction{
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}