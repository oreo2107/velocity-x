package com.firstPackage

abstract class AquariumFishes {
    abstract val color: String
}
class Shark: AquariumFishes(){
    override val color = "grey"
}
class Plecostomus: AquariumFishes(){
    override val color = "gold"
}