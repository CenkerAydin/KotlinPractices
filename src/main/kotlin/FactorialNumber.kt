fun main() {
    //Find factorial of a number
    print("Enter the number: ")
    val num= readLine()!!.toLong()
    var factorial:Long=1
    for (i in 1..num){
        factorial *=i
    }
    println("Factorial of $num is $factorial")



}