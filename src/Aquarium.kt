import java.util.* //required import
fun main(args:Array<String>){
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and fish needs $food")
    println("Change Water: ${shouldChangeWater(day,temperature = getTemperatureData())}")
}

fun randomDay() : String {
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String): String{
    return when(day) {
        "Monday" ->  "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" ->  "worms"
        "Thursday" -> "redworms"
        "Friday" -> "mosquito"
        "Saturday" -> "plankton"
        else -> "nothing"
    }
}

fun shouldChangeWater(day: String, temperature: Int = 32, dirty: Int = getDirtySensorRating()): Boolean {
    return when{
        isTooHot(temperature) -> true
        isTooDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun isTooHot(temperature:Int) = temperature > 30
fun isTooDirty(dirty:Int) = dirty > 20
fun isSunday(day: String) = day == "Sunday"
fun getDirtySensorRating() = Random().nextInt(40)
fun getTemperatureData() = Random().nextInt(45)