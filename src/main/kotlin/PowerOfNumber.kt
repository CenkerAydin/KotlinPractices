import kotlin.math.exp

fun main() {
    //Calculate power of a number without using pow()
    print("Enter the base number: ")
    val base= readLine()!!.toInt()
    print("Enter the exponent number: ")
    var exponent= readLine()!!.toInt()
    var res:Long=1

    while (exponent !=0){
        res *=base.toLong()
        --exponent
    }
    println("Answer: $res")
}