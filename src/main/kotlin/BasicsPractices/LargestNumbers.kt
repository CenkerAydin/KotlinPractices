package BasicsPractices

fun main() {
    //Program to find the largest among three numbers
    print("Enter the num1: ")
    val num1= readLine()!!.toInt()
    print("Enter the num2: ")
    val num2= readLine()!!.toInt()
    print("Enter the num3: ")
    val num3= readLine()!!.toInt()

    val intArray= arrayOf(num1,num2,num3)
    var max=intArray.get(0)
    for (v in intArray){
        if(v>max){
            max=v
        }
    }
    intArray.forEach { i -> print("$i ") }
    println()
    println("$max is the largest number of array")
}