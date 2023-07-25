package ClassesPractices

class Tv(
    var channel:Int=1,
    var volumeLevel:Int=1,
    var on:Boolean=false
){

    init {
       println("Primary const. created")
    }

    fun turnOn(){
        on=true
    }

    fun turnOff(){
        on=false
    }
    fun UpdateChannel(newChannel:Int){
        if (on && newChannel>=1 && newChannel <=120) {
            channel = newChannel
        }

    }

    fun UpdateVolumeLevel(newVolumeLevel: Int){
        if (on && newVolumeLevel >=1 && newVolumeLevel <=7){
            volumeLevel=newVolumeLevel
        }
    }

}
fun info(tv0: Tv =Tv()){

    println("INFO")
    if (tv0.on){
        println("Tv açık")
    }else{
        println("Tv kapalı")
    }
    println(tv0.channel)
    println(tv0.volumeLevel)
}

fun main() {
    val tv0=Tv()
    tv0.turnOn()
    tv0.UpdateChannel(30)
    tv0.UpdateVolumeLevel(3)
    info(tv0)
}
