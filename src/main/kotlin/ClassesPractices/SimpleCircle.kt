package ClassesPractices

class SimpleCircle( radius:Double) {
    private val mRadius:Double
    val pi=3.14
    init {
        mRadius=radius
        println("Primary const. created")
        println("Radius :$radius")
    }

    constructor(name:String):this(6.7){
        println("Secondary const. created")
        println("Name: $name, Radius: $mRadius")
    }

    fun getArea():Double{
        return 2*pi*mRadius*mRadius
    }

    fun getPerimeter():Double{
        return 2*pi*mRadius
    }
}

fun main() {
    val c1=SimpleCircle(4.5)
    val area1=c1.getArea()
    val perimeter1=c1.getPerimeter()
    println("Area of circle: $area1")
    println("Perimeter of circle: $perimeter1")
    println()

    val c2=SimpleCircle("Kotlin")
}