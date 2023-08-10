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

}