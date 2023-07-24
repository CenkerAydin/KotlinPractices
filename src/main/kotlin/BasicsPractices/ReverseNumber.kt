package BasicsPractices

fun main() {
    //Program to reverse a number
    print("Enter the number: ")
    var num= readln().toInt()
    val originalNum=num
    var reverseNum=0
    while (num !=0){
        var digit=num%10
        reverseNum =reverseNum*10 +digit
        num /=10
    }
    println("Reverse number of $originalNum is $reverseNum")
}