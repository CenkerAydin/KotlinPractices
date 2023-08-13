package Exercises1

class Stock(var symbol:String, var name:String){
    var previousClosingPrice:Double?=null
    var currentPrice: Double?=null


    fun getChangePercent(previousClosingPrice:Double, currentPrice:Double):Double{
        this.previousClosingPrice=previousClosingPrice
        this.currentPrice=currentPrice
        val changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100

        return Math.round(changePercent *100.0) / 100.0
    }
}

class Fan{
    val SLOW=1
    val MEDIUM=2
    val FAST=3
    var on=false
    var speed=0
    var radius = 5.0
    var color = "blue"
     constructor()
    constructor( radius: Double, color: String){
        this.radius=radius
        this.color=color
    }

    fun toString(speed:Int, on:Boolean, radius: Double, color: String):String{
        this.speed=speed
        this.on=on
        this.radius=radius
        this.color=color
        return if (on){
             "Fan speed is $speed , color is $color, radius is $radius"
        }else{
            "Fan is off, color is $color, radius is $radius"
        }
    }

}

fun main() {
    val stock=Stock("ORCL","Oracle Corporation")
    println("Stock symbol: ${stock.symbol},Stock Name: ${stock.name}")
    println("The percantage change is ${stock.getChangePercent(34.5,34.35)}")

    var fan=Fan() //Boş constructor ile nesne oluşturduk.
    var fan1=Fan( 5.0,"Blue")

    println("Fan: ${fan.SLOW}")
    println("Fan: ${fan.MEDIUM}")
    println()
}