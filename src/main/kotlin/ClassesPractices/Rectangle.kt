package ClassesPractices

class Rectangle(width:Double,height:Double){
    private val mwidth:Double
    private val mHeight=height

    init {
        mwidth=width
        "primary const. created.".print()
        "Width: $width, Height: $height".print()
    }

    constructor(name:String): this(1.0,1.0){
        "1. secondary const. created".print()
    }

    fun getArea():Double{
        return mwidth*mHeight
    }
    fun getPerimeter():Double{
        return 2*(mwidth+mHeight)
    }

}

fun main() {
    val rectangle0=Rectangle(3.0,2.0)
    val area0=rectangle0.getArea()
    val perimeter0=rectangle0.getPerimeter()
    area0.printD()
    perimeter0.printD()

}

fun Double.printD() {
    println(this)
    println("----------")
}

fun String.print(){
    println(this)
    println("-------------")
}