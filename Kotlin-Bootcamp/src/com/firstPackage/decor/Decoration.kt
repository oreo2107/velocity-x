package com.firstPackage.decor

data class Decoration(val rocks: String) {

}
fun makeDecorations(){
    val dec1 = Decoration("Granite")
    println(dec1)
    val dec2 = Decoration("slate")
    println(dec2)
    val dec3 = Decoration("slate")
    println(dec3)
}
fun main(){
    makeDecorations()
}