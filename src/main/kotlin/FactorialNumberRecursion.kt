fun main() {
    print("Enter the number: ")
    val num= readLine()!!.toInt()
    println("Factorial of $num is: ${fact(num)}")
}

fun fact(number:Int):Long{
    return number *fact(number-1)
}